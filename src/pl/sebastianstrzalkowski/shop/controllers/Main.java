package pl.sebastianstrzalkowski.shop.controllers;


import pl.sebastianstrzalkowski.shop.enums.Breed;
import pl.sebastianstrzalkowski.shop.enums.Status;
import pl.sebastianstrzalkowski.shop.lists.UnicornListPrimary;
import pl.sebastianstrzalkowski.shop.models.Unicorn;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Unicorn> unicornList = new ArrayList<Unicorn>();

        Unicorn unicorn = new Unicorn("Jacek ", Breed.AMARANTOWA, 10000, Status.DOSTEPNY);
        Unicorn unicorn1 = new Unicorn("Agata ",Breed.AMARANTOWA, 10000, Status.NIEDOSTPENY);
        Unicorn unicorn2 = new Unicorn("Paweł ", Breed.ROZOWA, 10000, Status.DOSTEPNY, unicorn, unicorn1);

        UnicornListPrimary.addUnicorn(unicorn);
        UnicornListPrimary.addUnicorn(unicorn1);
        UnicornListPrimary.addUnicorn(unicorn2);

        UnicornListPrimary.showUnicorns();


        UnicornListPrimary.sellUnicorn(unicorn2);
    }

}
