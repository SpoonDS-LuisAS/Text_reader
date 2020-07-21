package domain;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WriteFileTest {

    @org.junit.BeforeClass
    public static void setUp() {
        //defines where the file to write is
        output = "Output2.doc";
    }

    @org.junit.AfterClass
    public static void tearDown() {
    }

    @org.junit.Test
    public void all() throws IOException {
        //defines where the files to read is
        String input = "Input.csv";

        //load the file in the ReadFile Class
        ReadFile file = mock(ReadFile.class);
        when(file.openFile()).thenReturn(new String[]{ "line 1", "line 2" });
        //puts the content of the file in an array
        Arrays.asList(file.openFile()).forEach(line -> {
            //calls the class WriteFile and loops trough the array while printing everything in the ouput file (+"\n" is required for now to have new underneath one another)
            try {
                WriteFile data = new WriteFile(output, true);
                data.writeToFile(line + "\n");
            }
            catch (IOException e){
                logger.severe(Arrays.toString(e.getStackTrace()));
            }
        });
    }

    @org.junit.Test
    public void writeToFile() {
        //there you can implement a simple test for the writeToFile method
    }

    private static String output;

    private final static Logger logger = Logger.getLogger(String.valueOf(WriteFileTest.class));

}