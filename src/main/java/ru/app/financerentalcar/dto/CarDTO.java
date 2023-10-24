package ru.app.financerentalcar.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.app.financerentalcar.enums.Color;

@Setter
@Getter
@NoArgsConstructor
public class CarDTO {
    private String brand;
    private String model;
    private int yearRelease;
    private Color color;
}
