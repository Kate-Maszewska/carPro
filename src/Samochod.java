import java.util.Date;

public class Samochod {

    public String marka;
    public String model;
    public Integer przebieg;
    public Boolean stan;
    private Integer predkosc;
    protected String typ;


    public Samochod(String marka, String model){
        this.marka = marka;
        this.model = model;
        this.predkosc = 0;
        this.przebieg = 0;
    }

    //setter
    public  void ustawPrzebieg(Integer przebieg){
        this.przebieg = przebieg;
    }

    public String getInfo() {
        String info = "Marka samochodu:" + this.marka + "\n";
        info += "Model samochodu:" + this.model;

        return info;
    }
    public void przyspiesz(Integer przyspieszenie){
        this.predkosc += przyspieszenie;
    }

    //setter

    public void setPredkosc(Integer predkosc){
        this.predkosc=predkosc;
    }

    public Integer getPredkosc(){
        return this.predkosc;
    }

   private void sprawdzStan() {
        // instrukcja warunkowa
       // jeśli (warunek) (kod wykonywany jeśli warunek jest spelniony)
       //else (w innym wypadku, jesli warunek nie jest spelniony, (wykonaj kod)
        if (this.przebieg > 50) {
            this.stan = true;
        }
        else {
            this.stan = false;
        }

   }
    public String getStan(){
        String info;
        this.sprawdzStan();
        if(this.stan) {
            info = "Auto jest zuzyte";
            System.out.println("Not interested");
        }
        else
            info = "Auto jest calkiem nowe";

        return info;
    }

}
