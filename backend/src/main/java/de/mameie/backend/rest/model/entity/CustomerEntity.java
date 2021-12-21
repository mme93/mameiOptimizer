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
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "isPrivate")
    private boolean isPrivate;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "company")
    private String company;
    @Column(name = "sign")
    private String sign;
    @Column(name = "callNumber")
    private String callNumber;
    @Column(name = "info")
    private String info;
    @Column(name = "address")
    private String address;

    public CustomerEntity(boolean isPrivate, String firstName, String lastName, String email, String company, String sign, String callNumber, String info, String address) {
        this.isPrivate = isPrivate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.company = company;
        this.sign = sign;
        this.callNumber = callNumber;
        this.info = info;
        this.address = address;
    }

    public CustomerEntity(boolean isPrivate, String firstName, String lastName, String email, String company, String callNumber, String info, String address) {
        this.isPrivate = isPrivate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.company = company;
        this.callNumber = callNumber;
        this.info = info;
        this.address = address;
    }
}
