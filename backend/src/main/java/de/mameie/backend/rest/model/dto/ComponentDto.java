package de.mameie.backend.rest.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ComponentDto {

    private String name;
    private String description;
    private String href;
    private String iconName;
    private boolean permission;
}
