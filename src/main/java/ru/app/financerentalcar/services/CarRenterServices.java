package ru.app.financerentalcar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.app.financerentalcar.entity.CarRenter;
import ru.app.financerentalcar.repository.CarRenterRepository;
import ru.app.financerentalcar.response.ResponseMessage;
import ru.app.financerentalcar.services.interfacePerson.PersonCommonInt;

import java.util.Collections;
import java.util.List;

@Service
public class CarRenterServices implements PersonCommonInt {

    private final CarRenterRepository carRenterRepository;


    public CarRenterServices(CarRenterRepository carRenterRepository) {
        this.carRenterRepository = carRenterRepository;
    }

    @Override
    public List<Object> getAllPerson() {

        return Collections.singletonList(carRenterRepository.findAll());
    }

    @Override
    public Object getPersonId(Long passportId) {
        return carRenterRepository.findByPassportRenterId(passportId);
    }

    @Override
    public ResponseMessage addPerson(Long passportRenterId, String firstName, String lastName, Long phoneNumber, String email) {
        CarRenter carRenter = new CarRenter();
        carRenter.setPassportRenterId(passportRenterId);
        carRenter.setFirstName(firstName);
        carRenter.setLastName(lastName);
        carRenter.setPhoneNumber(phoneNumber);
        carRenter.setEmail(email);
        carRenterRepository.save(carRenter);
        return new ResponseMessage("Новый арендатор успешно создан");
    }

    @Override

    public ResponseMessage deletePerson(Long passportRenterId) {
        carRenterRepository.deleteById(passportRenterId);
        return new ResponseMessage("Арендатор успешно удален");
    }
}
