package ca.bcit.comp1510.lab06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
///**
// * Reads baseball data in from a comma delimited file. Each line 
// * of the file contains a name followed by a list of symbols
// * indicating the result of each at bat: h for hit, o for out,
// * w for walk, s for sacrifice. Statistics are computed and
// * printed for each player.
// *
// *
// */

/**
 * COMP1510 Programming methods.
 * 
 * @author Munyoung cho
 * @version 2022
 */
public class BaseballStats {
    /*
     * Reads baseball stats from a file and counts
     *  total hits, outs, walks, and sacrifice flies
     * for each player.
     */
    /**
     * Drives program.
     * @param args unsused.
     * @throws FileNotFoundException if there is an error reading the file
     */
    public static void main(String[] args) throws FileNotFoundException {
        //Read in the file name from standard input
        Scanner fileScan;
        Scanner lineScan;
        String fileName;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the name of the input file: ");
        fileName = scan.nextLine();
        File file = new File("resource/", fileName); 
        fileScan = new Scanner(file); 
        //Read each line in the file
        while (fileScan.hasNextLine()) {
            String line = fileScan.nextLine();
            
            //Create a scanner to parse each line 
            lineScan = new Scanner(line); 
            lineScan.useDelimiter(",");
            
            //Read and print the name of the player
            String name = lineScan.next(); 
            System.out.println(name + ": ");
            
            //Count the number of hits, outs, walks and sacrifices
            int hits = 0;
            int outs = 0;
            int walks = 0;
            int sacrifices = 0;
            while (lineScan.hasNext()) {
                String result = lineScan.next();
                if (result.equals("h")) {
                    hits++; 
                } else if (result.equals("o")) {
                    outs++; 
                } else if (result.equals("w")) {
                    walks++;
                } else if (result.equals("s")) {
                    sacrifices++;
                }
                //Print each at-bat code without commas
                System.out.println(result);
            }
            
        
            //Calculate and print batting average
            double battingAvg = (double) hits / (hits + outs); 
            System.out.printf(" (Hits: %d, Outs: %d, Walks: %d, "
                + "Sacrifices: %d, Batting Average: %.3f)\n",
                hits, outs, walks, sacrifices, battingAvg);
        }
        fileScan.close();
        scan.close(); 
    }
    
}


