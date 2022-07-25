package leetCodeExamples;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Isomorphic {

    public static boolean isIsomorphic(String str1, String str2){

        // two strings cannot be isomorphic if they have diff lengths.
        if(str1.length() != str2.length()){
            return false;
        }
        //Use Java's built in map to store mappings of str1 chars to str2 chars.
        Map<Character,Character> map = new HashMap<>();
        // Use a set to keep track of already mapped characters.
        Set<Character> set = new HashSet<>();
        for(int i=0;i<str1.length();i++){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if(map.containsKey(c1)){
                if(map.get(c1) != c2){
                    return false;
                }
            }else{
                if(set.contains(c2)){
                    return false;
                }
                map.put(c1, c2);
                set.add(c2);
            }
        }

        return true;

    }

    public static void main(String[] args) {

        String str1 = "ACAB";
        String str2 = "XCXY";

        if (isIsomorphic(str1, str2)) {
            System.out.print(str1 + " and " + str2 + " are isomorphic");
        }
        else {
            System.out.print(str1 + " and " + str2 + " are not isomorphic");
        }
    }
}
