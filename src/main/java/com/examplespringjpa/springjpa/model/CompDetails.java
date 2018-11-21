package com.examplespringjpa.springjpa.model;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
public class CompDetails {

    @NotNull
    @Size(max = 40)
    private String companyName;

    @Size(max = 40)
    private String companyBrand;

    @Size(max = 40)
    private String description;

    public CompDetails() {

    }

    public CompDetails(String companyName, String companyBrand, String description) {
        this.companyName = companyName;
        this.companyBrand = companyBrand;
        this.description = description;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyBrand() {
        return companyBrand;
    }

    public void setCompanyBrand(String companyBrand) {
        this.companyBrand = companyBrand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CompDetails{" +
                "companyName='" + companyName + '\'' +
                ", companyBrand='" + companyBrand + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
