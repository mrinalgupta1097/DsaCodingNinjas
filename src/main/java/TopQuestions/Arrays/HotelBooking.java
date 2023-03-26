package TopQuestions.Arrays;

import java.util.ArrayList;
import java.util.List;

public class HotelBooking {
    public static int hotelBookings(List<String> queries) {
        int countCoin = 0;
        for (String string : queries) {
            if (string.charAt(0) == '+') {
                countCoin++;
            }
        }
        return countCoin;
    }

    public static void main(String[] args) {
        List<String> queries = new ArrayList<>();
        queries.add("+1A");
        queries.add("+3E");
        queries.add("-1A");
        queries.add("+4F");
        queries.add("+1A");
        queries.add("-3E");
        System.out.println(hotelBookings(queries));


    }
}
