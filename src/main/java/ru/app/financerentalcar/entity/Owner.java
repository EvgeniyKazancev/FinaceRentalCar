package ru.app.financerentalcar.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
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
    @NotEmpty(message = "Паспорт не может быть пуст")
    private Long passportId;

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


}
