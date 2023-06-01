package ca.bcit.comp1510.lab04;

/**
 * Name is a class for first, middle, and last name.
 * @author Munyoung Cho
 * @version 2023
 */
public class Student {
    
    //2. declare private instance variables
    /** firstName variable.*/
    private String firstName;
    
    /** lastName variable.*/
    private String lastName;
    
    /** yearofBirth variable.*/
    private int birthYear;
    
    /** studentNumber variable.*/
    private String studentNumber;
    
    /** GPA variable.*/
    private int gradeAverage;
    
    
    /**
     * set an Student object.
     * 
     * @param first
     *            first name
     * @param last
     *            last name
     * @param year
     *            year of birth
     * @param number
     *            student number 
     * @param gpa
     *            grade average
     */
    
    public Student(String first, String last, 
            int year, String number, int gpa) {
        firstName = first;
        lastName = last;
        birthYear = year;
        studentNumber = number;
        gradeAverage = gpa; 
    }

    /**
     * Return the first name. 
     * @return the first name 
     */
    
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * set first name. 
     * @param first
     *        a string  to name
     */
    
    public void setFirstName(String first) {
        firstName = first;
    }
    
    /**
     * Return the last name. 
     * @return the last name
     */

    public String getLastName() {
        return lastName;
    }
    
    /**
     * Set last name. 
     * @param last
     *        a string to a name 
     */

    public void setLastName(String last) {
        lastName = last;
    }
    
    /**
     * Return birth year. 
     * @return the birth year
     */

    public int getBirthYear() {
        return birthYear;
    }
    
    /**
     * Set birth year.
     * @param year
     *        a int to year
     */

    public void setBirthYear(int year) {
        birthYear = year;
    }
    
    /**
     * Return Studentnumber.
     * @return the student number
     */

    public String getStudentNumber() {
        return studentNumber;
    }
    
    /**
     * Set Student number. 
     * @param number
     *        a String to number
     */

    public void setStudentNumber(String number) {
        studentNumber = number;
    }
    
    /**
     * Return GradeAverage. 
     * @return the gardeaverage
     */

    public int getGradeAverage() {
        return gradeAverage;
    }
    
    /**
     * Set gpa. 
     * @param gpa
     *        a int to gpa
     */

    public void setGradeAverage(int gpa) {
        gradeAverage = gpa;
        
        
    }
    
    @Override
    public String toString() {
        return firstName + " " + lastName + " " + birthYear 
                + " " + studentNumber + " " + gradeAverage;
    }


}
