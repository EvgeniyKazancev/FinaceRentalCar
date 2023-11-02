package ru.app.financerentalcar.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class OwnerDTO {
    private Long passportId;
    private String firstName;
    private String lastName;
    private Long phoneNumber;
    private String email;
}
