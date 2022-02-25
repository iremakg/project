package mnlsnn.project.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "JOB_POSTING_CONFIRMATION")

public class JobPostingConfirmation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "is_confirmed")
    private boolean isConfirmed;

    @OneToOne()
    @JoinColumn(name = "job_posting", referencedColumnName = "id")
    private JobPosting jobPosting;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne()
    @JoinColumn(name = "confirmation_type")
    private ConfirmationType confirmationType;
}
