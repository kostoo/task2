
import Entity.Train;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("F:\\folder1\\train.xml");

            Train train = readXmlTrainEntity(inputStream);

            System.out.println("Преобразованный объект: " + train.toString());

            convertTrainEntityToJson("F:\\folder1\\train.json", train);

        } catch (FileNotFoundException | JAXBException e) {
            e.printStackTrace();
        }
    }


    public static Train readXmlTrainEntity(InputStream inputStream) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Train.class);
        Unmarshaller u = jaxbContext.createUnmarshaller();

        return (Train) u.unmarshal(inputStream);

    }

    public static void convertTrainEntityToJson(String pathToCopy, Train train) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File(pathToCopy), train);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
