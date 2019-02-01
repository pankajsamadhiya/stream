package dto;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;



public class HotelRequest {
	@NotEmpty
	private String city;
	private String state;
	private String country;
	
	@NonNull
	private Date checkInDate;
	
	@NotNull
	private Date checkOutDate;
	private int noOfRoom;
	private int noOfAdult;
	private int noOfChild;
	
	
	
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public int getNoOfRoom() {
		return noOfRoom;
	}
	public void setNoOfRoom(int noOfRoom) {
		this.noOfRoom = noOfRoom;
	}
	public int getNoOfAdult() {
		return noOfAdult;
	}
	public void setNoOfAdult(int noOfAdult) {
		this.noOfAdult = noOfAdult;
	}
	public int getNoOfChild() {
		return noOfChild;
	}
	public void setNoOfChild(int noOfChild) {
		this.noOfChild = noOfChild;
	}
	
	
	

}
