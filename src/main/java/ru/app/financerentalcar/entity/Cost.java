package ru.app.financerentalcar.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Cost")
public class Cost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

//    @Column(name = "")                    //продумать стоимость по сезону
}
