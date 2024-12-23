package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore<Food> {
    private int nbrLegs; // Nombre de pattes de l'animal terrestre

    // Constructeur paramétré
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs)throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(this.getName() + " is eating meat.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(this.getName() + " is eating plants.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println(this.getName() + " is eating both plants and meat.");
        } else {
            System.out.println(this.getName() + " is only eating " + food.toString().toLowerCase() + ".");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs=" + nbrLegs;
    }
}
