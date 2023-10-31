package ru.app.financerentalcar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.app.financerentalcar.entity.CostPerDay;

public interface CostRepository extends JpaRepository <CostPerDay, Long>{
}
