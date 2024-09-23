public class Main {
    public static void main(String[] args) {
        // Création d'un animal (lion)
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        // Création d'un zoo (myZoo)
        Zoo myZoo = new Zoo("My Zoo", "Paris", 10, 25);

        // Ajout de l'animal dans le zoo (facultatif, nécessite une méthode d'ajout)
        // myZoo.addAnimal(lion); // Implémentez une méthode pour ajouter l'animal si nécessaire

        // Affichage des informations (facultatif)
        System.out.println("Zoo: " + myZoo.getName() + ", City: " + myZoo.getCity());
        System.out.println("Animal: " + lion.getName() + ", Family: " + lion.getFamily());
    }
}
