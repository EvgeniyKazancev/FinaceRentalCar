package ru.app.financerentalcar.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import ru.app.financerentalcar.entity.Owner;
import ru.app.financerentalcar.repository.OwnerRepository;

@Service
public class OwnerServices {
  private final   OwnerRepository ownerRepository;

    public OwnerServices(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public Owner getOwner(Long passportId){
       Owner owner = ownerRepository.findByPassportId(passportId).orElseThrow(() -> new EntityNotFoundException("Пользователя с таким Id нет!"));
        return owner;
    }

}
