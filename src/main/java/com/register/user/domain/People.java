package com.register.user.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class People implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String document;
    private String rgie;
    private String peopleType;
    private String mailAddress;
    private String phone;
    private String cellPhone;
    private String birth;
    private String employesAmount;
    @ManyToOne
    @JoinTable(name="people_address")
    private Address address;

    public People() {}

    public Integer getId() {
        return id;
    }

    public People setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public People setName(String name) {
        this.name = name;
        return this;
    }

    public String getDocument() {
        return document;
    }

    public People setDocument(String document) {
        this.document = document;
        return this;
    }

    public String getRgie() {
        return rgie;
    }

    public People setRgie(String rgie) {
        this.rgie = rgie;
        return this;
    }

    public String getPeopleType() {
        return peopleType;
    }

    public People setPeopleType(String peopleType) {
        this.peopleType = peopleType;
        return this;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public People setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public People setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public People setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
        return this;
    }

    public String getBirth() {
        return birth;
    }

    public People setBirth(String birth) {
        this.birth = birth;
        return this;
    }

    public String getEmployesAmount() {
        return employesAmount;
    }

    public People setEmployesAmount(String employesAmount) {
        this.employesAmount = employesAmount;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public People setAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return id.equals(people.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
