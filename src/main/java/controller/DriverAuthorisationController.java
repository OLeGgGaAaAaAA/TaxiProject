package controller;
import entity.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import repository.DriverAuthorisationRepository;
import request.DriverLoginRequest;
import request.DriverRegistrationRequest;
import response.DriverLoginResponse;
import response.DriverRegistrationResponse;

@Controller
public class DriverAuthorisationController {
    private DriverAuthorisationRepository driverAuthorisationRepository;

    @Autowired
    public DriverAuthorisationController(DriverAuthorisationRepository driverAuthorisationRepository) {
        this.driverAuthorisationRepository = driverAuthorisationRepository;

    }

    @PostMapping(path = "/login")
    @ResponseBody
    public DriverLoginResponse login(DriverLoginRequest request) {
        DriverLoginResponse response = new DriverLoginResponse();
        Driver driverByLogin = driverAuthorisationRepository.findByLogin(request.getLogin());
        if (driverByLogin != null) {
            if (driverByLogin.getPassword().equals(request.getPassword())) {
                response.setUuid(driverByLogin.getId());

            }
        }
        return response;
    }

    @PostMapping(path = "/registration")
    @ResponseBody
    public DriverRegistrationResponse registration(DriverRegistrationRequest request) {
        DriverRegistrationResponse response = new DriverRegistrationResponse();
        Driver driverByEmail = driverAuthorisationRepository.findByEmail(request.getEmail());
        Driver driverByLogin = driverAuthorisationRepository.findByLogin(request.getLogin());
        if (driverByEmail.equals(null) && driverByLogin.equals(null)) {
            Driver newDriver = new Driver(request.getCity(), request.getEmail(), request.getLogin(), request.getName(), request.getPassword());
            driverAuthorisationRepository.save(newDriver);
            response.setSuccessful(true);

        } else {
            response.setSuccessful(false);
        }
        return response;
    }
}













