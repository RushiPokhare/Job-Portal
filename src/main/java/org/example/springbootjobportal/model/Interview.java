package org.example.springbootjobportal.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
@Entity
@Table(name = "Interview")
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int interview_id;

    @OneToOne
    @JoinColumn(name = "application_id")
    private App application_id;

    private String scheduled_time;

    private String meeting_link;

    private Interview_Status status;
}
