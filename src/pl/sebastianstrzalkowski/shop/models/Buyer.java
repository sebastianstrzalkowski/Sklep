package pl.sebastianstrzalkowski.shop.models;

public class Buyer extends Human {


    private double money;

    public Buyer(String name, String surname, double money) {
        super(name, surname);
        this.money = money;
    }


    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
