package quru.qa.oop;

public enum Country {
    RU("Россия"), US("США"), CN("Китай");
    private String countryName;
    Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}
