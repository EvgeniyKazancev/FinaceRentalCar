package ru.app.financerentalcar.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Car_renter")
public class CarRenter {
    @Id
    @Column(name = "passportRenter_id")
    private Long passportRenter_id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "phone_number")
    private Long phoneNumber;

    @Column(name = "email")
    private String email;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @OneToOne(optional = false,orphanRemoval = true)
    @JoinColumn(name = "car_id",nullable = false)
    private Car car;
}
