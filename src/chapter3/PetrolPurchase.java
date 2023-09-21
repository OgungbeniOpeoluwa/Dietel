package chapter3;

public class PetrolPurchase {

        private String location;
        private String petrolType;
        private int quantityInLitters;
        private double pricePerLitter;
        private double percentageDiscount;

        public PetrolPurchase(String location, String petrolType, int quantityInLitters, double pricePerLitter, double percentageDiscount) {
            this.location = location;
            this.petrolType = petrolType;
            this.quantityInLitters = quantityInLitters;
            this.pricePerLitter = pricePerLitter;
            this.percentageDiscount = percentageDiscount;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public void setPetrolType(String petrolType) {
            this.petrolType = petrolType;
        }

        public void setquantityPurchaseInLitters(int quantityInLitters) {
            this.quantityInLitters = quantityInLitters;
        }

        public void setPricePerLitter(double pricePerLitter) {
            this.pricePerLitter = pricePerLitter;
        }

        public void setPercentageDiscount(double percentageDicount) {

            this.percentageDiscount = percentageDicount / 100;
        }

        public String getLocation() {
            return location;
        }

        public String getPetrolType() {
            return petrolType;
        }

        public int getQuantityInLitters() {
            return quantityInLitters;
        }

        public double getPricePerLitter() {
            return pricePerLitter;
        }

        public double getPercentageDiscount() {
            return percentageDiscount;
        }

        public double getPurchaseAmount() {
            double netAmount = quantityInLitters * pricePerLitter - percentageDiscount;
            return netAmount;
        }

    }





