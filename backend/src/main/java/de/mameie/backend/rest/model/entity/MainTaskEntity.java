package de.mameie.backend.rest.model.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "maintask")
public class MainTaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "tile", unique = true)
    private String title;

    @Column(name="username")
    private String username;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn
    private List<TaskEntity> taskEntityList= new ArrayList<>();

    public MainTaskEntity(String title, String username, List<TaskEntity> taskEntityList) {
        this.title = title;
        this.username = username;
        this.taskEntityList = taskEntityList;
    }
}
