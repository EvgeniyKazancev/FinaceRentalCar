package ru.app.financerentalcar.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import ru.app.financerentalcar.enums.Color;

@Getter
@Setter
@Entity
@Table(name = "Car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "year_release")
    @Size(min = 2010, max = 2023)
    private int yearRelease;

    @Enumerated(EnumType.STRING)
    @Column(name = "color")
    private Color color;

    @Column(name = "sticker")
    private boolean sticker;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @OneToOne(optional = false, orphanRemoval = true)
    @JoinColumn(name = "number_pts", nullable = false)
    private PTS pts;

    @ManyToOne
    @JoinColumn(name = "cost_id")
    private CostPerDay costPerDay;

}
