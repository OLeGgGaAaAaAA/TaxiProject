package repository;
import entity.Driver;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;

public interface DriverRegistrationRepository extends CrudRepository<Driver, UUID> {
    Driver findByName (String name);
    Driver findBySurname (String surname);
    Driver findByCity (String city);
    Driver findByEmail (String email);
    Driver findByLogin (String login);
}
