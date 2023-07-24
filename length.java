
import java.util.*;
public class length {  
 public static void main(String[] args) {
        String str1 = "hello World";
		System.out.println("Original String: "+str1);
        System.out.println("Length of the last word of the above string: "+length_Of_last_word(str1));
    }

    public static int length_Of_last_word(String str1) {
        int len= 0;
        String[] wrd = str1.split(" ");
        if(wrd.length>0) {
            length_word = words[wrd.length-1].length();			
        } else {
            length_word = 0;
        }
        return len;
    }