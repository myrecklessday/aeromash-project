package by.aeromash.repository.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author bitreight
 */
@Data
@Entity
@Table(name = "Category")
public class CategoryEntity {

    @Id @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "Title", nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "ParentCategoryId")
    private CategoryEntity parentCategory;

    @Column(name = "Type", nullable = false)
    @Enumerated(EnumType.STRING)
    private CategoryType type;

    public enum CategoryType {
        PRODUCT, SERVICE
    }
}
