public class NucleicAcid {
    private String name;
    private String chemicalFormula;
    private float molarMass;
    private float density;

    // Constructor
    public NucleicAcid(String name, String chemicalFormula, float molarMass, float density) {
        this.name = name;
        this.chemicalFormula = chemicalFormula;
        this.molarMass = molarMass;
        this.density = density;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChemicalFormula() {
        return chemicalFormula;
    }

    public void setChemicalFormula(String chemicalFormula) {
        this.chemicalFormula = chemicalFormula;
    }

    public float getMolarMass() {
        return molarMass;
    }

    public void setMolarMass(float molarMass) {
        this.molarMass = molarMass;
    }

    public float getDensity() {
        return density;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    // Print method
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Chemical Formula: " + chemicalFormula);
        System.out.printf("Molar Mass: %.2f g/mol\n", molarMass);
        System.out.printf("Density: %.3f g/cm³\n", density);
    }
}
