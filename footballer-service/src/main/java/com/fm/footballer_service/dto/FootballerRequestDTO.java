package com.fm.footballer_service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class FootballerRequestDTO {
    @NotBlank(message = "Name is required")
    @Size(max = 100, message = "Name can not exceed 100 character")
    private String name;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Age is required")
    private String age;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "Playing role is mandatory")
    private String playingRole;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPlayingRole() {
        return playingRole;
    }

    public void setPlayingRole(String playingRole) {
        this.playingRole = playingRole;
    }
}
