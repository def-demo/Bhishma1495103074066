package com.altimetrik.fordfleet.model.repository;

import com.altimetrik.fordfleet.model.*;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface DriverRepository extends JpaRepository<Driver, Long>{

}



