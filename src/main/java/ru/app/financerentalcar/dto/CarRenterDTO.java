package ru.app.financerentalcar.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CarRenterDTO {
    private Long passport_id;
    private String firstName;
    private String lastName;
    private Long phoneNumber;
    private String email;
}
