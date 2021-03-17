import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WSGenerator {
/*  options:
        -i: file to be used
        -s: size of the wod soup to be made
*/

    public static void main(String[] args) {
        int argc = args.length;

        // Given only the words file
        if(argc == 2 && args[0].charAt(0) == '-' && args[0].charAt(1) == 'i'){
            String fileName = args[1];
            int size = 1;
            ArrayList<String> wordList = new ArrayList<String>();

            // Get data from file
            ArrayList<String> dataList = new ArrayList<String>();	
            try {
                File myObj = new File(fileName);
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                  String data = myReader.nextLine(); 
                  dataList.add(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

            // Get words from data 
            for(int s = 0 ; s < dataList.size() ; s++) {
                String[] arrOfStr = dataList.get(s).split("[,\\;\\ ]");	// check same line words
                for(int i = 0 ; i < arrOfStr.length ; i++) {
                    if(arrOfStr[i].equals(arrOfStr[i].toUpperCase())){
                        System.out.println("Words not only in lowercase or mixed");
                        //termina o programa
                        return;
                    }
                    if(!(arrOfStr[i].matches("[a-zA-Z]+"))){
                        System.out.println("Words have non alpha values");
                        //termina o programa
                        return;
                    }
                    if(arrOfStr[i].length() > size) size = arrOfStr[i].length() + 1;
                    wordList.add(arrOfStr[i].toUpperCase());	// add words discovered and turn upper case
                }
            }
            return;
        }

        // Given all args
        if(argc == 4 && args[0].charAt(0) == '-' && args[0].charAt(1) == 'i' && args[2].charAt(0) == '-' && args[2].charAt(1) == 's'){
            String fileName = args[1];
            int size = Integer.parseInt(args[3]);

            ArrayList<String> wordList = new ArrayList<String>();

            // Get data from file
            ArrayList<String> dataList = new ArrayList<String>();	
            try {
                File myObj = new File(fileName);
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                  String data = myReader.nextLine(); 
                  dataList.add(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

            // Get words from data 
            for(int s = 0 ; s < dataList.size() ; s++) {
                String[] arrOfStr = dataList.get(s).split("[,\\;\\ ]");	// check same line words
                for(int i = 0 ; i < arrOfStr.length ; i++) {
                    if(arrOfStr[i].equals(arrOfStr[i].toUpperCase())){
                        System.out.println("Words not only in lowercase or mixed");
                        //termina o programa
                        return;
                    }
                    if(!(arrOfStr[i].matches("[a-zA-Z]+"))){
                        System.out.println("Words have non alpha values");
                        //termina o programa
                        return;
                    }
                    if(arrOfStr[i].length() > size) size = arrOfStr[i].length() + 1;
                    wordList.add(arrOfStr[i].toUpperCase());	// add words discovered and turn upper case
                }
            }
            return;
        }
        // Help message
        System.out.println("usage: -i file  # gives file with word soup words");
        System.out.println("       -s size  # gives size for the word soup");
        return;
    }
}