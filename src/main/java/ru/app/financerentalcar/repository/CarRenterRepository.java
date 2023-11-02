package ru.app.financerentalcar.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.util.Lazy;
import org.springframework.stereotype.Repository;
import ru.app.financerentalcar.entity.Car;
import ru.app.financerentalcar.entity.CarRenter;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarRenterRepository extends JpaRepository<CarRenter, Long> {




    Optional<CarRenter> findByPassportRenterId(Long passportRenterId);

    @Override
    void deleteById(Long passportId);
}
