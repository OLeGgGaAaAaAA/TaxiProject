package controller;
import entity.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import repository.DriverRegistrationRepository;
import request.DriverRegistrationRequest;
import response.DriverRegistrationResponse;


@Controller
public class DriverRegistrationController {
    private DriverRegistrationRepository driverRegistrationRepository;

    @Autowired
    public DriverRegistrationController(DriverRegistrationRepository driverRegistrationRepository) {
        this.driverRegistrationRepository = driverRegistrationRepository;

    }


    @PostMapping(path = "/registration")
    @ResponseBody
    public DriverRegistrationResponse registration(DriverRegistrationRequest request) {
        DriverRegistrationResponse response = new DriverRegistrationResponse();
        Driver driverByName = driverRegistrationRepository.findByName(request.getName());
        Driver driverBySurname = driverRegistrationRepository.findBySurname(request.getSurname());
        Driver driverByCity = driverRegistrationRepository.findByCity(request.getCity());
        Driver driverByEmail = driverRegistrationRepository.findByEmail(request.getEmail());
        Driver driverByLogin = driverRegistrationRepository.findByLogin(request.getLogin());
       if(driverByName == null && driverBySurname == null && driverByCity == null && driverByEmail == null && driverByLogin == null){
            Driver newDriver = new Driver(request.getCity(), request.getEmail(), request.getLogin(), request.getName(), request.getPassword(), request.getSurname());
            driverRegistrationRepository.save(newDriver);
            response.setSuccessful(true);

        } else {
            response.setSuccessful(false);
        }
        return response;
    }
}













