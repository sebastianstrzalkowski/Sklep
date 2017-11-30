package pl.sebastianstrzalkowski.shop.lists;

import pl.sebastianstrzalkowski.shop.enums.Status;
import pl.sebastianstrzalkowski.shop.models.Unicorn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UnicornListPrimary {

    static List<Unicorn>unicornListPrimary = new ArrayList<Unicorn>();

    public List<Unicorn> getUnicornList() {
        return unicornListPrimary;
    }

    public void setUnicornList(List<Unicorn>unicornListPrimary) {
        this.unicornListPrimary = unicornListPrimary;
    }

    public UnicornListPrimary(List<Unicorn>unicornListPrimary) {
        this.unicornListPrimary = unicornListPrimary;
    }

    public static void addUnicorn(Unicorn unicorn){
        unicornListPrimary.add(unicorn);
    }

    public static void sellUnicorn(Unicorn unicorn){
        for(Iterator it = unicornListPrimary.iterator(); it.hasNext();){

            Unicorn unicorn1 = (Unicorn) it.next();
            System.out.println(unicorn);
            if(unicorn.getName().equals(unicorn.getName()) && unicorn.getBreed().equals(unicorn.getBreed()) && unicorn.getStatus().equals(Status.DOSTEPNY)){
                System.out.println("Jednorozec " + unicorn.getName() + " jest dostępny na sprzedaż za " + unicorn.getPrice());
                System.out.println("Gratuluje, jesteś nowym właścicielem");
                Unicorn.setStatusUnavaible(unicorn);
                if(unicorn.getName().equals(unicorn.getName()) && unicorn.getBreed().equals(unicorn.getBreed()) && unicorn.getStatus().equals(Status.NIEDOSTPENY)){
                    System.out.println("Jednorozec " + unicorn.getName() + "został już sprzedany.");
                }
            }
            else if(unicorn.getName().equals(unicorn.getName()) && unicorn.getBreed().equals(unicorn.getBreed()) && unicorn.getStatus().equals(Status.NIEDOSTPENY)){
                System.out.println("Jednorozec " + unicorn.getName() + "został już sprzedany.");
            }
        }
    }

    public static void showUnicorns(){
        System.out.println("----------------------------------------");
        System.out.println("Lista jednorożców");
        System.out.println("----------------------------------------");
        for(Iterator it = unicornListPrimary.iterator(); it.hasNext();){
            Unicorn unicorn = (Unicorn) it.next();
            System.out.println(unicorn.toString());
            if(unicorn.getParents().equals("brak danych")){}
            else {
                Unicorn.testCross(unicorn.getParent1(), unicorn.getParent2(), unicorn);
            }
        }
        System.out.println("----------------------------------------");
    }

}
