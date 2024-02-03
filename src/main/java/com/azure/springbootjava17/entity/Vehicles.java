package com.azure.springbootjava17.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TB_VEHICLES")
public class Vehicles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String type;
    private String plate;
    private String brand;
    private String model;
    private LocalDateTime yearOfManufacture;
    private String color;
    private Long currentMileage;
    private LocalDateTime lastRevision;

    @OneToMany(orphanRemoval = true)
    private ServiceToDo serviceToDo;

}