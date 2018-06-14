package repository;
import entity.Order;
import org.springframework.data.repository.CrudRepository;

import java.time.Instant;
import java.util.UUID;

public interface OrderRepository extends CrudRepository<Order, UUID> {
    Order findByPhoneNumber (int phoneNumber);
    Order findByName (String name);
    Order findByTime (Instant time);
    Order findByDepartureAddress (String departureAddress);
    Order findByArrivalAddress (String arrivalAddress);
    Order findByCost (float cost);
}
