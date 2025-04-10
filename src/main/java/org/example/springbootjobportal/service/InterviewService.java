package org.example.springbootjobportal.service;

import lombok.AllArgsConstructor;
import org.example.springbootjobportal.dao.InterviewDao;
import org.example.springbootjobportal.model.Interview;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InterviewService {
    private InterviewDao interviewDao;

    public List<Interview> getInterviews() {
        return interviewDao.findAll();
    }

    public Interview SaveInterview(Interview interview) {
        return interviewDao.save(interview);
    }

    public Interview updateInterview(Interview interview) {
        return interviewDao.save(interview);
    }

    public Interview findInterviewById(int id) {
        return interviewDao.getById(id);
    }

    public void deleteInterview(int id) {
        interviewDao.deleteById(id);
    }

    public void deleteAllInterviews() {
        interviewDao.deleteAll();
    }
}
