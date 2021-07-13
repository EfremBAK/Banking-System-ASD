package edu.mum.cs.cs525.labs.exercises.project.ui.framework.models.customer;

import edu.mum.cs.cs525.labs.exercises.project.ui.framework.models.account.Account;

import java.util.List;

public abstract class Customer {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String email;

    private List<Account> accounts;

    public Customer() {
    }

    public Customer(String name, String street, String city, String state, String zip, String email, List<Account> accounts) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
