package softuni.exam.domain.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pictures")
public class Picture{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String url;

    @OneToMany(mappedBy = "picture")
    private Set<Team> teams;

    @OneToOne(mappedBy = "picture")
    private Player player;

    public Picture() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
