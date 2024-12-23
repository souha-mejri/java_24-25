package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic implements Herbivore<Food> {
    private float swimmingDepth; // Profondeur de nage

    // Constructeur par défaut
    public Penguin()throws InvalidAgeException  {
        super("Spheniscidae", "Penguin", 0, true, "Antarctica");
        this.swimmingDepth = 0.0f;
    }

    // Constructeur paramétré
    public Penguin(String name, int age, boolean isMammal, String habitat, float swimmingDepth) throws InvalidAgeException {
        super("Spheniscidae", name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    // Getter pour la profondeur de nage
    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth=" + swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }

    // Implémentation de la méthode eatPlant pour Herbivore
    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(this.getName() + " is eating plants.");
        } else {
            System.out.println(this.getName() + " cannot eat this type of food.");
        }
    }
}
