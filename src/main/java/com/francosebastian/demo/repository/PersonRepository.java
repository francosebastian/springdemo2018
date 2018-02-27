package com.francosebastian.demo.repository;

import com.francosebastian.demo.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * A classic JPA repository for Person entity
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
