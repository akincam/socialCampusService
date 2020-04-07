package com.akincam.app.socialcampus.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UniversityEntity {

    private String  uniName;
    private int     uniId;
    private int     cityId;
    private int     status;

    public UniversityEntity(@JsonProperty String uniName,
                            @JsonProperty int uniId,
                            @JsonProperty int cityId,
                            @JsonProperty int status){
        this.uniName    = uniName;
        this.uniId      = uniId;
        this.cityId     = cityId;
        this.status     = status;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public int getUni_id() {
        return uniId;
    }

    public void setUni_id(int uniId) {
        this.uniId = uniId;
    }

    public int getCity_id() {
        return cityId;
    }

    public void setCity_id(int cityId) {
        this.cityId = cityId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
