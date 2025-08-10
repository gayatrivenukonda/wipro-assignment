package com.example.restaurant_consumer.controller;
	

	import com.example.restaurantconsumer.feign.RestaurantClient;
	import com.example.restaurantconsumer.model.Restaurant;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

	@RestController
	@RequestMapping("/consumer")
	public class ConsumerController {

	    @Autowired
	    private RestaurantClient client;

	    @GetMapping("/call")
	    public Restaurant callProducer() {
	        return client.getRestaurant();
	    }
	}

