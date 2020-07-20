//TO DO
//Soft code input and output file path
//Add functionality for text manipulation
//TBD

package domain;

import java.io.IOException;

public class FileData {
    public static void main(String[] args) throws IOException{
        //defines where the files to read is
        String input = "C:\\Users\\Luis\\Desktop\\Spoon DS\\SpoonDS_Programming_Excercices\\Java\\Test files\\Input.csv";
        //defines where the file to write is
        String output = "C:\\Users\\Luis\\Desktop\\Spoon DS\\SpoonDS_Programming_Excercices\\Java\\Test files\\Output2.doc";

        try {
            //load the file in the ReadFile Class
            ReadFile file = new ReadFile(input);
            //puts the content of the file in an array
            String[] aryLines = file.OpenFile();

            //loops over the array with all the value's of the red file
            int i;
            for(i = 0; i < aryLines.length; i++){
                //calls the class WriteFile and loops trough the array while printing everything in the ouput file (+"\n" is required for now to have new underneath one another)
                try {
                    WriteFile data = new WriteFile(output, true);
                    data.writeToFile(aryLines[i] + "\n");
                }
                catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }

        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
