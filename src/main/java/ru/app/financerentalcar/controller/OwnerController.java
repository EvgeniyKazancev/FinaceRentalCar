package ru.app.financerentalcar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.app.financerentalcar.entity.Owner;
import ru.app.financerentalcar.services.OwnerServices;

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
}
