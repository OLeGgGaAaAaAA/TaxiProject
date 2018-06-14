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
    private int phoneNumber;
    private String name;
    private UUID id;


    public Order(String name, String phoneNumber, Instant time, String departureAddress, String arrivalAddress, float cost) {
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
    public void setArrivalAddress(String arrivalAddress) {this.arrivalAddress = arrivalAddress;}


    @Column(name = "cost")
    public float getCost() { return cost; }
    public void setCost(int time) { this.cost = cost; }

    @Column(name = "phoneNumber")
    public int getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(int phoneNumber) {this.phoneNumber = phoneNumber;}


    @Column(name = "name")
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}
