package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed; // Vitesse de nage

    // Constructeur paramétré
    public Dolphin(String name, int age, boolean isMammal, String habitat, float swimmingSpeed)throws InvalidAgeException {
        super("Cetacea", name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    // Getter
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingSpeed=" + swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
