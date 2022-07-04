package quru.qa.oop;

import java.io.Serializable;

import static quru.qa.oop.Country.RU;
import static quru.qa.oop.PaymentSystem.MAESTRO;

public class MaestroCard extends Card implements ICard, Serializable {
    public MaestroCard() {
        super(MAESTRO);
    }

    @Override
    protected boolean isCountryValidForTheseCard(Country country) {
        return RU == country;
    }
}