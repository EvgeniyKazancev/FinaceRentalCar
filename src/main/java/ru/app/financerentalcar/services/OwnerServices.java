package ru.app.financerentalcar.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import ru.app.financerentalcar.entity.Owner;
import ru.app.financerentalcar.repository.OwnerRepository;
import ru.app.financerentalcar.response.ResponseMessage;
import ru.app.financerentalcar.services.interfacePerson.PersonCommonInt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class OwnerServices implements PersonCommonInt {
    private final OwnerRepository ownerRepository;


    public OwnerServices(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public List<Object> getAllPerson() {
        List<Object> ownerList = new ArrayList<>();
        return ownerList = Collections.singletonList(ownerRepository.findAll());

    }

    @Override
    public Object getPersonId(Long passportId) {
        Object owner = ownerRepository.findByPassportId(passportId).orElseThrow(() -> new EntityNotFoundException("Пользователя с таким Id нет!"));
        return owner;
    }

    @Override
    public ResponseMessage addPerson(Long passportId, String firstName, String lastName, Long phoneNumber, String email) {
        Owner owner = new Owner();
        owner.setPassportId(passportId);
        owner.setFirstName(firstName);
        owner.setLastName(lastName);
        owner.setPhoneNumber(phoneNumber);
        owner.setEmail(email);
        ownerRepository.save(owner);
        return new ResponseMessage("Создан новый собственник");

    }

    @Override
    public ResponseMessage deletePerson(Long passportId) {
       ownerRepository.deleteOwnerByPassportId(passportId);
        return new ResponseMessage("Собственник успешно удален") ;
    }
//     public List<Owner> getAllOwner(){
//        List<Owner> ownerList = new ArrayList<>();
//        return ownerList = ownerRepository.findAll();
//     }
//    public Owner getOwner(Long passportId){
//       Owner owner = ownerRepository.findByPassportId(passportId).orElseThrow(() -> new EntityNotFoundException("Пользователя с таким Id нет!"));
//        return owner;
//    }
//
//    public  ResponseMessage addOwner(Long passportId,String firstName,String lastName,Long phoneNumber,String email){
//             Owner owner = new Owner();
//             owner.setPassportId(passportId);
//             owner.setFirstName(firstName);
//             owner.setLastName(lastName);
//             owner.setPhoneNumber(phoneNumber);
//             owner.setEmail(email);
//             ownerRepository.save(owner);
//             return new ResponseMessage("Создан новый собственник");
//    }
}
