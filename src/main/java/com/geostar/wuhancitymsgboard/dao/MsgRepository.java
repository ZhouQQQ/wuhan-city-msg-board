package com.geostar.wuhancitymsgboard.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geostar.wuhancitymsgboard.pojo.Threads;

public interface MsgRepository extends JpaRepository<Threads, Integer> {

}
