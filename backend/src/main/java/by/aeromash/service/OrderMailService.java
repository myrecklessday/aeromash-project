package by.aeromash.service;

import by.aeromash.repository.model.OrderEntity;
import by.aeromash.repository.model.ProductOrderEntity;
import by.aeromash.repository.model.ServiceOrderEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

/**
 * @author bitreight
 */
@Service
public class OrderMailService {

//    @Value("${mail.default.from}")
//    private String sendFrom;
    @Value("${mail.default.to}")
    private String sendTo;
    @Value("${mail.default.subject}")
    private String subject;

    @Autowired
    private MailSender mailSender;

    public void sendOrderMail(OrderEntity order) {
        if (order == null) {
            throw new RuntimeException("Can't send message with empty order.");
        }

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(sendTo);
        message.setSubject(subject);
        message.setText(prepareMessageText(order));

        mailSender.send(message);
    }

    private String prepareMessageText(OrderEntity order) {
        String orderType = null, productName = null;
        if (order instanceof ServiceOrderEntity) {
            orderType = "услуга";
            productName = ((ServiceOrderEntity) order).getService().getTitle();

        } else {
            orderType = "продукция";
            productName = ((ProductOrderEntity) order).getProduct().getTitle();
        }

        return
            "Данные клиента:\n" +
            "ФИО: " + (StringUtils.isBlank(order.getCustomerName()) ? "Не указано" : order.getCustomerName()) + "\n" +
            "Телефон: " + (StringUtils.isBlank(order.getPhone()) ? "Не указан" : order.getPhone()) + "\n" +
            "Почтовый адрес: " + (StringUtils.isBlank(order.getEmail()) ? "Не указан" : order.getEmail()) + "\n" +

            "\nДанные о заказе:\n" +
            "Тип заказа: " + orderType + "\n" +
            "Наименование: " + productName;
    }
}
