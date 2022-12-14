package com.example.java_web_final_project.controller.dto;

public class TeaDto {

    private String name;

    private String benefits;

    private Integer brewTime;

    public TeaDto() {
    }

    public TeaDto(String name, String benefits, Integer brewTime) {
        this.name = name;
        this.benefits = benefits;
        this.brewTime = brewTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public Integer getBrewTime() {
        return brewTime;
    }

    public void setBrewTime(Integer brewTime) {
        this.brewTime = brewTime;
    }

    @Override
    public String toString() {
        return "TeaDto{" +
                "name='" + name + '\'' +
                ", benefits='" + benefits + '\'' +
                ", brewTime=" + brewTime +
                '}';
    }
}
