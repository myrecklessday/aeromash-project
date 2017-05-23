package by.aeromash.mapper;

import by.aeromash.api.model.ProductOrder;
import by.aeromash.api.model.ServiceOrder;
import by.aeromash.repository.model.ProductOrderEntity;
import by.aeromash.repository.model.ServiceOrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author bitreight
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderMapper {

    ProductOrderEntity toProductOrderEntity(ProductOrder productOrder);
    ServiceOrderEntity toServiceOrderEntity(ServiceOrder serviceOrder);
}
