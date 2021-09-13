/* Class: Course.java
 * Author:  Cesar Goncalves
 * Date: 9/13/2021
 */
public class Course {
 
    // variables
    private int ID;
    private String Name;
    private int Code;
    
    // -----------------------------------------------------
    // get & set methods for Name
    public String getName() {
        
        return Name;
        
    }
    
    public void setName(String newName) {
        
        Name = newName;
        
    }

    // -----------------------------------------------------
    // get & set methods for ID
    public int getID() {

        return ID;

    }

    public void setID(int newID) {

        ID = newID;

    }

    // -----------------------------------------------------
    // get & set methods for Code
    public int getCode() {
        
        return Code;


    }

    public void setCode(int newCode) {

        Code = newCode;


    }

    // --------------------------------------------------------------------
    // default constructor
    public Course() {

    }

    // --------------------------------------------------------------------
    // overloaded constructor
    public Course(int nID, int nCode, String nName) {

        ID = nID;
        Code = nCode;
        Name = nName;

    }
}