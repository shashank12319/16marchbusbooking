package com.wittybrains.busbookingsystem.model;

import java.time.LocalDateTime;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wittybrains.busbookingsystem.repository.TravelScheduleRepository;

@Component
public class Test {
@Autowired
private TravelScheduleRepository travelScheduleRepository;

@PostConstruct
void init () {
	travelScheduleRepository.findByEstimatedArrivalTimeBefore(LocalDateTime.now());
	System.out.println("here");
	travelScheduleRepository.findByEstimatedArrivalTime(LocalDateTime.now());
	System.out.println();
}
}
