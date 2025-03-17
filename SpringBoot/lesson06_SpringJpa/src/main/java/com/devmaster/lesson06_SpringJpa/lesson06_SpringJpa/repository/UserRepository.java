package com.devmaster.lesson06_SpringJpa.lesson06_SpringJpa.repository;

import com.devmaster.lesson06_SpringJpa.lesson06_SpringJpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
