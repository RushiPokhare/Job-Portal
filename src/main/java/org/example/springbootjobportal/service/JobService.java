package org.example.springbootjobportal.service;

import lombok.AllArgsConstructor;
import org.example.springbootjobportal.dao.JobDao;
import org.example.springbootjobportal.model.Job;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
@AllArgsConstructor
public class JobService {
    private JobDao jobDao;

    public Job Save(Job job) {
        job.setCreated_at(LocalDateTime.now());
        return jobDao.save(job);
    }

    public Job Update(Job job) {
        job.setUpdatedAt(LocalDateTime.now());
        return jobDao.save(job);
    }
    public List<Job> GetAll() {
        return jobDao.findAll();
    }
    public Job getById(int id) {
        return jobDao.findById(id).get();
    }

    public void deleteById(int id) {
        jobDao.deleteById(id);
    }

    public void deleteAll() {
        jobDao.deleteAll();
    }
}
