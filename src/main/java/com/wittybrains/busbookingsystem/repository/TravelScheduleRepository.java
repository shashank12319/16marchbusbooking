package com.wittybrains.busbookingsystem.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wittybrains.busbookingsystem.model.Station;
import com.wittybrains.busbookingsystem.model.TravelSchedule;


public interface TravelScheduleRepository extends JpaRepository<TravelSchedule, Long> {
	//@Query("SELECT ts FROM travel_schedule ts WHERE source_id = :source AND destination_id = :destination AND estimated_arrival_time > :estimatedArrivalTime")
    List<TravelSchedule> findBySourceAndDestinationAndEstimatedArrivalTimeAfter(String source, String destination, LocalDateTime estimatedArrivalTime);
	//@Query("SELECT FROM travel_schedule WHERE source_id = :source AND destination_id = :destination AND estimated_arrival_time > :currentDateTime")

	List<TravelSchedule> findBySourceAndDestinationAndEstimatedArrivalTimeAfter(Station source, Station destination,
			LocalDateTime currentDateTime);
	
	// @Query("SELECT * FROM source WHERE source_id=:source")
	
	//@Query(value="select * from source",nativeQuery=true)
	 List<TravelSchedule> findBySource(Station source);
	 
	 List<TravelSchedule> findByEstimatedArrivalTimeBefore(LocalDateTime localDateTime);
	 @Query(nativeQuery=true,value="select ts.* from travel_schedule ts WHERE ts.estimated_arrival_time < :localDateTime" )
	 List<TravelSchedule> findByEstimatedArrivalTime(LocalDateTime localDateTime);
	 
	}



