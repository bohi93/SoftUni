package softuni.exam.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.exam.domain.dtos.PictureDto;
import softuni.exam.domain.dtos.PictureRootDto;
import softuni.exam.domain.dtos.TeamDto;
import softuni.exam.domain.dtos.TeamRootDto;
import softuni.exam.domain.entities.Picture;
import softuni.exam.domain.entities.Team;
import softuni.exam.repository.PictureRepository;
import softuni.exam.repository.TeamRepository;
import softuni.exam.util.FileUtil;
import softuni.exam.util.ValidatorUtil;
import softuni.exam.util.XMLParser;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@Service
public class TeamServiceImpl implements TeamService {
    private final String FILE_PATH = "C:\\Users\\Mitko\\Desktop\\Exam\\Exam\\src\\main\\resources\\files\\xml\\teams.xml";


    private final TeamRepository teamRepository;
    private final ModelMapper modelMapper;
    private final ValidatorUtil validationUtil;
    private final FileUtil fileUtil;
    private final XMLParser xmlParser;

    @Autowired
    public TeamServiceImpl(TeamRepository teamRepository, ModelMapper modelMapper, ValidatorUtil validationUtil, FileUtil fileUtil, XMLParser xmlParser) {
        this.teamRepository = teamRepository;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
        this.fileUtil = fileUtil;
        this.xmlParser = xmlParser;
    }

    @Override
    public String importTeams() throws JAXBException {
        StringBuilder sb = new StringBuilder();

        TeamRootDto teamRootDto = this.xmlParser.importXMl(TeamRootDto.class, FILE_PATH);

        for (TeamDto teamDto : teamRootDto.getTeamDtos()) {
            Team team = this.modelMapper.map(teamDto, Team.class);

            if (!this.validationUtil.isValid(team)){
                sb.append("Invalid team").append(System.lineSeparator());
                continue;
            }
            if (team.getName().length() < 3 || team.getName().length() > 20 || team.getName() == null){
                sb.append("Invalid team").append(System.lineSeparator());
                continue;
            }

//            if (){
//                sb.append("Invalid team").append(System.lineSeparator());
//                continue;
//            }
            this.teamRepository.saveAndFlush(team);

            sb.append(String.format("Successfully imported picture - %s",team.getName()))
                    .append(System.lineSeparator());
        }

        return sb.toString().trim();
    }

    @Override
    public boolean areImported() {
        //TODO Implement me
        return false;
    }

    @Override
    public String readTeamsXmlFile() throws IOException {
        return this.fileUtil.readFile(FILE_PATH);
    }
}
