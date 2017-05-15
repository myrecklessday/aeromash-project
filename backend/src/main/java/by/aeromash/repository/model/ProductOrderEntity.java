package by.aeromash.repository.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author bitreight
 */
@Data
@EqualsAndHashCode(callSuper = true, exclude = "product")
@ToString(callSuper = true, exclude = "product")
@Entity
@DiscriminatorValue("PRODUCT")
public class ProductOrderEntity extends OrderEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductId")
    private ProductEntity product;
}
