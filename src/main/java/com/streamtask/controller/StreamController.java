package com.streamtask.controller;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.streamtask.service.HotelService;

import dto.Hotel;
import dto.HotelRequest;
import dto.HotelResponse;

@RestController
public class StreamController {
	
	@Autowired
	private HotelService hotelService;
	
	@GetMapping("/getHotels")
	public ResponseBodyEmitter handleRequest(@Valid HotelRequest request){
		
		final SseEmitter emitter = new SseEmitter();
		 ExecutorService service = Executors.newSingleThreadExecutor();
	        service.execute(() -> {
		HotelResponse response = new HotelResponse();
		response.getHotels().add(new Hotel());
		//HotelResponse response = hotelService.findAvailableHotelByCityAndDate(request);
		try {
			emitter.send(response);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			
			Thread.sleep(10000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 emitter.completeWithError(e);
             return;
		}
		
		Map<Integer,BigInteger> ratings = new HashMap<Integer,BigInteger>();
	//	Map<Integer,BigInteger> ratings = hotelService.findHotelByRating(request);
		ratings.put(1, new BigInteger("10"));
		try {
			emitter.send(ratings);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 emitter.completeWithError(e);
             return;
		}
	        
		emitter.complete();
	   
	 });
		return emitter;
	}

}
