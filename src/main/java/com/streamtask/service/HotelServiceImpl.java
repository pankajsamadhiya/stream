package com.streamtask.service;

import java.math.BigInteger;
import java.util.Map;

import org.springframework.stereotype.Service;

import dto.HotelRequest;
import dto.HotelResponse;

@Service
public class HotelServiceImpl implements HotelService {

	@Override
	public HotelResponse findAvailableHotelByCityAndDate(HotelRequest request) {
		
		return null;
	}

	@Override
	public Map<Integer, BigInteger> findHotelByRating(HotelRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
