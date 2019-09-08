import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Main {
    public static String pierwszaMetoda(){

        String costam = "cos tam";
        return costam;
    }


    public static Double dodawanie(Integer a, Double b){
        return a + b;
    }


    public static void main(String[] args) {
        System.out.println("pierwszy rzut");

        // zmienna tekstowa (jest ciągiem zmiennych typu char)
        Character character = ('a');
        String pierwszyS ="nowy string";

        //Zmienne liczbowe
        Integer liczba1 = 1;
        Float liczba2 =10.4f;
        Double liczba3 = 10.3;



        pierwszaMetoda();
        System.out.println(pierwszaMetoda());

        String wiadomość = "Liczba"+liczba1+"+liczba"+liczba3+"wynosi"+dodawanie(liczba1, liczba3);
        System.out.println(wiadomość);


        System.out.println("Liczba"+liczba1+"+liczba"+liczba3+"wynosi"+dodawanie(liczba1, liczba3));

        //klasy i obiekty

        Samochod opel = new Samochod( "opel",  "astra");
        System.out.println(opel.getInfo());

        System.out.println("Inny samochod");

        Samochod toyota = new Samochod("toyota", "yaris");
        System.out.println(toyota.getInfo());



        opel.przyspiesz(10);
    System.out.println("Nowa predkosc:"+opel.getPredkosc());
        opel.przyspiesz(50);
    System.out.println("Nowa predkosc:"+ opel.getPredkosc());
        opel.ustawPrzebieg(20);
        System.out.println(opel.getStan());
    opel.ustawPrzebieg(60);
        System.out.println(opel.getStan());




        //dziedziczenie
        Tir mojTir= new Tir("jelcz", "jelcz", 13);
        System.out.println(mojTir.getInfo());
        mojTir.ustawPrzebieg(1500);
        System.out.println(mojTir.przebieg);
        mojTir.przekrecLicznik(1500);
        System.out.println(mojTir.przebieg);
        System.out.println(mojTir.getStan());
        mojTir.przyspiesz(25);
        System.out.println("Przyspieszenie tira:"+mojTir.getPredkosc());

        // nawigacja

        //ctrl + z - cofaj zmiany
            // alt+enter na nieistniejacej zmiennej

        //zlożone typy zmiennych
        //{element, element, element} -> 0,1,2


        List<String> listal= new ArrayList<>();
        listal.add("element1");
        listal.add("element2");
        listal.add(1,"element3");

        System.out.println("Wielkosc listy"+ listal.size());
        System.out.println(listal.toString());

        Hashtable <String, String> table = new Hashtable <>();
        table.put("zajecia", "testPoz4");
        table.put("zajecia2", "testPoz2");
        System.out.println("Tabela"+table.get("zajecia"));



    }

}


// NAWIGACJA - najeżdżamy na zmienną/klasę/metoda kursorem ctrl + lewy przycisk myszy

//na czarno (char, integer - definicja typu zmiennej)
// nazwy zmiennej np. liczba1, pierwszyS)
// operatory java np. =,+ https://www.w3schools.com/java/java_operators.asp

