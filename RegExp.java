/* This is a very simple program that I wrote using the Java Pattern class. The program tests if a string
belongs to a language given the following regular expressions: 

A1 = {w| w ∈ {0,1}*, w begins with a 1 and ends with 0}
Regex: 1Σ*0

A2 = {w| w ∈ {0,1}*, w contains at least three 1s}
Regex: Σ* 1 Σ* 1 Σ* 1 Σ*
*/
import java.util.regex.Pattern;

class RegExp {

    public static void main(String[] args) {
        //print regex for A1
        String a1 = "1[0-1]*0";
        System.out.println("Regex A1: " + a1);

        // print expected matching string & result
        String str1 = "1001100100010";
        System.out.printf("Test String 1: %s\n", str1);
        System.out.println(Pattern.matches(a1, str1));

        // print expected non-matching string & result
        String str2 = "0000101";
        System.out.println("Test String 2: " + str2);
        System.out.println(Pattern.matches(a1, str2));

        System.out.println("--------------------------");

        //print regex for A2
        String a2 = "[0-1]*1[0-1]*1[0-1]*1[0-1]*";
        System.out.println("Regex A2: " + a2);

        // print expected matching string & result
        String str3 = "1001100001111111";
        System.out.println("Test String 1: " + str3);
        System.out.println(Pattern.matches(a2,str3));

        // print expected non-matching string & result
        String str4 = "01000010000";
        System.out.println("Test String 2: " + str4);
        System.out.println(Pattern.matches(a2,str4));
    }
}
