package com.reformix.database.springdatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.reformix.database.springdatabase.jpa.PersonJpaRepository;

@SpringBootApplication
public class SpringJpaDatabaseApplication implements CommandLineRunner {
	@Autowired
	PersonJpaRepository repository;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Data for id -->{}",repository.findById(10003)); 
//		logger.info("Data for id 10001 -->{}",dao.findById(10001));
//		logger.info("Data for location New York -->{}",dao.findByLocation("New York"));
//		logger.info("Delete for id 10002 -->number of rows deleted{}",dao.deleteById(10002));
//		logger.info("inserting data no. of rows affected is -->{}",dao.insert(new Person(10004,"Tara","Berlin",new Date())));
//		logger.info("Number of rows updated --> {}",dao.update(new Person(10003,"Pratik","Paris",new Date())));
	}

}
