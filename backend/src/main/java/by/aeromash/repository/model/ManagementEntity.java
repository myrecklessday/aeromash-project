package by.aeromash.repository.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author bitreight
 */
@Data
@EqualsAndHashCode(exclude = {"id", "imageLink"})
@ToString
@Entity
@Table(name = "Management")
public class ManagementEntity {

    @Id @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "FirstName", nullable = false)
    private String firstName;

    @Column(name = "LastName", nullable = false)
    private String lastName;

    @Column(name = "Patronymic", nullable = false)
    private String patronymic;

    @Column(name = "Description", nullable = false)
    private String description;

    @Column(name = "ImageLink")
    private String imageLink;
}
