package ru.app.financerentalcar.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "PTS")
public class PTS {

    @Id
    @Column(name = "number_pts")
    private Long number_pts;

    @Column(name = "car_namber")
    private String car_number;

    @ManyToOne(optional = false)
    @JoinColumn(name = "passport_id",nullable = false)
    private Owner owner;
}
