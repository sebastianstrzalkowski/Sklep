package pl.sebastianstrzalkowski.shop.models;


public class Seller extends Human {


    private double money;

    public Seller(String name, String surname, double money){

        super(name, surname);
        this.money = money;
    }

    public Seller(String imie, String nazwisko){

        super(imie, nazwisko);

    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double budzet) {
        this.money = budzet;
    }


}

