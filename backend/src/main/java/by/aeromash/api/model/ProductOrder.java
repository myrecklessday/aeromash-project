package by.aeromash.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author bitreight
 */
@Data
public class ProductOrder extends Order {

    private Long productId;

    @JsonCreator
    public ProductOrder(@JsonProperty(value = "customerName") String customerName,
                        @JsonProperty(value = "phone") String phone,
                        @JsonProperty(value = "email") String email,
                        @JsonProperty(value = "productId", required = true) Long productId) {
        super(customerName, phone, email);
        this.productId = productId;
    }
}
