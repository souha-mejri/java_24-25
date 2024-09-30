public class Zoo {
    Animal[] animals;
     String name;
    String city;
     int nbrCages;
     int compteur =0 ;


    public Zoo(String name, String city, int nbrCages, int maxAnimals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[maxAnimals];
    }
    //public Zoo(int taille) {
      //  animals = new Animal[taille]; // Initialisation du tableau avec la taille spécifiée
        //compteur = 0;
    //}
        public boolean addAnimal(Animal animal) {

            if (compteur < animals.length) {
                animals[compteur] = animal;
                compteur++;
                return true;
            } else {
                return false;
            }
        }
        public int searchAnimal(Animal animal ) {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i].equals(animal)) {
                    return i;
                }
            }
            return -1;
        }
        public void afficher(){
        for(int i=0;i<animals.length;i++){
            System.out.println(animals[i]);
        }
        }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public Animal[] getAnimals() {
        return animals;
    }
}
