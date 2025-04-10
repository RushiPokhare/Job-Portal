package org.example.springbootjobportal.service;

import lombok.AllArgsConstructor;
import org.example.springbootjobportal.dao.ResumeDao;
import org.example.springbootjobportal.model.Resume;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ResumeService {
    private ResumeDao resumeDao;

    public List<Resume> getAllResumes() {
        return resumeDao.findAll();
    }

    public Resume saveResume(Resume resume) {
        return resumeDao.save(resume);
    }

    public Resume updateResume(Resume resume) {
        return resumeDao.save(resume);
    }

    public Resume getById(int id) {
        return resumeDao.findById(id).get();
    }

    public void deleteById(int id) {
        resumeDao.deleteById(id);
    }

   public void deleteAll() {
        resumeDao.deleteAll();
   }
}
