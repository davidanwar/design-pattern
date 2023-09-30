package course1;

import course1.facede.HotelKeeper;

public class FacadeClient {
    public static void main(String[] args) {
        HotelKeeper hotelKeeper = new HotelKeeper();
        System.out.println(hotelKeeper.getVegManu());
    }
}
