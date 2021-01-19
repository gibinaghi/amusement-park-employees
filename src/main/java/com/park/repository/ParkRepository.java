package com.park.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.park.repository.model.Park;

@Repository
public interface ParkRepository extends JpaRepository<Park, Integer>  {

}
