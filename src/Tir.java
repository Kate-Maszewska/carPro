public class Tir extends Samochod {

    private Integer maxWaga;

    public Tir(String model, String marka, Integer maxWaga) {
        super(model, marka);
        this.maxWaga = maxWaga;

    }
    public void  przekrecLicznik (Integer przebieg){
        this.ustawPrzebieg(przebieg);
        if(this.przebieg > 150)
            this.przebieg -=100;


    }

    @Override
    public void przyspiesz(Integer przyspieszenie){
        this.setPredkosc(przyspieszenie-5);

    }

}
