package com.reformix.database.springdatabase.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.reformix.database.springdatabase.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {
	
	@PersistenceContext
	EntityManager manager;

	public Person findById(int id) {

		return manager.find(Person.class, id);
	}

}
