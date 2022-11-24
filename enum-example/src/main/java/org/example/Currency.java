package org.example;

public enum Currency implements Convertable {
    // "рубль", "рубля", "рублей"
    // "доллар", "доллара, "доллалов"
    RUB(new String[]{"рубль", "рубля", "рублей"}){
        @Override
        void showMessage(String message) {

        }
    },
    USD(new String[]{"доллар", "доллара", "долларов"}){
        @Override
        void showMessage(String message) {

        }
    };

    private final String[] endings;

    Currency(String[] endings) {
        this.endings = endings;
    }

    public String getEndingMessage(int amount) {
        if(amount == 1) {
            return endings[0];
        } else if(amount <= 4 && amount >= 2) {
            return endings[1];
        } else {
            return endings[2];
        }
    }

    abstract void showMessage(String message);


    @Override
    public double convert(double amount, Currency currency) {
        CurrencyRate rate = CurrencyRate.getRate(this, currency);
        return amount* rate.rate;
    }
}
