package org.example.springbootjobportal.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
@Entity
@Table(name = "Resume")
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int resume_id;

    @OneToOne
    @JsonBackReference
    @JoinColumn(name = "user_id")
    private Users user_id;

    private String resume_url;

    private LocalDateTime created_at;
}
