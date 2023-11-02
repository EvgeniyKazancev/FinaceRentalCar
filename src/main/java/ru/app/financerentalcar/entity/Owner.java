package ru.app.financerentalcar.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "Owner")
public class Owner {

    @Id
    @Column(name = "passportId")

    private Long passportId;

    @Column(name = "first_name")

    private String firstName;

    @Column(name = "last_name")

    private String lastName;

    @Column(name = "phone_number")

    private Long phoneNumber;

    @Column(name = "email")
    @Email
    private String email;


}
