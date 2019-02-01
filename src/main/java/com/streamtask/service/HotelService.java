package com.streamtask.service;

import java.math.BigInteger;
import java.util.Map;

import dto.HotelRequest;
import dto.HotelResponse;

public interface HotelService {
	
	HotelResponse findAvailableHotelByCityAndDate(HotelRequest request);
	
	Map<Integer,BigInteger> findHotelByRating(HotelRequest request);

}
