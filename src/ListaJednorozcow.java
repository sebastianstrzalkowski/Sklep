import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaJednorozcow {

    static List<Jednorozec>listaJednorozcow = new ArrayList<Jednorozec>();

    public List<Jednorozec> getListaJednorozcow() {
        return listaJednorozcow;
    }

    public void setListaJednorozcow(List<Jednorozec>listaJednorozcow) {
        this.listaJednorozcow = listaJednorozcow;
    }

    public ListaJednorozcow(List<Jednorozec>listaJednorozcow) {
        this.listaJednorozcow = listaJednorozcow;
    }

    public static void dodajJednorozca(Jednorozec jednorozec){
        listaJednorozcow.add(jednorozec);
    }

    public static void sprzedajJednororzca(Jednorozec jednorozec){
        for(Iterator it = listaJednorozcow.iterator(); it.hasNext();){

            Jednorozec jednorozec1 = (Jednorozec) it.next();
            System.out.println(jednorozec1);
            if(jednorozec1.getImie().equals(jednorozec.getImie()) && jednorozec1.getRasa().equals(jednorozec.getRasa()) && jednorozec1.getStatus().equals(Status.DOSTEPNY)){
                System.out.println("Jednorozec " + jednorozec1.getImie() + " jest dostępny na sprzedaż za " + jednorozec1.getCena());
                System.out.println("Gratuluje, jesteś nowym właścicielem");
                Jednorozec.setStatusNiedostepny(jednorozec);
                if(jednorozec1.getImie().equals(jednorozec.getImie()) && jednorozec1.getRasa().equals(jednorozec.getRasa()) && jednorozec1.getStatus().equals(Status.NIEDOSTPENY)){
                    System.out.println("Jednorozec " + jednorozec1.getImie() + "został już sprzedany.");
                }
            }
            else if(jednorozec1.getImie().equals(jednorozec.getImie()) && jednorozec1.getRasa().equals(jednorozec.getRasa()) && jednorozec1.getStatus().equals(Status.NIEDOSTPENY)){
                System.out.println("Jednorozec " + jednorozec1.getImie() + "został już sprzedany.");
            }
        }
    }

    public static void wyswietlJednorozce(){
        System.out.println("----------------------------------------");
        System.out.println("Lista jednorożców");
        System.out.println("----------------------------------------");
        for(Iterator it = listaJednorozcow.iterator(); it.hasNext();){
            Jednorozec jednorozec = (Jednorozec) it.next();
            System.out.println(jednorozec.toString());
            if(jednorozec.getRodzice().equals("brak danych")){}
            else {
                Jednorozec.testKrzyzowki(jednorozec.getRodzic1(), jednorozec.getRodzic2(), jednorozec);
            }
        }
        System.out.println("----------------------------------------");
    }
    public ObservableList<Jednorozec> getListaJednorozcow1() {
        return (ObservableList<Jednorozec>) listaJednorozcow;
    }
}
