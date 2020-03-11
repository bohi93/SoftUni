package softuni.exam.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.exam.domain.dtos.PictureDto;
import softuni.exam.domain.dtos.PictureRootDto;
import softuni.exam.domain.entities.Picture;
import softuni.exam.repository.PictureRepository;
import softuni.exam.util.FileUtil;
import softuni.exam.util.ValidatorUtil;
import softuni.exam.util.XMLParser;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@Service
public class PictureServiceImpl implements PictureService {
    private final String FILE_PATH = "C:\\Users\\Mitko\\Desktop\\Exam\\Exam\\src\\main\\resources\\files\\xml\\pictures.xml";

    private final PictureRepository pictureRepository;
    private final ModelMapper modelMapper;
    private final ValidatorUtil validationUtil;
    private final FileUtil fileUtil;
    private final XMLParser xmlParser;

    @Autowired
    public PictureServiceImpl(PictureRepository pictureRepository, ModelMapper modelMapper, ValidatorUtil validationUtil, FileUtil fileUtil, XMLParser xmlParser) {
        this.pictureRepository = pictureRepository;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
        this.fileUtil = fileUtil;
        this.xmlParser = xmlParser;
    }


    @Override
    public String importPictures() throws JAXBException {
        StringBuilder sb = new StringBuilder();

        PictureRootDto pictureDto = this.xmlParser.importXMl(PictureRootDto.class, FILE_PATH);

        for (PictureDto pictureDto1 : pictureDto.getPictureDtos()) {
            Picture picture = this.modelMapper.map(pictureDto1, Picture.class);

            if (!this.validationUtil.isValid(picture)|| picture.getUrl() == null){
                sb.append("Invalid picture").append(System.lineSeparator());

                continue;
            }
            this.pictureRepository.saveAndFlush(picture);

            sb.append(String.format("Successfully imported picture - %s",picture.getUrl()))
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
    public String readPicturesXmlFile() throws IOException {
        return this.fileUtil.readFile(FILE_PATH);
    }

}
