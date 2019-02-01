package dto;

import java.math.BigInteger;

public class Hotel {
	
	private BigInteger hotelId;
	private String name;
	private String description;
	private HotelAddress address;
	public BigInteger getHotelId() {
		return hotelId;
	}
	public void setHotelId(BigInteger hotelId) {
		this.hotelId = hotelId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public HotelAddress getAddress() {
		return address;
	}
	public void setAddress(HotelAddress address) {
		this.address = address;
	}

	
	
}
