package tn.esprit.gestionzoo.main;

import java.util.Scanner;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    private Zoo myZoo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Saisie des informations du zoo
            System.out.print("Entrez le nom du zoo : ");
            String zooName = scanner.nextLine();

            System.out.print("Entrez le nombre de cages : ");
            int cages;
            while (true) {
                cages = scanner.nextInt();
                if (cages > 0) {
                    break;
                }
                System.out.print("Le nombre de cages doit être positif. Réessayez : ");
            }

            // Création du zoo
            Zoo zoo = new Zoo(zooName, "Tunis", cages);
            ZooManagement zooManagement = new ZooManagement(zoo);

            // Création d'animaux terrestres et aquatiques
            Terrestrial tiger = new Terrestrial("Felidae", "Tiger", 4, true, 4);
            Dolphin dolphin = new Dolphin("Dolphin", 3, true, "Ocean", 25.5f);
            Penguin penguin = new Penguin("Penguin", 2, true, "Antarctica", 15.0f);

            // Test des méthodes d'alimentation
            dolphin.eatMeat(Food.MEAT);
            dolphin.eatMeat(Food.PLANT); // Test avec un aliment incorrect

            penguin.eatPlant(Food.PLANT);
            penguin.eatPlant(Food.MEAT); // Test avec un aliment incorrect

            tiger.eatPlant(Food.PLANT);
            tiger.eatMeat(Food.MEAT);
            tiger.eatPlantAndMeat(Food.BOTH);

            // Ajout des animaux au zoo
            zoo.addAnimal(tiger);
            zoo.addAnimal(dolphin);
            zoo.addAnimal(penguin);

            // Affichage des informations des animaux
            System.out.println("\n--- Informations des Animaux ---");
            System.out.println(tiger);
            System.out.println(dolphin);
            System.out.println(penguin);

            // Appel des méthodes spécifiques aux animaux
            System.out.println("\n--- Activités des Animaux Aquatiques ---");
            dolphin.swim();
            penguin.swim();

            // Affichage des informations générales du zoo
            System.out.println("\n--- Informations du Zoo ---");
            zooManagement.displayInfo();

            System.out.println("\n--- Animaux dans le Zoo ---");
            zoo.displayAnimals();

            // Création d'autres animaux aquatiques
            Dolphin dolphin1 = new Dolphin("Dolphin1", 3, true, "Ocean", 25.5f);
            Dolphin dolphin2 = new Dolphin("Dolphin2", 5, true, "Ocean", 30.0f);
            Penguin penguin1 = new Penguin("Penguin1", 2, true, "Antarctica", 15.0f);

            zoo.addAquaticAnimal(dolphin1);
            zoo.addAquaticAnimal(dolphin2);
            zoo.addAquaticAnimal(penguin1);

            // Afficher les activités de nage de tous les animaux aquatiques
            System.out.println("\n--- Activités de Nage pour les Animaux Aquatiques ---");
            zoo.displaySwimForAllAquatics();

            // Profondeur maximale de nage des pingouins
            System.out.println("\nProfondeur maximale de nage des pingouins : "
                    + zoo.maxPenguinSwimmingDepth() + " m");

            // Nombre de dauphins et de pingouins
            System.out.println("\n--- Répartition des Animaux Aquatiques ---");
            zoo.displayNumberOfAquaticsByType();

        } catch (Exception e) {
            System.err.println("Une erreur est survenue : " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public ZooManagement(Zoo myZoo) {
        this.myZoo = myZoo;
    }

    public void displayInfo() {
        System.out.println(myZoo.getName() + " comporte " + myZoo.getNbrCages() + " cages.");
    }
}
