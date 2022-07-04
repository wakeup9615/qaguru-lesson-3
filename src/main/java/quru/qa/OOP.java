package quru.qa;

import quru.qa.oop.Card;
import quru.qa.oop.Country;
import quru.qa.oop.VisaCard;

import java.util.ArrayList;
import java.util.List;

import static quru.qa.oop.Country.RU;

public class OOP {
    public static void main(String[] args) {
        invoke(new VisaCard());
        List<String> aList = new ArrayList<>();
    }


    //полиморфны код - если один и тот же код делает разное для разных объектов которые от одного супертипа унаследованы
    public static void invoke(Card card) {
        card.setBalance(100);
        card.payInCountry(RU, 50);
        System.out.println("Текущий баланс:" + card.getBalance());
    }
}