package chapter4;

public class TaxCalculator {
    private String name;
    private int tax;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void calculator(int amount) {
        if(amount <= 30000){
            tax = 15 * amount / 100;
        }
        if(amount >= 30000){
            tax = 20 * amount / 100;
        }
        if(amount < 0){
           this.tax = 0;
        }
    }

    public int totalTax() {
        return tax;
    }
}
