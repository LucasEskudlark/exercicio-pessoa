package entities;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String name;
    private LocalDate birthDate;
    private double height;

    /* Constructor */
    public Pessoa(String name, LocalDate birthDate, double height) {
        this.name = name;
        this.birthDate = birthDate;
        this.height = height;
    }

    /*  Override toString to print info */
    public String toString() {
        return "\nNome: " + name +
                "\nData de nascimento: " + birthDate.getDayOfMonth() +
                "/" + birthDate.getMonthValue() +
                "/" + birthDate.getYear() +
                "\nAltura: " + height + "m";
    }

    /*  Method to calculate the age of the person */
    public int calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        return period.getYears();
    }


    /*  Getters and Setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
