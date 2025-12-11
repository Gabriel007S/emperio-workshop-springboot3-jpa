package com.emperio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emperio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
