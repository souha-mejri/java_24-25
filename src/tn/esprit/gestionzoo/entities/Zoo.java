package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name; // Le nom du zoo ne doit pas être vide
    private String city;
    private final int nbrCages; // Rendre nbrCages constant
    private int animalCount; // Compteur d'animaux
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private int aquaticCount = 0;

    // Constructeur paramétré
    public Zoo(String name, String city, int nbrCages) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide.");
        }
        this.animals = new Animal[nbrCages]; // Limite à nbrCages animaux
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages; // Constante
        this.animalCount = 0; // Compteur d'animaux
    }

    // Méthode pour ajouter un animal
    public void addAnimal(Animal animal) throws ZooFullException {
        if (animalCount >= nbrCages) {
            throw new ZooFullException("Le zoo est plein ! Impossible d'ajouter plus d'animaux.");
        }
        animals[animalCount] = animal;
        animalCount++;
    }

    // Méthode pour supprimer un animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("L'animal n'est pas dans le zoo !");
            return false; // Animal non trouvé
        }

        // Supprimer l'animal en décalant les éléments
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--; // Décrémenter le compteur
        return true; // Suppression réussie
    }

    // Méthode pour afficher les animaux
    public void displayAnimals() {
        if (animalCount == 0) {
            System.out.println("Aucun animal dans le zoo.");
            return;
        }
        System.out.println("Animaux dans le zoo :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    // Méthode pour rechercher un animal
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i; // Retourner l'indice si trouvé
            }
        }
        return -1; // Pas trouvé
    }

    // Méthode pour vérifier si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    // Méthode pour comparer deux zoos
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.animalCount > z2.animalCount ? z1 : z2;
    }

    // Méthode pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
        System.out.println("Current Animal Count: " + animalCount);
    }

    //Méthode pour ajouter un animal aquatique
    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount >= 10) {
            System.out.println("Le tableau des animaux aquatiques est plein !");
            return;
        }
        aquaticAnimals[aquaticCount++] = aquatic;
    }

    public void displaySwimForAllAquatics() {
        System.out.println("Tous les animaux aquatiques nagent :");
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim(); // Appel polymorphique de swim()
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }


    // Override toString() pour afficher les informations du zoo
    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", animalCount=" + animalCount +
                '}';
    }

    // Getter pour le nom du zoo
    public String getName() {
        return name;
    }


    public int getNbrCages() {
        return nbrCages;
    }
}