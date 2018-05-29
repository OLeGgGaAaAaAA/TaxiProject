package request;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class OrderRequest {
    private Instant time;
    private String departureAddress;
    private String arrivalAddress;
    private float cost;
    private String phoneNumber;
    private String name;
}
