package com.example.java_web_final_project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Tea {

    @Id
    @GeneratedValue
    private Integer id;

    private String teaName;

    private String benefits;

    private Integer brewTime;

    public Tea() {
    }


    public Tea(Integer id, String teaName, String benefits, Integer brewTime) {
        this.id = id;
        this.teaName = teaName;
        this.benefits = benefits;
        this.brewTime = brewTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tea tea = (Tea) o;
        return Objects.equals(id, tea.id) && Objects.equals(teaName, tea.teaName) && Objects.equals(benefits, tea.benefits) && Objects.equals(brewTime, tea.brewTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, teaName, benefits, brewTime);
    }

    @Override
    public String toString() {
        return "Tea{" +
                "id=" + id +
                ", teaName='" + teaName + '\'' +
                ", benefits='" + benefits + '\'' +
                ", brewTime=" + brewTime +
                '}';
    }
}
