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
@Table(name = "CONFIRMATION_TYPE")
public class ConfirmationType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "type")
    private String type;

   @OneToMany(mappedBy = "confirmationType")
   List<JobPostingConfirmation> jobPostingConfirmations;
}
