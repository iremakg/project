package mnlsnn.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "CV")
public class Cv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "hobbies")
    private String hobbies;

    @Column(name = "certificate")
    private String certificate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "cover_letter", referencedColumnName = "id")
    private CoverLetter coverLetter ;

    @ManyToOne
    @JoinColumn(name = "education")
    private Education education;

    @ManyToOne
    @JoinColumn(name = "language_level")
    private LanguageLevel languageLevel;

    @ManyToOne
    @JoinColumn(name = "link_name")
    private LinkName linkName;

    @ManyToOne
    @JoinColumn(name = "skill")
    private Skill skill;

    @ManyToOne
    @JoinColumn(name = "job_title")
    private JobTitle jobTitle;


}
