package domain;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

public class ReadFileTest {

    @org.junit.BeforeClass
    public static void setUp() {
        //defines where the files to read is
        input = "src/main/resources/Input.csv";

    }

    @org.junit.AfterClass
    public static void tearDown() {
    }

    @org.junit.Test
    public void all() throws IOException {
        //load the file in the ReadFile Class
        final ReadFile file = new ReadFile(input);
        //puts the content of the file in an array
        Arrays.asList(file.openFile()).forEach(line -> {
            logger.info(line);
//            assertEquals("column1", line);
//            assertEquals("column2", line);
//            assertEquals("data1", line);
//            assertEquals("data2", line);
        });
    }

    @org.junit.Test
    public void openFile() {
    }

    @org.junit.Test
    public void readLines() {
    }

    private static String input;

    private final static Logger logger = Logger.getLogger(String.valueOf(WriteFileTest.class));
}