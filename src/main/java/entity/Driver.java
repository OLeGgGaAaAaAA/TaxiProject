package entity;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name = "driver")
public class Driver {
    private String name;
    private String city;
    private String login;
    private String password;
    private UUID id;
    private String email;

    public Driver() {
        }

    public Driver(String city, String email, String login, String name, String password) {
        this.city = city;
        this.email = email;
        this.login = login;
        this.name = name;
        this.password = password;

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

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String email) {
        this.city =city;
    }
}
