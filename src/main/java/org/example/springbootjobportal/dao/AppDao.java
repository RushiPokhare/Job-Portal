package org.example.springbootjobportal.dao;

import org.example.springbootjobportal.model.App;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppDao extends JpaRepository<App, Integer> {

}
