package com.examplespringjpa.springjpa.repository;

import com.examplespringjpa.springjpa.model.Name;
import com.examplespringjpa.springjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {    //JpaRepository interface contains methods for all the CRUD operations on the entity.
}
