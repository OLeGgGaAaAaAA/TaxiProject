package entity;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.time.Instant;
import java.util.UUID;


@Entity
@Table(name = "order")
public class Order {
    private Instant time;
    private String departureAddress;
    private String arrivalAddress;
    private float cost;
    private UUID id;

    public Order() {
    }

    public Order( Instant time, String departureAddress, String arrivalAddress, int cost) {
        this.cost = cost;
        this.departureAddress = departureAddress;
        this.time = time;
        this.arrivalAddress = arrivalAddress;
    }

    @Id
    @GenericGenerator(name = "uuid-gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid-gen")

    @Column(name = "id")
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Column(name = "time")
    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    @Column(name = "departureAddress")
    public String getDepartureAddress() {
        return departureAddress;
    }

    public void setDepartureAddress(String departureAddress) {
        this.departureAddress = departureAddress;
    }

    @Column(name = "arrivalAddress")
    public String getArrivalAddress() {
        return arrivalAddress;
    }

    public void setArrivalAddress(String login) {
        this.arrivalAddress = arrivalAddress;
    }

    @Column(name = "cost")
    public float getCost() {
        return cost;
    }

    public void setCost(int time) {
        this.cost = cost;
    }

}
