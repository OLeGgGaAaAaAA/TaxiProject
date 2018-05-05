package repository;
import entity.Driver;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;

public interface DriverAuthorisationRepository extends CrudRepository<Driver, UUID> {
    Driver findByEmail (String email);
    Driver findByLogin (String login);

}
