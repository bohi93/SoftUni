package softuni.exam.domain.dtos;

import com.google.gson.annotations.Expose;
import softuni.exam.domain.entities.Picture;
import softuni.exam.domain.entities.Team;

import java.math.BigDecimal;

public class PlayerDto {
    @Expose
    private String firstName;
    @Expose
    private String lastName;
    @Expose
    private Integer number;
    @Expose
    private BigDecimal salary;
//    @Expose
//    private Positions position;
    @Expose
    private Picture picture;
    @Expose
    private Team team;
}
