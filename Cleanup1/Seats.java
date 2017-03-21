/**
 * Class which holds the layout of the theatre through a String array.
 * Each index represents a seat in the theatre layout.
 */
public class Seats {
    String[][] seats;

    /**
     * Constructor for the Seats.
     * Creates a 2-D Array of Strings to represent seats.
     */
    public Seats() {
        seats = new String[10][10];
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats.length; col++) {
                seats[row][col] = "O";
            }
        }
    }

    /**
     * @param row - the current row.
     * @param col - the current column.
     * @return boolean - if the seat is sold or not
     */
    public boolean isSold(int row, int col) {
        if ("O".compareTo(seats[row][col]) == 0) {
            return false;
        }
        return true;
    }

    /**
     * Method to convert the current 'seat' as a String for printing purposes.
     * @return the seat object as a String.
     */
    public String toString() {
        for (int i = 0; i < seats.length; i++) {
            for (int x = 0; x < seats.length; x++) {
                System.out.print(seats[i][x] + "\t");
            }
            System.out.println();
        }
        return "";
    }

    /**
     * Checks to see if there is an available seat.
     * @return whether or not there is any seats available.
     */
    public boolean soldAllSeats() {
        boolean soldAllSeats = false;
        for (int i = 0; i < seats.length; i++) {
            for (int x = 0; x < seats.length; x++) {
                if (!isSold(i, x)) {
                    soldAllSeats = true;
                }
            }
        }
        return soldAllSeats;
    }

    /**
     * Generic tester for testing the 2D String of seats.
     */
    public static void main(String[] args) {
        Seats s = new Seats();
        for (int i = 0; i < 10; i++) {
            for (int x = 0; x < 10; x++) {
                s.seats[i][x] = "l";
            }
        }
        System.out.println(s.soldAllSeats());
    }
}