package ru.app.financerentalcar.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import ru.app.financerentalcar.enums.Color;

import java.util.UUID;

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
    private int yearRelease;

    @Enumerated(EnumType.STRING)
    @Column(name = "color")
    private Color color;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @OneToOne(optional = false,orphanRemoval = true)
    @JoinColumn(name = "number_pts",nullable = false)
    private PTS pts;
}
