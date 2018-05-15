package repository;
import entity.Order;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;

public interface OrderRepository extends CrudRepository<Order, UUID> {
}