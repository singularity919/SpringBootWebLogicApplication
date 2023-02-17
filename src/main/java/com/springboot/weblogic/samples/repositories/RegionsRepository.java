package com.springboot.weblogic.samples.repositories;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.weblogic.samples.entities.Regions;

public interface RegionsRepository extends JpaRepository<Regions, BigDecimal> {

	Optional<Regions> findByRegionId(BigDecimal regionId);

	List<Regions> findByRegionName(String regionName);

}
