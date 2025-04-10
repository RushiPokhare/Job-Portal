package org.example.springbootjobportal.controller;

import lombok.AllArgsConstructor;
import org.example.springbootjobportal.dao.InterviewDao;
import org.example.springbootjobportal.model.Interview;
import org.example.springbootjobportal.service.InterviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/interview")
public class InterviewController {
    private InterviewService interviewService;

    @GetMapping
    public List<Interview> getInterviews() {
        return interviewService.getInterviews();
    }

    @PostMapping
    public Interview saveInterview(Interview interview) {
        return interviewService.SaveInterview(interview);
    }

    @PutMapping
    public Interview updateInterview(Interview interview) {
        return interviewService.updateInterview(interview);
    }

    @GetMapping("/{id}")
    public Interview getInterviewById(int id) {
        return interviewService.findInterviewById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteInterviewById(int id) {
        interviewService.deleteInterview(id);
    }

    @DeleteMapping
    public void deleteAllInterviews() {
        interviewService.deleteAllInterviews();
    }
}
