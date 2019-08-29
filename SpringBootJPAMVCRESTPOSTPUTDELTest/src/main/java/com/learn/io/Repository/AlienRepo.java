package com.learn.io.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.io.model.Alien;

public interface AlienRepo extends JpaRepository<Alien,Integer>{

}
