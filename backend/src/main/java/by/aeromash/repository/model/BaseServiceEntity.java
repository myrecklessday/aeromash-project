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
@MappedSuperclass
public abstract class BaseServiceEntity {

    @Id @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "Title", nullable = false)
    private String title;

    @Column(name = "Description", nullable = false)
    private String description;

    @Column(name = "ImageLink")
    private String imageLink;

    @ManyToOne
    @JoinColumn(name = "CategoryId")
    private CategoryEntity category;
}
