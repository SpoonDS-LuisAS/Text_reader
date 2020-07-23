import domain.ReadFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //defines where the files to read is
        String input = "C:\\Users\\Luis\\Desktop\\Spoon DS\\SpoonDS_Programming_Excercices\\Test files\\Text_Reader\\eurofxref.csv";
        //defines where the file to write is
        String output = "C:\\Users\\Luis\\Desktop\\Output3.doc";

        try {
            //load the file in the ReadFile Class
            ReadFile file = new ReadFile(input);
            //puts the content of the file in an array
            String[] arrayLines = file.openFile();

            //loops over the array with all the value's of the red file
            int i;
            for (i = 0; i < arrayLines.length; i++) {
                System.out.println(arrayLines[i]);
                //calls the class WriteFile and loops trough the array while printing everything in the ouput file (+"\n" is required for now to have new underneath one another)
//                try {
//                    WriteFile data = new WriteFile(output, true);
//                    data.writeToFile(arrayLines[i] + "\n");
//                } catch (IOException e) {
//                    System.out.println(e.getMessage());
//                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
