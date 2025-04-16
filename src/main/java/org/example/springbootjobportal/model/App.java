package org.example.springbootjobportal.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
@Entity
@Table(name = "App")
public class App {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int applicationId;

    @ManyToOne
    @JoinColumn(name = "job_id")
    @JsonBackReference
    private Job jobId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users userId;

    @Enumerated(EnumType.STRING)
    private AppStatus status;

    private LocalDateTime applied_at;
}
