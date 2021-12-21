package de.mameie.backend.rest.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerDto {
    private boolean isPrivate;
    private String firstName;
    private String lastName;
    private String address;
    private String company;
    private String sign;
    private String email;
    private String callNumber;
    private String info;
}