package by.aeromash.api;

import by.aeromash.api.model.ProductOrder;
import by.aeromash.api.model.ServiceOrder;
import by.aeromash.mapper.OrderMapper;
import by.aeromash.repository.OrderRepository;
import by.aeromash.repository.ProductRepository;
import by.aeromash.repository.ServiceRepository;
import by.aeromash.repository.model.ProductEntity;
import by.aeromash.repository.model.ProductOrderEntity;
import by.aeromash.repository.model.ServiceEntity;
import by.aeromash.repository.model.ServiceOrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bitreight
 */
@RestController
@RequestMapping("/order")
public class OrderRest {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ServiceRepository serviceRepository;
    @Autowired
    private OrderRepository<ProductOrderEntity> productOrderRepository;
    @Autowired
    private OrderRepository<ServiceOrderEntity> serviceOrderRepository;
    @Autowired
    private OrderMapper orderMapper;

    @PostMapping("/product")
    public void createProductOrder(@RequestBody ProductOrder order) {
        ProductEntity product = productRepository.findOne(order.getProductId());
        ProductOrderEntity productOrder = orderMapper.toProductOrderEntity(order);
        productOrder.setProduct(product);

        productOrderRepository.save(productOrder);
    }

    @PostMapping("/service")
    public void createServiceOrder(@RequestBody ServiceOrder order) {
        ServiceEntity service = serviceRepository.findOne(order.getServiceId());
        ServiceOrderEntity serviceOrder = orderMapper.toServiceOrderEntity(order);
        serviceOrder.setService(service);

        serviceOrderRepository.save(serviceOrder);
    }
}
