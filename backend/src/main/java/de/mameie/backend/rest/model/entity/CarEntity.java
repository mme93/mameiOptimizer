package de.mameie.backend.rest.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "car")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "FIN")
    private String fin;
    @Column(name = "license_plate")
    private String licensePlate;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "owner")
    private String owner;
    @Column(name = "gear")
    private String gear;
    @Column(name = "year_of_construction")
    private int yearOfConstruction;
    @Column(name = "color")
    private String color;

    public CarEntity(String fin, String licensePlate, String brand, String model, String owner, String gear, int yearOfConstruction, String color) {
        this.fin = fin;
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.owner = owner;
        this.gear = gear;
        this.yearOfConstruction = yearOfConstruction;
        this.color = color;
    }
}
