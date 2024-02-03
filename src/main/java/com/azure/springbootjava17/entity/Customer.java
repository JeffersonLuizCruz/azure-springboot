package com.azure.springbootjava17.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor @NoArgsConstructor
@Entity @Table(name = "TB_CUSTOMER")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private char gender;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate birth;
    private LocalDate cpf;
    private String address;

    @OneToMany(orphanRemoval = true)
    private List<Vehicles> vehicles;
}