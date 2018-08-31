package com.geostar.wuhancitymsgboard.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geostar.wuhancitymsgboard.pojo.Newestanswer;

public interface AnswerRepository extends JpaRepository<Newestanswer, Integer> {
	
	Newestanswer findByTid(Integer tid);

}
