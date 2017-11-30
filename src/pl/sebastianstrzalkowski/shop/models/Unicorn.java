package pl.sebastianstrzalkowski.shop.models;

import pl.sebastianstrzalkowski.shop.enums.Breed;
import pl.sebastianstrzalkowski.shop.enums.Status;

public class Unicorn {

    private String name;
    private Breed breed;
    private Unicorn parent1;
    private Unicorn  parent2;
    private double price;
    private Status status;
    private String parents;

    public Unicorn(String name, Breed breed, double cena, Status status){

        this.name = name;
        this.breed = breed;
        this.price = cena;
        this.status = status;
        parents = "brak danych";

    }

    public Unicorn(String name, Breed breed, double cena, Status status, Unicorn  rodzic1, Unicorn  rodzic2){

        this.name = name;
        this.breed = breed;
        this.price = cena;
        this.status = status;
        this.parent1 = rodzic1;
        this.parent2 = rodzic2;
        parents = rodzic1.getName() + " i " + rodzic2.getName();
    }



    public Breed getBreed() {
        return breed;
    }


    public double getPrice(){
        return price;
    }


    public Status getStatus() {
        return status;
    }

    public static void setStatusUnavaible(Unicorn  unicorn) {
            unicorn.status = Status.NIEDOSTPENY;
    }
    public  void setStatus(Unicorn  jednorozec) {
        jednorozec.status = Status.NIEDOSTPENY;
    }

    public Unicorn  getParent2() {

        return parent2;
    }



    public Unicorn  getParent1() {

        return parent1;
    }


    public String getName() {
        return name;
    }



    public String getParents() {
        return parents;
    }

    public static void testCross(Unicorn  rodzic1, Unicorn  rodzic2, Unicorn  jednorozec){

        if(rodzic1.getBreed().toString().equals(rodzic2.getBreed().toString().equals(jednorozec.getBreed()))){}
        else{
            System.out.println("Nie prawidłowe rasy rodziców.");
        }
    }




    public static boolean testBreed(Unicorn  parent1, Unicorn  parent2, Breed  breed) {
        if(!parent1.equals(parent2)) {
            if (parent1.getBreed().toString().equals(parent2.getBreed().toString())) {
                if (parent2.getBreed().toString().equals(breed.toString())) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        else{
            return false;
        }
    }

    public String toString() {

        return " " + name;
    }

}
