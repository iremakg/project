package mnlsnn.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "JOB_POSTING")
public class JobPosting {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    private String Description;

    @Column(name = "number_of_open_positions")
    private int numberOfOpenPositions;

    @Column(name = "salary_min")
    private String salaryMin;

    @Column(name = "salary_max")
    private String salaryMax;


    @Column(name = "is_active")
    private boolean isActive;

    @ManyToOne()
    @JoinColumn(name = "employer")
    private Employer employer;

    @ManyToOne()
    @JoinColumn(name = "job_title")
    private JobTitle jobTitle;

    @ManyToOne()
    @JoinColumn(name = "city")
    private City city;

    @ManyToOne()
    @JoinColumn(name = "working_time")
    private WorkingTime workingTime;

    @ManyToOne()
    @JoinColumn(name = "working_type")
    private WorkingType workingType;

    @JsonIgnore
    @OneToOne(mappedBy = "jobPosting")
    private JobPostingConfirmation jobPostingConfirmation;

    @OneToMany(mappedBy = "jobPosting")
    List<FavoriteJobPosting> favoriteJobPostings;

}
