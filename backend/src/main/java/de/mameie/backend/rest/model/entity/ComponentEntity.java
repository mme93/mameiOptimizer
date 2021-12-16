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
    @Column(name = "description")
    private String description;
    @Column(name = "href")
    private String href;
    @Column(name = "iconName")
    private String iconName;
    @Column(name = "permission")
    private boolean permission;

    public ComponentEntity(String name, String description, String href, String iconName, boolean permission) {
        this.name = name;
        this.description = description;
        this.href = href;
        this.iconName = iconName;
        this.permission = permission;
    }
}
