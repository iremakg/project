package mnlsnn.project.model;

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
@Table(name = "EMPLOYER")
public class Employer {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "company_name")
    private String companyName;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name = "web_adress")
    private String webAdress;

    @OneToMany(mappedBy = "employer")
    List<FavoriteCandidate> favoriteCandidates;

    @OneToMany(mappedBy = "employer")
    List<JobPosting> jobPostings;
}
