package quru.qa.oop;

public class UnionPayCard extends Card {

    public UnionPayCard() {
        super(PaymentSystem.UNIONPAY);
    }

    protected boolean isCountryValidForTheseCard(Country country) {
        if (country == Country.CN)
            return true;
        else
            return false;
    }
}