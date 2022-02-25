package mnlsnn.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FAVORITE_CANDIDATE")
public class FavoriteCandidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "date_of_add_to_favorites")
    private LocalDateTime dateOfAddToFavorites;

    @ManyToOne()
    @JoinColumn(name = "employer")
    private Employer employer;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;


}