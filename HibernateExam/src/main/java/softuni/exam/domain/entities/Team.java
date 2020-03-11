package softuni.exam.domain.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "teams")
public class Team{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,length = 20)
    private String name;

    @ManyToOne(targetEntity = Picture.class)
    private Picture picture;

    @OneToMany(mappedBy = "team")
    private Set<Player> players;

    public Team() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }
}
