package controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import repository.DriverAuthorisationRepository;

@Controller
public class DriverAuthorisationController {
    private DriverAuthorisationRepository driverAuthorisationRepository;

    @Autowired
    public DriverAuthorisationController (DriverAuthorisationRepository driverAuthorisationRepository) {
        this.driverAuthorisationRepository = driverAuthorisationRepository;
    }

}



