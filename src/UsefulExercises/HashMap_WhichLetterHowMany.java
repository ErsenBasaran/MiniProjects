package UsefulExercises;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap_WhichLetterHowMany {
    public static void main(String[] args) {

        //example 2: Write the code that shows how many times each letter in a given String is used in that String.
        //           “Hello” ==> H=1, e=1, l=2, o=1

        String s= ".....ersen basaran.....";
        s= s.replaceAll("\\p{Punct}", "");
        s=s.replaceAll(" ", "");
        String[] letters= s.split("");
        System.out.println(Arrays.toString(letters)); // [e, r, s, e, n, b, a, s, a, r, a, n]


        HashMap<String,Integer> myMap = new HashMap<>();

        for (String w : letters){
            Integer howMany = myMap.get(w);
            if (howMany == null){
                myMap.put(w,1);
            }else {
                myMap.put(w,howMany + 1);
            }
        }
        System.out.println(myMap); // {a=3, r=2, b=1, s=2, e=2, n=2}
    }
}
