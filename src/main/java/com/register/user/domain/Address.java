package com.register.user.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private boolean active;
    private String streetName;
    private Integer number;
    private String description;
    private String complement;
    @OneToOne(mappedBy = "address")
    private TypeAddress typeAddress;
    @ManyToOne
    private People people;


    public Integer getId() {
        return id;
    }

    public Address setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Address setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isActive() {
        return active;
    }

    public Address setActive(boolean active) {
        this.active = active;
        return this;
    }

    public String getStreetName() {
        return streetName;
    }

    public Address setStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public Address setNumber(Integer number) {
        this.number = number;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Address setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getComplement() {
        return complement;
    }

    public Address setComplement(String complement) {
        this.complement = complement;
        return this;
    }

    public TypeAddress getTypeAddress() {
        return typeAddress;
    }

    public Address setTypeAddress(TypeAddress typeAddress) {
        this.typeAddress = typeAddress;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return id.equals(address.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, active, streetName, number, description, complement, typeAddress, people);
    }
}
