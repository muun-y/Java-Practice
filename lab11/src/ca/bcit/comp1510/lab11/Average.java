package ca.bcit.comp1510.lab11;

/**
 * Create a class to calculate the average.
 * 
 * @author Munyoung cho
 * @version 2023
 */
public class Average {
    /**
     * A main method to drives the program. 
     * @param args unused
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments");
            return;
        }
        
        int sum = 0;
        int count = 0;
        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
                count++;
            } catch (NumberFormatException e) {
                System.err.println("Error: " + arg + " is not an integer");
            }
        }
        
        if (count == 0) {
            System.out.println("No valid integers");
        } else {
            double avg = (double) sum / count;
            System.out.println("Average: " + avg);
        }
    }

}
