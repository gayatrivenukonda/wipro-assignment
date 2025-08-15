package com.example.KafkaConsumer.repository;

	import org.springframework.data.jpa.repository.JpaRepository;

	import com.example.KafkaConsumer.entity.RideEntity;

	public interface RideRepository extends JpaRepository<RideEntity, Long> {
	}

