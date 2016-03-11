/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package madlibs;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author NiCha7897
 */
public class MadLibs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            File textFile = new File("Y:\\Documents\\NetBeansProjects\\MadLibs\\story.txt");
		FileReader in;
		BufferedReader readFile;
		String lineOfText;
		
		try {
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
    		while ((lineOfText = readFile.readLine()) != null ) {
    			System.out.println(lineOfText);
    		}
    		readFile.close();
    		in.close();
                } catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem reading file.");
    		System.err.println("IOException: " + e.getMessage());
               
                }
                
                File textVerbFile = new File("Y:\\Documents\\NetBeansProjects\\MadLibs\\verbs.txt");
                if (textVerbFile.exists()) {
                    System.out.println("File Alreadry Exists");
                }else {
                 try { 
                     textVerbFile.createNewFile();
                     System.out.println("New file created. ");
                 } catch (IOException e) {
                    System.out.println("File could not be created.");
                    System.err.println("FileNotFoundException: " + e.getMessage());
                 }
                }
                
                File textNounFile = new File("Y:\\Documents\\NetBeansProjects\\MadLibs\\noun.txt");
                FileWriter out;
                BufferedWriter writeFile;
                Scanner input = new Scanner(System.in);
                String nouns;
                
                 try {
                out = new FileWriter(textNounFile,true);
                writeFile = new BufferedWriter(out);
                for (int i = 0; i < 7; i++) {
                    System.out.print("Enter Noun: ");
                    nouns = input.next();
                    writeFile.write(nouns);
                    writeFile.newLine();
                }
                   writeFile.close();
            out.close();
            System.out.println("Data written to file.");
            } catch (IOException e) {
                System.out.println("Problem writing to file");
              System.err.println("IOException: " + e.getMessage());
            }
                
    
}
}

