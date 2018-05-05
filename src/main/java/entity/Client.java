package entity;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name = "client")
public class Client {
    private int phoneNumber;
    private String name;
    private UUID id;

    public Client() {
    }

    public Client(int phoneNumber,String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
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

    @Column(name = "phoneNumber")
    public int getPhoneNumber() {return phoneNumber;}

    public void setPhoneNumber(int phoneNumber) {this.phoneNumber = phoneNumber;}

    @Column(name = "name")
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

}
