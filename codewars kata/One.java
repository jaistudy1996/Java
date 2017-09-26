// x Simple, given a string of words, return the length of the shortest word(s).

// String will never be empty and you do not need to account for different data types.

import java.util.Arrays;
import java.lang.String;

public class One {
    public static void main(String[] args){
        System.out.println(findShort("This is a test"));
    }

    public static int findShort(String s) {
        // String[] split_array;
        // split_array = s.split(" ");
        // int min_length = 0;
        // int first = 0;
        // for(String w:split_array){
        //     if(first == 0){
        //         min_length = w.length();
        //         first = 1;
        //     }
        //     else{
        //         if(w.length() < min_length){
        //             min_length = w.length();
        //         }
        //     }
        // }
        // return min_length;

        // better one:
        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }
}