public class Apartment implements Habitat{
    private String address;
    private Person[] residents;
    private double rent;
    private double comService;

    public Apartment(String address, Person[] residents, double rent, double comService) {
        this.address = address;
        this.residents = residents;
        this.rent = rent;
        this.comService = comService;
    }

    public int getNumResidents() {
        return residents.length;
    }

    public double getCost() {
        return rent + comService;
    }

}