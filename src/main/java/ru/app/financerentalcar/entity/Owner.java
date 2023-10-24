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
    @Column(name = "passport_id")
    private Long passport_id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "phone_number")
    private Long phoneNumber;

    @Column(name = "email")
    private String email;


}
