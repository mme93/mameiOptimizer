package de.mameie.backend.rest.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class CarDto {

    private String fin;
    private String licensePlate;
    private String brand;
    private String model;
    private String owner;
    private String gear;
    private int yearOfConstruction;
    private String color;
    private String fuel;
    private String tuev;
    private String carType;

}
