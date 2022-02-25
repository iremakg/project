package mnlsnn.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "LANGUAGE_LEVEL")
public class LanguageLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "language")
    private Language language;

    @ManyToOne
    @JoinColumn(name = "level")
    private Level level;

    @JsonIgnore
    @OneToMany(mappedBy = "languageLevel")
    private List<Cv> cvs;
}