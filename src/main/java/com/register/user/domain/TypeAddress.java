package com.register.user.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class TypeAddress implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private boolean active;
    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    public TypeAddress() {}

    public Integer getId() {
        return id;
    }

    public TypeAddress setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TypeAddress setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isActive() {
        return active;
    }

    public TypeAddress setActive(boolean active) {
        this.active = active;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public TypeAddress setAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeAddress that = (TypeAddress) o;
        return active == that.active &&
                id.equals(that.id) &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, active);
    }
}
