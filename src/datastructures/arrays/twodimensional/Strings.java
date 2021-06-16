package datastructures.arrays.twodimensional;

public class Strings {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.length());

        //substring
        System.out.println(str.substring(2,4));
        System.out.println(str.substring(2,5));
        System.out.println(str.substring(3,3)); // 3-3 = 0 length of the string that is to be return is turned out be 0
        System.out.println(str.substring(0,3));
        System.out.println(str.substring(1)); // start = 1 to end = str.length() - 1

        //concat the string
        String str2 = "bye";
        System.out.println(str + str2);
        System.out.println(str.concat(str2));

        //indexOf() -> index at which particular string is present
        System.out.println(str.indexOf("el"));
        System.out.println(str.indexOf("EL")); // Since EL is not present in the str = "Hello" so it returns -1

        //startsWith()
        System.out.println(str.startsWith("Hel")); // true
        System.out.println(str.startsWith("kk"));  // false

        // == & equals method
        String s1 = "Hello";
        String s2 = s1;
        String s3 = "Hello";
        String s4 = new String("Hello");
        System.out.println(s1 == s2 + "," + s1.equals(s2) ); // true true
        System.out.println(s1 == s3 + "," + s1.equals(s3));  // true true
        System.out.println(s1 == s4 + "," + s1.equals(s4));  // false true

        //print each character of the string in different line
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        //print all the substring of the string in different line
        for (int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j < str.length(); j++) {
                System.out.println(str.substring(i,j));
            }
        }

        //Since strings are immutable in nature they will give us very bad performance
        //StringBuilders are used to remove that performance that we see in the basic string
        //in the nutshell we can say that string builder give better performance wrt the string

        //StringBuilder
        StringBuilder s5 = new StringBuilder("mayank");

    }
}

// Strings are used to store the sequence of character
// Why strings are immutable in java???
//      -->