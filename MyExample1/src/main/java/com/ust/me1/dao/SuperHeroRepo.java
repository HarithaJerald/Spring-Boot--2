package com.ust.me1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ust.me1.SuperHero;

public interface SuperHeroRepo extends CrudRepository<SuperHero, Integer> {
	
	@Query("from SuperHero where sAbility = ?1")
	List<SuperHero> findBysAbility(String sAbility);
		
	List<SuperHero> findBysIdGreaterThan(int sId);
}
