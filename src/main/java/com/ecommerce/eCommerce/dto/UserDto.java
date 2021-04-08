package com.ecommerce.eCommerce.dto;
import com.ecommerce.eCommerce.model.Roles;
import com.ecommerce.eCommerce.validation.ValidEmail;

import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
public class UserDto {
    @NotNull
    @Size(min = 2, max = 100)
    private String name;

    @ValidEmail
    @Size(min = 2, max = 100)
    private String email;

    @NotNull
    @Size(min = 2, max = 100)
    private String address;

    @NotNull
    private Integer role;

    @NotNull
    @Size(min = 2, max = 100)
    private String userName;

    @NotNull
    private String password;

    @NotNull
    private String matchingPassword;

    @Transient
    private Roles roleDetails;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMatchingPassword() {
        return matchingPassword;
    }

    public void setMatchingPassword(String matchingPassword) {
        this.matchingPassword = matchingPassword;
    }
}
