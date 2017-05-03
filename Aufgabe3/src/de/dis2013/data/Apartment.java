package de.dis2013.data;

/**
 * Created by kbrusch on 5/3/17.
 */
public class Apartment extends Immobilie {
    private int floors;
    private int rent;
    private int rooms;
    private int balcony;
    private int kitchen;

    public Apartment() {
        super();
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getBalcony() {
        return balcony;
    }

    public void setBalcony(int balcony) {
        this.balcony = balcony;
    }

    public int getKitchen() {
        return kitchen;
    }

    public void setKitchen(int kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apartment)) return false;
        if (!super.equals(o)) return false;

        Apartment apartment = (Apartment) o;

        if (getFloors() != apartment.getFloors()) return false;
        if (getRent() != apartment.getRent()) return false;
        if (getRooms() != apartment.getRooms()) return false;
        if (getBalcony() != apartment.getBalcony()) return false;
        return getKitchen() == apartment.getKitchen();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getFloors();
        result = 31 * result + getRent();
        result = 31 * result + getRooms();
        result = 31 * result + getBalcony();
        result = 31 * result + getKitchen();
        return result;
    }
}
