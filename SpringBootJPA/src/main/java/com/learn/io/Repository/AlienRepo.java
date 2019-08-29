package com.learn.io.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.learn.io.model.Alien;

public interface AlienRepo extends CrudRepository<Alien,Integer>{

}
