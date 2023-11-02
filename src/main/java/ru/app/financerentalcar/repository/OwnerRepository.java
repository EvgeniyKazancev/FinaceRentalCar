package ru.app.financerentalcar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.app.financerentalcar.entity.Owner;

import java.util.Optional;

@Repository
public interface OwnerRepository extends JpaRepository<Owner,Long> {
  Optional<Owner> findByPassportId(Long passportId) ;

}
