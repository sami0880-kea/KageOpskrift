public class Ingredienser {
    // Attributter
    private String type; // type kan være smør, sukker, æg osv.
    private double amount; // amount er mængden af ingrediensen
    private String unit; // unit er måleenheden, som mængden bliver målt i
    private double energi;
    private double weightPerUnit;

    public Ingredienser(String type, double amount, String unit, double energi, double weightPerUnit) {
        // Konstruktør
        this.type = type;
        this.amount = amount;
        this.unit = unit;
        this.energi = energi;
        this.weightPerUnit = weightPerUnit;
    }

    // get metoder
    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public double getEnergi() {
        return energi;
    }

    public double getWeightPerUnit() {
        return weightPerUnit;
    }
}