package quru.qa.oop;

public class MirCard extends Card { //MirCard является ли Card? если ответ да, то используем наследование, если нет,
    // то используется композицию, те внутри этого класса иницилизировать объект Card

    public MirCard() {
        super(PaymentSystem.MIR);
    }

    protected boolean isCountryValidForTheseCard(Country country) {
        if (country == Country.RU)
            return true;
        else
            return false;
    }
}