package ru.app.financerentalcar.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Cost_per_day")
public class CostPerDay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "cost")
    public int cost;

    @OneToMany(mappedBy = "costPerDay")
    private List<Car> carList;

}
