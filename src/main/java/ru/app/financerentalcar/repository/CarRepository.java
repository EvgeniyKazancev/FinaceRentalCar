package ru.app.financerentalcar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.app.financerentalcar.entity.Car;

public interface CarRepository extends JpaRepository<Car,Long> {
}
