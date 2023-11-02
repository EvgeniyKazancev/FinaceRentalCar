package ru.app.financerentalcar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.app.financerentalcar.entity.Owner;
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
    public Owner getOwner(@RequestParam Long passportId){

        return ownerServices.getOwner(passportId);
    }
    @GetMapping("/getAll")
    public List<Owner> getOwner( ){

        return ownerServices.getAllOwner();
    }
    @PutMapping("/addOwner")
    public ResponseMessage newOwner(@RequestParam Long passportId, @RequestParam String firstName, @RequestParam String lastName, @RequestParam Long phoneNumber, @RequestParam String email ){
        return ownerServices.addOwner(passportId,firstName,lastName,phoneNumber,email);
    }
}
