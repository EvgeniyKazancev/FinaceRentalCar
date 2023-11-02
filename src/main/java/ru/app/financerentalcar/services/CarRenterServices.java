package ru.app.financerentalcar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.app.financerentalcar.repository.CarRenterRepository;
import ru.app.financerentalcar.response.ResponseMessage;
import ru.app.financerentalcar.services.interfacePerson.PersonCommonInt;

import java.util.List;

@Service
public class CarRenterServices implements PersonCommonInt {

    private final CarRenterRepository carRenterRepository;

    @Autowired
    public CarRenterServices(CarRenterRepository carRenterRepository) {
        this.carRenterRepository = carRenterRepository;
    }

    @Override
    public List<Object> getAllPerson() {

        return null;
    }

    @Override
    public Object getPersonId(Long passportId) {
        return null;
    }

    @Override
    public ResponseMessage addPerson(Long passportId, String firstName, String lastName, Long phoneNumber, String email) {
        return null;
    }

    @Override

    public ResponseMessage deletePerson(Long passportId) {
        return new ResponseMessage("Арендатор успешно удален");
    }
}
