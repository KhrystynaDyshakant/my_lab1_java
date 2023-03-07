package ua.lviv.iot.algo.part1.lab1;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Hotel {
    private String name;
    private int totalRooms;
    private int availableRooms;
    private int rating;
    private static Hotel instance;
    public static Hotel getInstance() {
        if (instance == null) {
            instance = new Hotel();
        }
        return instance;
    }
    public Hotel() {
        this.name = name;
        this.totalRooms = totalRooms;
        this.availableRooms = availableRooms;
        this.rating = rating;
    }
    public Hotel(String name, int totalRooms, int availableRooms, int rating) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.availableRooms = availableRooms;
        this.rating = rating;
    }
    public void bookRoom() {
        if (availableRooms > 0) {
            availableRooms--;
        } else {
            System.out.println("Зменшує кількість вільних кімнат на 1");
        }
    }
    public void releaseRoom() {
        availableRooms++;
    }
    public int getAvailableRooms() {
        return availableRooms;
    }
    public int getBookedRoomsCount() {
        return totalRooms - availableRooms;
    }
    @Override
    public String toString() {
        return "Hotel " + "name='" + name + '\'' + ", totalRooms=" + totalRooms + ", availableRooms=" + availableRooms +
                ", rating=" + rating ;
    }
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel();
        Hotel hotel2 = new Hotel("Grand ", 100, 80, 4);
        Hotel hotel3 = Hotel.getInstance();
        Hotel hotel4 = Hotel.getInstance();
        Hotel[] hotels = {hotel1, hotel2, hotel3, hotel4};
        for (Hotel hotel : hotels) {
            System.out.println(hotel.toString());
        }
    }
}