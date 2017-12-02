package pl.sebastianstrzalkowski.shop.models;

import pl.sebastianstrzalkowski.shop.enums.Breed;
import pl.sebastianstrzalkowski.shop.enums.Availability;

public class Unicorn {

    private String name;
    private Breed breed;
    private Unicorn parent1;
    private Unicorn parent2;
    private double price;
    private Availability availability;
    private String parents;

    public Unicorn(String name, Breed breed, double cena, Availability availability) {

        this.name = name;
        this.breed = breed;
        this.price = cena;
        this.availability = availability;
        parents = "brak danych";

    }

    public Unicorn(String name, Breed breed, double cena, Availability availability, Unicorn rodzic1, Unicorn rodzic2) {

        this.name = name;
        this.breed = breed;
        this.price = cena;
        this.availability = availability;
        this.parent1 = rodzic1;
        this.parent2 = rodzic2;
        parents = rodzic1.getName() + " i " + rodzic2.getName();
    }


    public Breed getBreed() {
        return breed;
    }


    public double getPrice() {
        return price;
    }


    public Availability getAvailability() {
        return availability;
    }

    public static void setStatusUnavaible(Unicorn unicorn) {
        unicorn.availability = Availability.NIEDOSTPENY;
    }

    public void setAvailability(Unicorn jednorozec) {
        jednorozec.availability = Availability.NIEDOSTPENY;
    }

    public Unicorn getParent2() {

        return parent2;
    }


    public Unicorn getParent1() {

        return parent1;
    }


    public String getName() {
        return name;
    }


    public String getParents() {
        return parents;
    }

    public static void testCross(Unicorn rodzic1, Unicorn rodzic2, Unicorn jednorozec) {

        if (rodzic1.getBreed().toString().equals(rodzic2.getBreed().toString().equals(jednorozec.getBreed()))) {
        } else {
            System.out.println("Nie prawidłowe rasy rodziców.");
        }
    }


    public static boolean testBreed(Unicorn parent1, Unicorn parent2, Breed breed) {
        if (!parent1.equals(parent2)) {
            if (parent1.getBreed().toString().equals(parent2.getBreed().toString())) {
                if (parent2.getBreed().toString().equals(breed.toString())) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String toString() {

        return " " + name;
    }

}
