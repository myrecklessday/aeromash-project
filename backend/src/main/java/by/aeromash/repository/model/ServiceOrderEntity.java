package by.aeromash.repository.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author bitreight
 */
@Data
@EqualsAndHashCode(callSuper = true, exclude = "service")
@ToString(callSuper = true)
@Entity
@DiscriminatorValue("SERVICE")
public class ServiceOrderEntity extends OrderEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ServiceId")
    private ServiceEntity service;
}
