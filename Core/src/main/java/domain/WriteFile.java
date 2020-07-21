package domain;

import  java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


/**
 * File writing utilities
 */
public class WriteFile {

    private String path;
    private boolean append_to_file = false;

    /**
     * constructor
     * @param file_path
     */
    public WriteFile(final String file_path){
        path = file_path;
    }

    /**
     * constructor
     * @param file_path
     * @param append_value
     */
    public WriteFile(final String file_path, final boolean append_value){
        path = file_path;
        append_to_file = append_value;
    }

    /**
     * writes text line to file
     * @param textLine
     * @throws IOException
     */
    public void writeToFile(final String textLine) throws IOException{
        FileWriter write = new FileWriter(path, append_to_file);
        PrintWriter print_line = new PrintWriter(write);

        print_line.printf("%s", textLine);

        print_line.close();
    }
}
