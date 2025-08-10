package com.example.restaurant_consumer.feign;
	
    import com.example.restaurantconsumer.model.Restaurant;
	import org.springframework.cloud.openfeign.FeignClient;
	import org.springframework.web.bind.annotation.GetMapping;

	@FeignClient(name = "restaurant-producer")
	public interface RestaurantClient {
	    @GetMapping("/restaurant/get")
	    Restaurant getRestaurant();
	}

