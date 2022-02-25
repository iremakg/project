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
@Table(name = "LINK_NAME")
public class LinkName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "link_name")
    private String linkName;

    @OneToMany(mappedBy = "linkName")
    List<LinkName> linkNames;

    @JsonIgnore
    @OneToMany(mappedBy = "linkName")
    private List<Cv> cvs;

}
