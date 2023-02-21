public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Abdymomun");
        Person person2 = new Person("Matmusa");
        Person person3 = new Person("Baha");
        Person person4 = new Person("Manas");
        Person person5 = new Person("Ruslan");

        Habitat[] habitats = new Habitat[3];
        habitats[0] = new House("Mendeleeva 101", new Person[]{person1, person2, person3, person4, person5}, 100.0);
        habitats[1] = new Apartment("Toktonalieva 32", new Person[]{person1, person2, person3}, 500.0, 50.0);
        habitats[2] = new HotelRoom("Room 76", new Person[]{person4, person5}, 100.0);


        for (Habitat habitat : habitats) {
            System.out.println("Habitat: " + habitat.getClass().getSimpleName());
            System.out.println("Тургундардын саны: " + habitat.getNumResidents());
            System.out.println("Наркы: $" + habitat.getCost());
            System.out.println();
        }
    }
}

