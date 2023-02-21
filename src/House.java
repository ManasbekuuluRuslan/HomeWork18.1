public class House implements Habitat{
    private String address;
    private Person[] residents;
    private double utilityBill;

    public House(String address, Person[] residents, double utilityBill) {
        this.address = address;
        this.residents = residents;
        this.utilityBill = utilityBill;
    }

    public int getNumResidents() {
        return residents.length;
    }

    public double getCost() {
        return utilityBill;
    }

}