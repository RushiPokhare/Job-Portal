package org.example.springbootjobportal.controller;

import lombok.AllArgsConstructor;
import org.example.springbootjobportal.model.Job;
import org.example.springbootjobportal.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/job")
public class JobController {
    private final JobService jobService;

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.GetAll();
    }

    @PostMapping
    public Job Save(@RequestBody Job job) {
        return jobService.Save(job);
    }

    @PutMapping
    public Job UpdateJob(@RequestBody Job job) {
        return jobService.Save(job);
    }

    @GetMapping("/{id}")
    public Job getJobById(@PathVariable int id) {
        return jobService.getById(id);
    }

    @DeleteMapping
    public void deleteAll(Job job) {
        jobService.deleteAll();
    }

    @DeleteMapping("/{id}")
    public void deleteJobById(@PathVariable int id) {
        jobService.deleteById(id);
    }
}
