package softuni.exam.domain.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "team")
@XmlAccessorType(XmlAccessType.FIELD)
public class TeamDto {

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "picture")
    private List<PictureDto> pictureDtos;

    public TeamDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PictureDto> getPictureDtos() {
        return pictureDtos;
    }

    public void setPictureDtos(List<PictureDto> pictureDtos) {
        this.pictureDtos = pictureDtos;
    }
}
