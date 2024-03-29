package com.learn.io.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.learn.io.model.Alien;

public interface AlienRepo extends CrudRepository<Alien,Integer>{

	ArrayList<Alien> findByTech(String tech);
	ArrayList<Alien> findByAidGreaterThan(int aid);
	
	@Query("from Alien where tech=?1 order by aName")
	ArrayList<Alien> findByTechSorted(String tech);
}
