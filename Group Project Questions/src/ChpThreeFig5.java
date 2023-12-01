/** Chapter Three, Figure Five
 *  In this exercise, some variables have been declared outside the main method. In front of each variable, write an access
 *  modifier that fulfills the objective set by the corresponding comment. For one of them, you will not need to write an
 *  access modifier.
 */
public class ChpThreeFig5 {
    String varOne() {       //Give this variable an access modifier that gives it maximum visibility within Java.
        String varOne = "Hello, World!";
        return varOne;
    }
    int varTwo() {          //Give this variable an access modifier that makes it invisible only to non-subclasses in different packages.
        int varTwo = 10;
        return varTwo;
    }
    char varThree() {       //Give this variable an access modifier that makes it visible only to the defining class and the rest of the package.
        char varThree = 'a';
        return varThree;
    }
    boolean varFour() {     //Give this variable an access modifier that makes it visible only to the defining class.
        boolean varFour = true;
        return varFour;
    }
}
