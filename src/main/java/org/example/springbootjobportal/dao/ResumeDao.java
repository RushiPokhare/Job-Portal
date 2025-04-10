package org.example.springbootjobportal.dao;

import org.example.springbootjobportal.model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeDao extends JpaRepository<Resume, Integer> {

}
