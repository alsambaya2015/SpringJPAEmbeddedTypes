package com.examplespringjpa.springjpa.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Embedded
    private CompDetails compDetails;


    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "addressLine1", column = @Column(name = "house_number")),
            @AttributeOverride(name = "addressLine2", column = @Column(name = "street"))
    })
    private Address address;

    public Company(){

    }

    public Company(CompDetails compDetails, Address address) {
        this.compDetails = compDetails;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CompDetails getCompDetails() {
        return compDetails;
    }

    public void setCompDetails(CompDetails compDetails) {
        this.compDetails = compDetails;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
