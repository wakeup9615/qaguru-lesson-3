package quru.qa.oop;

public abstract class Card {
    //класс - это описание типа данных
    protected String cardHolder;
    protected int balance;
    protected String cardNumber;
    protected PaymentSystem paymentSystem;

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < 0) {
            return;
        } else {
            System.out.println("added balance:" + balance);
            this.balance = balance;
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        if (cardNumber.length() != 16) {
            return;
        } else {
            this.cardNumber = cardNumber;
        }
    }

    public void setPaymentSystem(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public Card(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public PaymentSystem getPaymentSystem() {
        return paymentSystem;
    }

    protected boolean isBalanceGreaterOrEqualThan(int amount) {
        return balance >= amount;
    }

    public void payInCountry(Country country, int amount){
        if (isCountryValidForTheseCard(country) && isBalanceGreaterOrEqualThan(amount)) {
            balance = balance - amount;
            System.out.println("Accepted");
        }
    }

    protected abstract boolean isCountryValidForTheseCard(Country country);

}