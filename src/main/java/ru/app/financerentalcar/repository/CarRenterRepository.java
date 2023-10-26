package ru.app.financerentalcar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.app.financerentalcar.entity.CarRenter;

@Repository
public interface CarRenterRepository extends JpaRepository<CarRenter,Long> {
}
