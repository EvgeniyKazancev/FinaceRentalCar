package ru.app.financerentalcar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ru.app.financerentalcar.entity.CarRenter;
import ru.app.financerentalcar.response.ResponseMessage;
import ru.app.financerentalcar.services.CarRenterServices;

import java.util.List;

@RestController
@RequestMapping("/renter")
public class CarRenterController {
    private final CarRenterServices carRenterServices;

    @Autowired
    public CarRenterController(CarRenterServices carRenterServices) {
        this.carRenterServices = carRenterServices;
    }
    @GetMapping("/rentId")
    public Object getRenterCarId(Long passportId) {
        Object renter = carRenterServices.getPersonId(passportId);
        return renter;
    }
    @GetMapping("/rentAll")
    public List<Object> getAllRenter() {
       List<Object> renterList = carRenterServices.getAllPerson();
        return renterList;
    }

    @PutMapping("/addRent")

    public ResponseMessage newRenter(@RequestParam Long passportRenterId, @RequestParam String firstName, @RequestParam String lastName, @RequestParam Long phoneNumber, @RequestParam String email){
        return carRenterServices.addPerson(passportRenterId,firstName,lastName,phoneNumber,email);
    }
    @DeleteMapping("/delRent")
    public ResponseMessage deleteRenter(@RequestParam Long passportId){
        return carRenterServices.deletePerson(passportId);
    }


}
