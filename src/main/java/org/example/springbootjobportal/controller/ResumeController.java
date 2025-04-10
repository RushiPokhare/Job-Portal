package org.example.springbootjobportal.controller;

import lombok.AllArgsConstructor;
import org.example.springbootjobportal.model.Resume;
import org.example.springbootjobportal.service.ResumeService;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/resume")
public class ResumeController {
    private ResumeService resumeService;

    @GetMapping
    public List<Resume> getAllResume() {
        return resumeService.getAllResumes();
    }

    @PostMapping
    public Resume saveResume(@RequestBody Resume resume) {
        return resumeService.saveResume(resume);
    }

    @PutMapping
    public Resume updateResume(@RequestBody Resume resume) {
        return resumeService.updateResume(resume);
    }

    @GetMapping("/{id}")
    public Resume getResume(@PathVariable int id) {
        return resumeService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteResumeid(@PathVariable int id) {
        resumeService.deleteById(id);
    }

    @DeleteMapping
    public void deleteResumes() {
        resumeService.deleteAll();
    }
}
