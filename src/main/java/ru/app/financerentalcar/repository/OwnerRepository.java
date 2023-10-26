package ru.app.financerentalcar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.app.financerentalcar.entity.Owner;
@Repository
public interface OwnerRepository extends JpaRepository<Owner,Long> {
}
