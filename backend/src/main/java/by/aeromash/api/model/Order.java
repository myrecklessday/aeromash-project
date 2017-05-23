package by.aeromash.api.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author bitreight
 */
@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
abstract class Order {
    private String customerName;
    private String phone;
    private String email;
}
