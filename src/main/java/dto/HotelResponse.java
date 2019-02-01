package dto;

import java.util.ArrayList;
import java.util.List;

public class HotelResponse {

	List<Hotel> hotels;

	public List<Hotel> getHotels() {
		
		if(hotels == null){
			hotels = new ArrayList<>();
		}
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
	
	
	
}
