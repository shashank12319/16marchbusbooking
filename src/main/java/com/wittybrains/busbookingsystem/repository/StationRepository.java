package com.wittybrains.busbookingsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wittybrains.busbookingsystem.model.Station;


public interface StationRepository extends JpaRepository<Station, Long> {


	//@Query("SELECT * FROM station WHERE station_code = :stationCode")

	    Optional<Station> findByStationCode(String stationCode);
	}



