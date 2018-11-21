package com.examplespringjpa.springjpa.repository;


import com.examplespringjpa.springjpa.model.CompDetails;
import com.examplespringjpa.springjpa.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompRepository extends JpaRepository<Company, Long> {    //JpaRepository interface contains methods for all the CRUD operations on the entity.
}
