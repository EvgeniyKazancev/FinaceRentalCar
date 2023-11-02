package ru.app.financerentalcar.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.app.financerentalcar.entity.Owner;
import ru.app.financerentalcar.repository.OwnerRepository;
import ru.app.financerentalcar.response.ResponseMessage;

import java.util.ArrayList;
import java.util.List;

@Service
public class OwnerServices {
  private final   OwnerRepository ownerRepository;


    public OwnerServices(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }
     public List<Owner> getAllOwner(){
        List<Owner> ownerList = new ArrayList<>();
        return ownerList = ownerRepository.findAll();
     }
    public Owner getOwner(Long passportId){
       Owner owner = ownerRepository.findByPassportId(passportId).orElseThrow(() -> new EntityNotFoundException("Пользователя с таким Id нет!"));
        return owner;
    }

    public  ResponseMessage addOwner(Long passportId,String firstName,String lastName,Long phoneNumber,String email){
             Owner owner = new Owner();
             owner.setPassportId(passportId);
             owner.setFirstName(firstName);
             owner.setLastName(lastName);
             owner.setPhoneNumber(phoneNumber);
             owner.setEmail(email);
             ownerRepository.save(owner);
             return new ResponseMessage("Создан новый собственник");
    }
}
