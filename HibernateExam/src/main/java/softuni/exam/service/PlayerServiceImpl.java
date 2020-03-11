package softuni.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.exam.util.FileUtil;

import java.io.IOException;

@Service
public class PlayerServiceImpl implements PlayerService {
    private final String FILE_PATH = "C:\\Users\\Mitko\\Desktop\\Exam\\Exam\\src\\main\\resources\\files\\json\\players.json";

    private final FileUtil fileUtil;

    @Autowired
    public PlayerServiceImpl(FileUtil fileUtil) {
        this.fileUtil = fileUtil;
    }


    @Override
    public String importPlayers() {
        //TODO Implement me
        return "";
    }

    @Override
    public boolean areImported() {
        return false;
    }

    @Override
    public String readPlayersJsonFile() throws IOException {
        return this.fileUtil.readFile(FILE_PATH);
    }

    @Override
    public String exportPlayersWhereSalaryBiggerThan() {
        //TODO Implement me
        return "";
    }

    @Override
    public String exportPlayersInATeam() {
        //TODO Implement me
        return "";
    }
}
