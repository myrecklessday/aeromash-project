package by.aeromash.repository;

import by.aeromash.repository.model.ServiceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author bitreight
 */
@Repository
public interface ServiceRepository extends CrudRepository<ServiceEntity, Long> {
}
