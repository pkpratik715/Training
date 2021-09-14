package com.reformix.database.springdatabase.jdbc;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.reformix.database.springdatabase.entity.Person;

@Repository
public class PersonJdbcDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Person> findAll() {

		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
	}

	public Person findById(int id) {

		Person queryForObject = jdbcTemplate.queryForObject("select * from person where id = ?", new Object[] { id },
				new BeanPropertyRowMapper<Person>(Person.class));
		return queryForObject;
	}

	public Person findByLocation(String location) {
		Person person = jdbcTemplate.queryForObject("select * from person where Location = ?",
				new Object[] { location }, new BeanPropertyRowMapper<Person>(Person.class));
		return person;
	}

	public int deleteById(int id) {

		int delete = jdbcTemplate.update(("delete from person where id = ? "), new Object[] { id });
		return delete;
	}

	public int insert(Person person) {

		int insert = jdbcTemplate.update("insert into person (id, name, location, birth_date )" + "VALUES(? ,? ,? ,? );",
				new Object[] { person.getId(), person.getName(), person.getLocation(),
						new Timestamp(person.getDate().getTime()) });

		return insert;

	}

	public int update(Person person) {
		int update = jdbcTemplate.update("update person" + " set name = ?, location = ?, birth_date = ?" + "where id = ?",
				new Object[] { person.getName(), person.getLocation(), new Timestamp(person.getDate().getTime()),
						person.getId() });
		return update;
	}
}
