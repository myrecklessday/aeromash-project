package by.aeromash.repository.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author bitreight
 */
@Data
@EqualsAndHashCode(exclude = "imageLink")
@ToString(exclude = "imageLink")
@Entity
@Table(name = "News")
public class NewsEntity {

    @Id @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "Title", nullable = false)
    private String title;

    @Column(name = "Description", nullable = false)
    private String description;

    @Column(name = "ImageLink")
    private String imageLink;

    @Column(name = "Date", nullable = false)
    private Date date;
}
