import java.text.DecimalFormat;

public class Opskrifter {
    private String navn;
    static double totalWeight;
    static double totalEnergy;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private Ingredienser[] ingrediens;

    public Opskrifter() {
        this.navn = "Sandkage";
        Ingredienser mel = new Ingredienser("Mel", 41.67, "gram", 304.5, 41.67);
        Ingredienser sukker = new Ingredienser("Sukker", 41.67, "gram", 425, 41.67);
        Ingredienser smør = new Ingredienser("Smør", 41.67, "gram", 374.46, 41.67);
        Ingredienser æg = new Ingredienser("Æg", 0.67, "stk.", 120.25, 40.2);
        Ingredienser bagepulver = new Ingredienser("Bagepulver", 0.33, "tsk.", 0.7755, 1.65);
        this.ingrediens = new Ingredienser[]{mel, sukker, smør, æg, bagepulver};
    }

    public String getNavn(String navn) {
        for(Ingredienser ingrediens : ingrediens) {
            printProduct(ingrediens.getType(), ingrediens.getAmount(), ingrediens.getUnit(), ingrediens.getEnergi(), ingrediens.getWeightPerUnit());
        }
        System.out.println("------------------------");
        System.out.println("Total energiindhold (kJ): " + df.format(totalEnergy));
        System.out.println("Total vægt (gram): " + df.format(totalWeight));
        return null;
    }

    static void printProduct(String type, double amount, String unit, double energi, double weightPerUnit)
    {
        totalWeight += weightPerUnit * Main.antalPersoner;
        totalEnergy += energi * Main.antalPersoner;
        System.out.println(type + " - [" + df.format(amount * Main.antalPersoner) + " "
                + unit + "] ("+ df.format(energi * Main.antalPersoner) + " kJ) - "
                + df.format(weightPerUnit * Main.antalPersoner) + " gram");
    }
}
