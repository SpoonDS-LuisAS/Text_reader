package domain;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 * File reading utilities
 */
public class ReadFile {

    private String path;

    /**
     * constructor
     * @param file_path is the path to file
     */
    public ReadFile (String file_path){
        path = file_path;
    }

    /**
     * opens the file in {@link #path path}
     * @return an array of {@link String String} containing lines
     * @throws IOException
     */
    public String[] openFile() throws IOException{
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);

        int numberOfLines = readLines();
        String[] textData = new String[numberOfLines];

        int i;

        for(i=0; i < numberOfLines; i++){
            textData[i] = textReader.readLine();
        }

        textReader.close();
        return textData;
    }

    /**
     * reads the content of the file
     * @return the number of lines read
     * @throws IOException
     */
    int readLines() throws IOException{

        FileReader file_to_read = new FileReader(path);
        BufferedReader bf = new BufferedReader(file_to_read);

        String aLine;
        int numberOfLines = 0;

        while ((aLine = bf.readLine()) != null){
            numberOfLines++;
        }
        bf.close();
        return numberOfLines;
    }
}
