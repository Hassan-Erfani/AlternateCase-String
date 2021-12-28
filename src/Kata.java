import static java.lang.Character.*;

//    alternateCase which switch every letter in
//    string from upper to lower and from lower to upper.
//    E.g: Hello World -> hELLO wORLD

public class Kata {
    static String alternateCase(final String string) {

        String str = "";
        if(string.equals("")) {
            return str;
        }
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == ' ' && i != string.length()-1) {
                str += c;
            } else if (isUpperCase(c)) {
                str += toLowerCase(c);
            } else if (isLowerCase(c)) {
                str += toUpperCase(c);
            } else {
                str += c;
            }
        }
        return str;
    }
}

