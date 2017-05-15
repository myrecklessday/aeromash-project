package by.aeromash.repository.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author bitreight
 */
@Data
@Entity
@Table(name = "\"Order\"")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "OrderType")
public abstract class OrderEntity {

    @Id @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "CustomerName", nullable = false)
    private String customerName;

    @Column(name = "Phone", nullable = false)
    private String phone;

    @Column(name = "Email", nullable = false)
    private String email;
}
