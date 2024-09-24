public class Main {
    public static void main(String[] args) {
       
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        
        Zoo myZoo = new Zoo("My Zoo", "Paris", 10, 25);

        System.out.println("Zoo: " + myZoo.getName() + ", City: " + myZoo.getCity());
        System.out.println("Animal: " + lion.getName() + ", Family: " + lion.getFamily());
    }
}
