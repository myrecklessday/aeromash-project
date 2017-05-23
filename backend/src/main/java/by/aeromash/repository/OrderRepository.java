package by.aeromash.repository;

import by.aeromash.repository.model.OrderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author bitreight
 */
@Repository
public interface OrderRepository<T extends OrderEntity> extends CrudRepository<T, Long> {
}
