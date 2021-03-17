import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class WSGenerator {
    // Generate a random position in the wordsoup
    public static int[] generateCords(int size){
        int[] cords = new int[2];
        Random r = new Random();
        cords[0] = r.nextInt(size + 1);
        Random s = new Random();
        cords[1] = s.nextInt(size + 1);
        return cords;
    }

    // Generate a random orientation in the wordsoup
    public static String generateOri(){
        String Orientation[] = {"DownLeft","Down","DownRight","UpLeft","Up","UpRight","Left","Right"};
        Random r = new Random();
        int n = r.nextInt(8);
        return Orientation[n];
    } 

    // Generate word soup
    public static void wsGen(ArrayList<String> wordList, int size){
        char[][] wordSoup = new char[size][size];
        for(int i = 0 ; i < wordList.size() ; i++){
            boolean fits = false;
            String word = wordList.get(i).toUpperCase();
            System.out.println(word);
            while(!fits){
                int[] cords = generateCords(size);
                int x = cords[0];
                int y = cords[1];
                String ori = generateOri();
                System.out.println("Try: " + word + " in " + x + "," + y + " " + ori);
                int len =  word.length();
                int original = len; 
                switch(ori) {
                    case "DownLeft":
                                    while(len != 0) {
                                        if(x > 0 && x < size && y > 0 && y < size && (wordSoup[x][y] == 0 || wordSoup[x][y] == word.charAt(len - 1))){
                                            System.out.println(len);
                                            wordSoup[x][y] = word.charAt(len - 1);
                                            x++;
                                            y--;
                                            len--;
                                        }else{
                                            while(len != original){
                                                x--;
                                                y++;
                                                len++;
                                                wordSoup[x][y] = 0;
                                            }
                                            fits = false;
                                            break;
                                        }
                                        fits = true;
                                    }
                                    break;
                    case "Down":
                                    while(len != 0) {
                                        if(x > 0 && x < size && y > 0 && y < size && (wordSoup[x][y] == 0 || wordSoup[x][y] == word.charAt(len - 1))){
                                            wordSoup[x][y] = word.charAt(len - 1);
                                            x++;
                                            len--;
                                        }else{
                                            while(len != original){
                                                x--;
                                                len++;
                                                wordSoup[x][y] = 0;
                                            }
                                            fits = false;
                                            break;
                                        }
                                        fits = true;
                                    }
                                    break;
                    case "DownRight":
                                    while(len != 0) {
                                        if(x > 0 && x < size && y > 0 && y < size && (wordSoup[x][y] == 0 || wordSoup[x][y] == word.charAt(len - 1))){
                                            wordSoup[x][y] = word.charAt(len - 1);
                                            x++;
                                            y++;
                                            len--;
                                        }else{
                                            while(len != original){
                                                x--;
                                                y--;
                                                len++;
                                                wordSoup[x][y] = 0;
                                            }
                                            fits = false;
                                            break;
                                        }
                                        fits = true;
                                    }
                                    break;
                    case "UpLeft":
                                    while(len != 0) {
                                        if(x > 0 && x < size && y > 0 && y < size && (wordSoup[x][y] == 0 || wordSoup[x][y] == word.charAt(len - 1))){
                                            wordSoup[x][y] = word.charAt(len - 1);
                                            x--;
                                            y--;
                                            len--;
                                        }else{
                                            while(len != original){
                                                x++;
                                                y++;
                                                len++;
                                                wordSoup[x][y] = 0;
                                            }
                                            fits = false;
                                            break;
                                        }
                                        fits = true;
                                    }
                                    break;
                    case "Up":
                                    while(len != 0) {
                                        if(x > 0 && x < size && y > 0 && y < size && (wordSoup[x][y] == 0 || wordSoup[x][y] == word.charAt(len - 1))){
                                            wordSoup[x][y] = word.charAt(len - 1);
                                            x--;
                                            len--;
                                        }else{
                                            while(len != original){
                                                x++;
                                                len++;
                                                wordSoup[x][y] = 0;
                                            }
                                            fits = false;
                                            break;
                                        }
                                        fits = true;
                                    }
                                    break;
                    case "UpRight":
                                    while(len != 0) {
                                        if(x > 0 && x < size && y > 0 && y < size && (wordSoup[x][y] == 0 || wordSoup[x][y] == word.charAt(len - 1))){
                                            wordSoup[x][y] = word.charAt(len - 1);
                                            x--;
                                            y++;
                                            len--;
                                        }else{
                                            while(len != original){
                                                x++;
                                                y--;
                                                len++;
                                                wordSoup[x][y] = 0;
                                            }
                                            fits = false;
                                            break;
                                        }
                                        fits = true;
                                    }
                                    break;
                    case "Left":
                                    while(len != 0) {
                                        if(x > 0 && x < size && y > 0 && y < size && (wordSoup[x][y] == 0 || wordSoup[x][y] == word.charAt(len - 1))){
                                            wordSoup[x][y] = word.charAt(len - 1);
                                            y--;
                                            len--;
                                        }else{
                                            while(len != original){
                                                y++;
                                                len++;
                                                wordSoup[x][y] = 0;
                                            }
                                            fits = false;
                                            break;
                                        }
                                        fits = true;
                                    }
                                    break;
                    case "Right":
                                    while(len != 0) {
                                        if(x > 0 && x < size && y > 0 && y < size && (wordSoup[x][y] == 0 || wordSoup[x][y] == word.charAt(len - 1))){
                                            wordSoup[x][y] = word.charAt(len - 1);
                                            y++;
                                            len--;
                                        }else{
                                            while(len != original){
                                                y--;
                                                len++;
                                                wordSoup[x][y] = 0;
                                            }
                                            fits = false;
                                            break;
                                        }
                                        fits = true;
                                    }
                                    break;
                }
                System.out.println("Fits: " + fits);
            }
        }
        // Print the word soup, debug
	    System.out.println();
	    for(int i = 0 ; i < size ; i++) {
	    	for(int j = 0 ; j < size ; j++) {
	    		if(wordSoup[i][j] != 0) {
	    			System.out.print(wordSoup[i][j] + " ");
	    		}else {
	    			System.out.print(". ");
	    		}
	    	}
	    	System.out.println();
	    }
    }

    public static void main(String[] args) {
        /*  options:
                    -i: file to be used
                    -s: size of the wod soup to be made
        */
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
            wsGen( wordList, size);
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
                    if(arrOfStr[i].length() > size){
                        System.out.println("At least one word given doesn't fit in the size provided.");
                        return;
                    }
                    wordList.add(arrOfStr[i].toUpperCase());	// add words discovered and turn upper case
                }
            }
            wsGen( wordList, size);
            return;
        }
        // Help message
        System.out.println("usage: -i file  # gives file with word soup words");
        System.out.println("       -s size  # gives size for the word soup");
        return;
    }
}