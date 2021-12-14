package de.mameie.backend.rest.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MemberDto {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String username;
    private int permission;
}
