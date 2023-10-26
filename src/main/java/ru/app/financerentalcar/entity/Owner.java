package ru.app.financerentalcar.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "Owner")
public class Owner {

    @Id
    @Column(name = "passportId")
    private Long passportId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "phoneNumber")
    private Long phoneNumber;

    @Column(name = "email")
    private String email;


}
