package by.aeromash.repository;

import by.aeromash.repository.model.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author bitreight
 */
@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Long> {
}
