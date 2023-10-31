package ru.app.financerentalcar.entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
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
    @NotEmpty(message = "Имя не может быть пустым")
    private String firstName;

    @Column(name = "lastName")
    @NotEmpty(message = "Фамилия не может быть пустой")
    private String lastName;

    @Column(name = "phoneNumber")
    @Size(min = 3, max = 12)
    private Long phoneNumber;

    @Column(name = "email")
    @Email
    private String email;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @OneToOne(optional = false,orphanRemoval = true)
    @JoinColumn(name = "car_id",nullable = false)
    private Car car;
}
