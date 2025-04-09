package org.example.springbootjobportal.dao;

import org.example.springbootjobportal.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<Users, Integer> {
    
}
