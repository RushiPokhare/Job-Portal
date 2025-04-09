package org.example.springbootjobportal.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
@Entity
@Table(name = "Job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "job_id")
    private int job_id;
    private String title;
    private String description;
    private String company_name;
    private String location;

    @Enumerated(EnumType.STRING)
    private employment_type employment_type;

    @Enumerated(EnumType.STRING)
    private experience_level experience_level;

    private String salary_range;
    private LocalDateTime created_at;
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users posted_by;
}
