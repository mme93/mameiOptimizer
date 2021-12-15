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
@Table(name = "component")
public class ComponentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "description", columnDefinition = "NVARCHAR(MAX)")
    private String description;

    public ComponentEntity(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
