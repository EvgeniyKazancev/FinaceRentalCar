package ru.app.financerentalcar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ru.app.financerentalcar.response.ResponseMessage;
import ru.app.financerentalcar.services.OwnerServices;

import java.util.List;

@RestController
@RequestMapping("/owner")
public class OwnerController {
    private final OwnerServices ownerServices;

    @Autowired
    public OwnerController(OwnerServices ownerServices) {
        this.ownerServices = ownerServices;
    }

    @GetMapping("/getId")
    public Object getOwner(@RequestParam Long passportId) {

        return ownerServices.getPersonId(passportId);
    }

    @GetMapping("/getAll")
    public List<Object> getOwner() {
        return ownerServices.getAllPerson();
    }

    @PutMapping("/addOwner")
    public ResponseMessage newOwner(@RequestParam Long passportId, @RequestParam String firstName, @RequestParam String lastName, @RequestParam Long phoneNumber, @RequestParam String email) {
        return ownerServices.addPerson(passportId, firstName, lastName, phoneNumber, email);
    }

    @Transactional
    @DeleteMapping("/delOwner")
    public ResponseMessage deleteOwner(@RequestParam Long passportId) {
        return ownerServices.deletePerson(passportId);
    }
}
