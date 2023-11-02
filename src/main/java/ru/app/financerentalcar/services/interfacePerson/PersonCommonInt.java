package ru.app.financerentalcar.services.interfacePerson;

import ru.app.financerentalcar.response.ResponseMessage;

import java.util.List;

public interface PersonCommonInt {
     List<Object> getAllPerson();
     Object getPersonId(Long passportId);
     ResponseMessage addPerson(Long passportId, String firstName, String lastName, Long phoneNumber, String email);
     ResponseMessage deletePerson(Long passportId);
}
