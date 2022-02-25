package mnlsnn.project.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "USERS")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Email(message = "Lütfen geçerli bir e-posta adresi giriniz.")
    @NotNull(message = "E-posta alanı boş geçilemez.")
    @Column(name = "email", unique = true)
    private String email;
    @NotNull(message = "Parola alanı boş geçilemez.")
    @Column(name = "password")
    private String password;
    @Column(name = "is_activeted")
    private Boolean isActiveted;
    @Column(name = "dateOfBrith")
    private LocalDate date_of_birth;
    @Column(name = "identity_number")
    private String identityNumber;

    @OneToMany(mappedBy = "user")
    List<CoverLetter> coverLetters;

    @OneToMany(mappedBy = "user")
    List<Education> educations;

    @OneToMany(mappedBy = "user")
    List<FavoriteCandidate> favoriteCandidates;

    @OneToMany(mappedBy = "user")
    List<FavoriteJobPosting> favoriteJobPostings;

    @OneToMany(mappedBy = "user")
    List<JobPostingConfirmation> jobPostingConfirmations;

    @OneToMany(mappedBy = "user")
    List<LanguageLevel> languageLevels;

    @OneToMany(mappedBy = "user")
    List<Link> links;

    @OneToMany(mappedBy = "user")
    List<Skill> skills;

    @OneToOne(mappedBy = "user")
    private Image ımage;

    @OneToMany(mappedBy = "user")
    List<Cv> cvs;
}
