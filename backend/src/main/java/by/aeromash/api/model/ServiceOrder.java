package by.aeromash.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author bitreight
 */
@Data
public class ServiceOrder extends Order {

    private Long serviceId;

    @JsonCreator
    public ServiceOrder(@JsonProperty(value = "customerName") String customerName,
                        @JsonProperty(value = "phone") String phone,
                        @JsonProperty(value = "email") String email,
                        @JsonProperty(value = "serviceId", required = true) Long serviceId) {
        super(customerName, phone, email);
        this.serviceId = serviceId;
    }
}
