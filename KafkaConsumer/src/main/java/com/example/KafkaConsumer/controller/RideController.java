package com.example.KafkaConsumer.controller;


	import java.util.List;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.example.KafkaConsumer.entity.RideEntity;
	import com.example.KafkaConsumer.repository.RideRepository;

	@RestController
	@RequestMapping("/rides")
	public class RideController {

	    private final RideRepository repository;

	    public RideController(RideRepository repository) {
	        this.repository = repository;
	    }

	    @GetMapping
	    public List<RideEntity> getAllRides() {
	        return repository.findAll();
	    }

	    @GetMapping("/{id}")
	    public RideEntity getRide(@PathVariable Long id) {
	        return repository.findById(id).orElse(null);
	    }
	}


