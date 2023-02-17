package com.springboot.weblogic.samples;

import java.math.BigDecimal;
import java.util.Optional;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.weblogic.samples.entities.Regions;
import com.springboot.weblogic.samples.repositories.RegionsRepository;

@SpringBootTest
class SpringBootWebLogicApplicationTests {
	
	@Resource
	RegionsRepository regionsRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void accessTest() {
		Optional<Regions> optional = regionsRepository.findById(new BigDecimal(2));
		optional.map(Regions::getRegionName);
		
		Optional<Regions> optional2 = Optional.empty();
		//System.out.println("Optional test: "+optional2.orElse(null));
		
		System.out.println("user id: "+optional.orElse(new Regions()).getRegionName());
	}
	
}
