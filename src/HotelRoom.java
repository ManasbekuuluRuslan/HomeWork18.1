public class HotelRoom implements Habitat{
    private String roomNumber;
    private Person[] residents;
    private double roomCost;

    public HotelRoom(String roomNumber, Person[] residents, double roomCost) {
        this.roomNumber = roomNumber;
        this.residents = residents;
        this.roomCost = roomCost;
    }

    public int getNumResidents() {
        return residents.length;
    }

    public double getCost() {
        return roomCost;
    }

}