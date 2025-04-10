package org.example.springbootjobportal.dao;

import org.example.springbootjobportal.model.Interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewDao extends JpaRepository<Interview, Integer> {

}
