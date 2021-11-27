package com.company.entity;

public class Company {
    private String companyName;
    private String companyCountry;
    private String companyCity;
    private String companyAdress;

    public Company(String companyName, String companyCity, String companyAdress) {
        this.companyName = companyName;
        this.companyCity = companyCity;
        this.companyAdress = companyAdress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyCountry() {
        return companyCountry;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public String getCompanyAdress() {
        return companyAdress;
    }
}
