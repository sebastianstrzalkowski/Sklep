package pl.sebastianstrzalkowski.shop.models;

public class Human {

    private String name;
    private String surname;

    Human(String imie, String nazwisko) {

        this.name = imie;
        this.surname = nazwisko;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String nazwisko) {
        this.surname = nazwisko;
    }

}
