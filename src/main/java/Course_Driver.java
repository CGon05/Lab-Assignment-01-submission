/* Class: Course_Driver.java
 * Author:  Cesar Goncalves
 * Date: 9/13/2021
 */
public class Course_Driver {

    public static void main(String[] args) {
        
        //-----------------------------------------------------------------------------------------------------------------
        // instantiateing constructors
        Course C1 = new Course();
        Course C2 = new Course(32, 224, "CSC");
        
        //-----------------------------------------------------------------------------------------------------------------
        //changing the value of the elements for C1
        C1.setID(23);
        C1.setCode(333);
        C1.setName("VIS");
        
        //-----------------------------------------------------------------------------------------------------------------
        //Print Statments
        System.out.println("The course ID for the first course is" + C1.getID() + ". The coures code is " + C1.getCode()
				+ ". The name is " + C1.getName() + ".");

	System.out.println("The course ID for the second course is" + C2.getID() + ". The coures code is "
				+ C2.getCode() + ". The name is " + C2.getName() + ".");
    }
}