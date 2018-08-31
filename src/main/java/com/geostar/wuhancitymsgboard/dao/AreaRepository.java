package com.geostar.wuhancitymsgboard.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geostar.wuhancitymsgboard.pojo.Area;


@Repository
public interface AreaRepository extends JpaRepository<Area, Integer>{

}
