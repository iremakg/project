package mnlsnn.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "EDUCATION")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "education_name")
    private String educationName;

    @Column(name = "department")
    private String department;


    @Column(name = "starting_date")
    private LocalDate startingDate;

    @Column(name = "graduation_date")
    private LocalDate graduationDate;

    @JsonIgnore
    @OneToMany(mappedBy = "education")
    private List<Cv> cvs;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public String getGraduationDate() {

        if (graduationDate == null) {
            return "Devam ediyor.";
        }

        return graduationDate.toString();
    }
}
