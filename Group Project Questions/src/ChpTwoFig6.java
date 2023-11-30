/** Chapter Two, Figure Six
 *  In this variable, create some methods fulfilling the parameters set in their respective comments.
 */

public class ChpTwoFig6 {
    static boolean isLargerThanFive(int x) {} //For this method, write some code determining whether or not the passed integer is larger than five.

    static int multiplyByThree(int y) {} //For this method, write some code multiplying the passed integer by three.

    static char getGrade(int z) {} //For this method, write some code that returns a students letter grade based on their number grade.

    public static void main(String[] args) {
        int x = 4;
        System.out.println(isLargerThanFive(x));
        x = 6;
        System.out.println(isLargerThanFive(x));

        int y = 3;
        System.out.println(multiplyByThree(y));
        y = 12;
        System.out.println(multiplyByThree(y));

        int z = 90;
        System.out.println(getGrade(z));
        z = 68;
        System.out.println(getGrade(z));
    }
}
