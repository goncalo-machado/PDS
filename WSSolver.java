import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;  


public class WSSolver {
    static boolean found = false;
    
	public static void DownLeft(int x, int y,char[][] wordSoup, int index, String[][] words, int wordIndex) {
		// x: x coordinate
		// y: y coordinate
		// wordSoup: word Soup witch we are searching
		// index: index of the letter we are looking
		// words: array with the info about the word inside of the wordSoup
		// wordIndex: the index of the word inside of the words array
		

		if(found) return;
		if(x > wordSoup.length - 1 || x < 0 || y > wordSoup.length - 1 || y < 0) {
			words[wordIndex][2] = "Not found";
			words[wordIndex][3] = "Not found";
			return;
		}
		// System.out.println("x: " + x + " , y: " + y);	// DEBUG
		// check if letters are the same between word and wordSoup
		if(wordSoup[x][y] == words[wordIndex][0].charAt(index)) {
			// Save start location of the word
			if(index == 0)	{
				words[wordIndex][2] = "" + (x + 1);
				words[wordIndex][3] = "" + (y + 1);
			}
			// If we are checking the end of the word then we found the correct location
			if(index + 1 == words[wordIndex][0].length()) {
				found = true;
				//System.out.println("FOUND: " + words[wordIndex][0]);
				return;
			}
			// If we aren't done with checking we check the next letter on the downLeft
			DownLeft(x + 1, y - 1, wordSoup, index + 1, words, wordIndex);
		}
		// Try other ones
		DownLeft(x + 1, y, wordSoup, 0, words, wordIndex);
		DownLeft(x, y - 1, wordSoup, 0, words, wordIndex); 
	}
	
	public static void Down(int x, int y,char[][] wordSoup, int index, String[][] words, int wordIndex) {
		// x: x coordinate
		// y: y coordinate
		// wordSoup: word Soup witch we are searching
		// index: index of the letter we are looking
		// words: array with the info about the word inside of the wordSoup
		// wordIndex: the index of the word inside of the words array
		

		if(found) return;
		if(x > wordSoup.length - 1 || x < 0 || y > wordSoup.length - 1 || y < 0) {
			words[wordIndex][2] = "Not found";
			words[wordIndex][3] = "Not found";
			return;
		}
		// check if letters are the same between word and wordSoup
		if(wordSoup[x][y] == words[wordIndex][0].charAt(index)) {
			// Save start location of the word
			if(index == 0)	{
				words[wordIndex][2] = "" + (x + 1);
				words[wordIndex][3] = "" + (y + 1);
			}
			// If we are checking the end of the word then we found the correct location
			if(index + 1 == words[wordIndex][0].length()) {
				found = true;
				//System.out.println("FOUND: " + words[wordIndex][0]);
				return;
			}
			// If we aren't done with checking we check the next letter on the downLeft
			Down(x + 1, y, wordSoup, index + 1, words, wordIndex);
		}
		// Try other ones
		Down(x + 1, y, wordSoup, 0, words, wordIndex);
		Down(x, y + 1, wordSoup, 0, words, wordIndex); 
	}
	
	public static void DownRight(int x, int y,char[][] wordSoup, int index, String[][] words, int wordIndex) {
		// x: x coordinate
		// y: y coordinate
		// wordSoup: word Soup witch we are searching
		// index: index of the letter we are looking
		// words: array with the info about the word inside of the wordSoup
		// wordIndex: the index of the word inside of the words array
		
		if(found) return;
		if(x > wordSoup.length - 1 || x < 0 || y > wordSoup.length - 1 || y < 0) {
			words[wordIndex][2] = "Not found";
			words[wordIndex][3] = "Not found";
			return;
		}
		//System.out.println("x: " + x + " , y: " + y);	// DEBUG
		// check if letters are the same between word and wordSoup
		if(wordSoup[x][y] == words[wordIndex][0].charAt(index)) {
			// Save start location of the word
			if(index == 0)	{
				words[wordIndex][2] = "" + (x + 1);
				words[wordIndex][3] = "" + (y + 1);
			}
			// If we are checking the end of the word then we found the correct location
			if(index + 1 == words[wordIndex][0].length()) {
				found = true;
				//System.out.println("FOUND: " + words[wordIndex][0]);
				return;
			}
			// If we aren't done with checking we check the next letter on the downLeft
			DownRight(x + 1, y + 1, wordSoup, index + 1, words, wordIndex);
		}
		// Try other ones
		DownRight(x + 1, y, wordSoup, 0, words, wordIndex);
		DownRight(x, y + 1, wordSoup, 0, words, wordIndex); 
	}
	
	public static void UpLeft(int x, int y,char[][] wordSoup, int index, String[][] words, int wordIndex) {
		// x: x coordinate
		// y: y coordinate
		// wordSoup: word Soup witch we are searching
		// index: index of the letter we are looking
		// words: array with the info about the word inside of the wordSoup
		// wordIndex: the index of the word inside of the words array
		
		if(found) return;
		if(x > wordSoup.length - 1 || x < 0 || y > wordSoup.length - 1 || y < 0) {
			words[wordIndex][2] = "Not found";
			words[wordIndex][3] = "Not found";
			return;
		}
		//System.out.println("x: " + x + " , y: " + y);	// DEBUG
		// check if letters are the same between word and wordSoup
		if(wordSoup[x][y] == words[wordIndex][0].charAt(index)) {
			// Save start location of the word
			if(index == 0)	{
				words[wordIndex][2] = "" + (x + 1);
				words[wordIndex][3] = "" + (y + 1);
			}
			// If we are checking the end of the word then we found the correct location
			if(index + 1 == words[wordIndex][0].length()) {
				found = true;
				//System.out.println("FOUND: " + words[wordIndex][0]);
				return;
			}
			// If we aren't done with checking we check the next letter on the downLeft
			UpLeft(x - 1, y - 1, wordSoup, index + 1, words, wordIndex);
		}
		// Try other ones
		UpLeft(x - 1, y, wordSoup, 0, words, wordIndex);
		UpLeft(x, y - 1, wordSoup, 0, words, wordIndex); 
	}
	
	public static void Up(int x, int y,char[][] wordSoup, int index, String[][] words, int wordIndex) {
		// x: x coordinate
		// y: y coordinate
		// wordSoup: word Soup witch we are searching
		// index: index of the letter we are looking
		// words: array with the info about the word inside of the wordSoup
		// wordIndex: the index of the word inside of the words array
		
		if(found) return;
		if(x > wordSoup.length - 1 || x < 0 || y > wordSoup.length - 1 || y < 0) {
			words[wordIndex][2] = "Not found";
			words[wordIndex][3] = "Not found";
			return;
		}
		//System.out.println("x: " + x + " , y: " + y);	// DEBUG
		// check if letters are the same between word and wordSoup
		if(wordSoup[x][y] == words[wordIndex][0].charAt(index)) {
			// Save start location of the word
			if(index == 0)	{
				words[wordIndex][2] = "" + (x + 1);
				words[wordIndex][3] = "" + (y + 1);
			}
			// If we are checking the end of the word then we found the correct location
			if(index + 1 == words[wordIndex][0].length()) {
				found = true;
				//System.out.println("FOUND: " + words[wordIndex][0]);
				return;
			}
			// If we aren't done with checking we check the next letter on the downLeft
			Up(x - 1, y, wordSoup, index + 1, words, wordIndex);
		}
		// Try other ones
		Up(x - 1, y, wordSoup, 0, words, wordIndex);
		Up(x, y - 1, wordSoup, 0, words, wordIndex); 
	}
	
	public static void UpRight(int x, int y,char[][] wordSoup, int index, String[][] words, int wordIndex) {
		// x: x coordinate
		// y: y coordinate
		// wordSoup: word Soup witch we are searching
		// index: index of the letter we are looking
		// words: array with the info about the word inside of the wordSoup
		// wordIndex: the index of the word inside of the words array
		
		if(found) return;
		if(x > wordSoup.length - 1 || x < 0 || y > wordSoup.length - 1 || y < 0) {
			words[wordIndex][2] = "Not found";
			words[wordIndex][3] = "Not found";
			return;
		}
		//System.out.println("x: " + x + " , y: " + y);	// DEBUG
		// check if letters are the same between word and wordSoup
		if(wordSoup[x][y] == words[wordIndex][0].charAt(index)) {
			// Save start location of the word
			if(index == 0)	{
				words[wordIndex][2] = "" + (x + 1);
				words[wordIndex][3] = "" + (y + 1);
			}
			// If we are checking the end of the word then we found the correct location
			if(index + 1 == words[wordIndex][0].length()) {
				found = true;
				//System.out.println("FOUND: " + words[wordIndex][0]);
				return;
			}
			// If we aren't done with checking we check the next letter on the downLeft
			UpRight(x - 1, y + 1, wordSoup, index + 1, words, wordIndex);
		}
		// Try other ones
		UpRight(x - 1, y, wordSoup, 0, words, wordIndex);
		UpRight(x, y + 1, wordSoup, 0, words, wordIndex); 
	}
	
	public static void Left(int x, int y,char[][] wordSoup, int index, String[][] words, int wordIndex) {
		// x: x coordinate
		// y: y coordinate
		// wordSoup: word Soup witch we are searching
		// index: index of the letter we are looking
		// words: array with the info about the word inside of the wordSoup
		// wordIndex: the index of the word inside of the words array
		
		if(found) return;
		if(x > wordSoup.length - 1 || x < 0 || y > wordSoup.length - 1 || y < 0) {
			words[wordIndex][2] = "Not found";
			words[wordIndex][3] = "Not found";
			return;
		}
		//System.out.println("x: " + x + " , y: " + y);	// DEBUG
		// check if letters are the same between word and wordSoup
		if(wordSoup[x][y] == words[wordIndex][0].charAt(index)) {
			// Save start location of the word
			if(index == 0)	{
				words[wordIndex][2] = "" + (x + 1);
				words[wordIndex][3] = "" + (y + 1);
			}
			// If we are checking the end of the word then we found the correct location
			if(index + 1 == words[wordIndex][0].length()) {
				found = true;
				//System.out.println("FOUND: " + words[wordIndex][0]);
				return;
			}
			// If we aren't done with checking we check the next letter on the downLeft
			Left(x, y - 1, wordSoup, index + 1, words, wordIndex);
		}
		// Try other ones
		Left(x - 1, y, wordSoup, 0, words, wordIndex);
		Left(x, y - 1, wordSoup, 0, words, wordIndex); 
	}
	
	public static void Right(int x, int y,char[][] wordSoup, int index, String[][] words, int wordIndex) {
		// x: x coordinate
		// y: y coordinate
		// wordSoup: word Soup witch we are searching
		// index: index of the letter we are looking
		// words: array with the info about the word inside of the wordSoup
		// wordIndex: the index of the word inside of the words array
		
		if(found) return;
		if(x > wordSoup.length - 1 || x < 0 || y > wordSoup.length - 1 || y < 0) {
			words[wordIndex][2] = "Not found";
			words[wordIndex][3] = "Not found";
			return;
		}
		//System.out.println("x: " + x + " , y: " + y);	// DEBUG
		// check if letters are the same between word and wordSoup
		if(wordSoup[x][y] == words[wordIndex][0].charAt(index)) {
			// Save start location of the word
			if(index == 0)	{
				words[wordIndex][2] = "" + (x + 1);
				words[wordIndex][3] = "" + (y + 1);
			}
			// If we are checking the end of the word then we found the correct location
			if(index + 1 == words[wordIndex][0].length()) {
				found = true;
				//System.out.println("FOUND: " + words[wordIndex][0]);
				return;
			}
			// If we aren't done with checking we check the next letter on the downLeft
			Right(x, y + 1, wordSoup, index + 1, words, wordIndex);
		}
		// Try other ones
		Right(x + 1, y, wordSoup, 0, words, wordIndex);
		Right(x, y + 1, wordSoup, 0, words, wordIndex); 
	}
	
	public static void main(String[] args) {
	// 	Read from file and create array of strings with the lines on the .txt
		ArrayList<String> dataList = new ArrayList<String>();	
	    try {
	        File myObj = new File(args[0]);
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
	    
	    //System.out.println(wordList); // DEBUG
	    
		// Verify if square WRONG
		int size = 0;
		int counter = 0;
		for(int i = 0 ; i < dataList.size() ; i++){
			if(i == 0) size = dataList.get(i).length();
			if(dataList.get(i).length() != size  || dataList.get(i).length() > 40){
					System.out.println("Not a fair square size");
					//termina o programa
			} else{
				counter++;
			}
			if(!dataList.get(i).equals(dataList.get(i).toUpperCase())){
				if(counter - 1 == size){
					break;
				}else{
					System.out.println("Not uppercase");
					//termina o programa
				}
			}
		}

	
	    //System.out.println(size);	// DEBUG
	
	    char[][] wordSoup = new char[size][size];	//	Create word soup with the letters given 
	    for(int i = 0 ; i < size ; i++) {
	    	for(int j = 0 ; j < size ; j++) {
	    		if(0 == dataList.get(i).charAt(j)) {
	    	        System.out.println("Empty space.");
					//termina o programa
	    		}
	    		wordSoup[i][j] = dataList.get(i).charAt(j);
	    	}
	    }
	    
	    // Print the word soup, debug
	    //System.out.println("Word Soup\n");
	    //for(int i = 0 ; i < size ; i++) {
	    //	for(int j = 0 ; j < size ; j++) {
	    //		System.out.print(wordSoup[i][j] + " ");	
	    //	}
	    //	System.out.println();
	    //}
	    
	    // Get words to search
	    ArrayList<String> wordList = new ArrayList<String>();
	    ArrayList<String> original = new ArrayList<String>();
	    // System.out.println("\nWord list (non sorted)\n");
	    for(int s = size ; s < dataList.size() ; s++) {
	    	String[] arrOfStr = dataList.get(s).split("[,\\;\\ ]");	// check same line words
	    	for(int i = 0 ; i < arrOfStr.length ; i++) {
				if(arrOfStr[i].equals(arrOfStr[i].toUpperCase())){
					System.out.println("Words not only in lowercase or mixed");
					//termina o programa
				}
				if(!(arrOfStr[i].matches("[a-zA-Z]+"))){
					System.out.println("Words have non alpha values");
					//termina o programa
				}
	    		wordList.add(arrOfStr[i].toUpperCase());	// add words discovered and turn upper case
	    		original.add(arrOfStr[i]);	// copy original temporarily
	    		// System.out.println(arrOfStr[i]);
	    	}
	    }
	    
	    // Sort by length, sorted to have priority search
	    Collections.sort(wordList, Comparator.comparing(String::length).reversed());
	    
	    // Print sorted by length words to search
	    //System.out.println("\nWord list (sorted)\n");
	    //for(int i = 0 ; i < wordList.size() ; i++) {
	    //	System.out.println(wordList.get(i));
	    //}
	    
	    // Array of the results
	    String[][] words = new String[wordList.size()][5];	//	Create word soup with the letters given
	    for(int i = 0 ; i < wordList.size() ; i++) {
	    	words[i][0] = wordList.get(i);
	    	words[i][1] = "" + wordList.get(i).length();
	    }
	    
	    char[][] solution = new char[size][size];	//	Solution to display
	    
	    // Search for words
	    for(int i = 0 ; i < wordList.size() ; i++) {    	
		    found = true;
		    while(!found) {}
		    found = false;
		    
	    	// Search DownLeft
		    if(!found) {
		    	DownLeft(0, wordSoup.length - 1, wordSoup, 0, words, i);
	    		if(found) {
	    			words[i][4] = "DownLeft"; 
	    			//System.out.println(words[i][0]+": "+ words[i][2] + "," + words[i][3]);	
	    		}
		    }
		    
			// Search Down
		    if(!found) {
		    	Down(0, 0, wordSoup, 0, words, i);
	    		if(found) {
	    			words[i][4] = "Down";
	    			//System.out.println(words[i][0]+": "+ words[i][2] + "," + words[i][3]);	
	    		}
		    }
		    
			// Search DownRight
	    	if(!found) {
	    		DownRight(0, 0, wordSoup, 0, words, i);
	    		if(found) {
	    			words[i][4] = "DownRight";
	    			//System.out.println(words[i][0]+": "+ words[i][2] + "," + words[i][3]);	
	    		}
	    	}
	    	
			// Search UpLeft
		    if(!found) {
		    	UpLeft(wordSoup.length - 1, wordSoup.length - 1, wordSoup, 0, words, i);
	    		if(found) {
	    			words[i][4] = "UpLeft";
	    			//System.out.println(words[i][0]+": "+ words[i][2] + "," + words[i][3]);	
	    		}
		    }
		    
			// Search Up
		    if(!found) {
		    	Up(wordSoup.length - 1, wordSoup.length - 1, wordSoup, 0, words, i);
	    		if(found) {
	    			words[i][4] = "Up";
	    			//System.out.println(words[i][0]+": "+ words[i][2] + "," + words[i][3]);	
	    		}
		    }
		    
			// Search UpRight
		    if(!found) {
		    	UpRight(wordSoup.length - 1, 0, wordSoup, 0, words, i);
	    		if(found) {
	    			words[i][4] = "UpRight";
	    			//System.out.println(words[i][0]+": "+ words[i][2] + "," + words[i][3]);	
	    		}		
		    }
		    
			// Search Left
		    if(!found) {
		    	Left(wordSoup.length - 1, wordSoup.length - 1, wordSoup, 0, words, i);
	    		if(found) {
	    			words[i][4] = "Left";
	    			//System.out.println(words[i][0]+": "+ words[i][2] + "," + words[i][3]);	
	    		}
		    }
		    
			// Search Right
		    if(!found) {
		    	Right(0, 0, wordSoup, 0, words, i);
	    		if(found) {
	    			words[i][4] = "Right";
	    			//System.out.println(words[i][0]+": "+ words[i][2] + "," + words[i][3]);	
	    		}
		    }
	    }
	    
	    // Check results
	    
	    // Print results
	    for(int i = 0 ; i < wordList.size() ; i++) {
	    	for(int j = 0 ; j < wordList.size() ; j++) {
	    		if(original.get(i).toUpperCase().contentEquals(words[j][0])) {
	    			System.out.printf("%-15s %-5s %-5s %-14s\n", original.get(i), words[j][1], words[j][2] + "," + words[j][3], words[j][4]);
	    		} 
	    	}
	    } 
	    
	    // Get word soup solution
	    for(int i = 0 ; i < wordList.size() ; i++) {
	    	int len = Integer.parseInt(words[i][1]);
	    	int x = Integer.parseInt(words[i][2]) - 1;
	    	int y = Integer.parseInt(words[i][3]) - 1;
	    	switch(words[i][4]) {
	    		case "DownLeft":
	    						while(len != 0) {
	    							solution[x][y] = wordSoup[x][y];
	    							x++;
	    							y--;
	    							len--;
	    						}
	    						break;
	    		case "Down":
								while(len != 0) {
									solution[x][y] = wordSoup[x][y];
									x++;
									len--;

								}
								break;
	    		case "DownRight":
								while(len != 0) {
									solution[x][y] = wordSoup[x][y];
									x++;
									y++;
									len--;
								}
								break;
	    		case "UpLeft":
								while(len != 0) {
									solution[x][y] = wordSoup[x][y];
									x--;
									y--;
									len--;
								}
								break;
	    		case "Up":
								while(len != 0) {
									solution[x][y] = wordSoup[x][y];
									x--;
									len--;
								}
								break;
	    		case "UpRight":
								while(len != 0) {
									solution[x][y] = wordSoup[x][y];
									x--;
									y++;
									len--;
								}
								break;
	    		case "Left":
								while(len != 0) {
									solution[x][y] = wordSoup[x][y];
									y--;
									len--;
								}
								break;
	    		case "Right":
								while(len != 0) {
									solution[x][y] = wordSoup[x][y];
									y++;
									len--;
								}
								break;
	    	}
	    }
	    
	    // Print the word soup, debug
	    System.out.println();
	    for(int i = 0 ; i < size ; i++) {
	    	for(int j = 0 ; j < size ; j++) {
	    		if(solution[i][j] != 0) {
	    			System.out.print(solution[i][j] + " ");
	    		}else {
	    			System.out.print(". ");
	    		}
	    	}
	    	System.out.println();
	    }
	}
}