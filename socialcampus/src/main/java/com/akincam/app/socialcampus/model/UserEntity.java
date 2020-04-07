package com.akincam.app.socialcampus.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class UserEntity {

    private Long         id;
    private String       name;
    private String       email;
    private String       password;
    private String       university;

    public UserEntity(@NotNull @JsonProperty("id") long id,
                      @NotNull @JsonProperty("name") String name,
                      @NotNull @JsonProperty("email") String email,
                      @NotNull @JsonProperty("password") String password,
                      @NotNull @JsonProperty("university") String university) {
        this.id         = id;
        this.name       = name;
        this.email      = email;
        this.password   = password;
        this.university = university;
    }

    public Long getId() { return id; }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
