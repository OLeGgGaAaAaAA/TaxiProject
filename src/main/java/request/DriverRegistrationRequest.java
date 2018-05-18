package request;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class DriverRegistrationRequest {
    private String name;
    private String city;
    private String login;
    private String password;
    private String email;
    private String surname;
}
