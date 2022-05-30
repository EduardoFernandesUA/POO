/**
 * Props to:
 *  https://www.instagram.com/durval_02/
 */

package Aula10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        String s = "Hello World";
        Map<Character, HashSet<Integer>> hm = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            HashSet<Integer> hs = new HashSet<>();
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    hs.add(j);
                }
            }
            hm.put(s.charAt(i), hs);
        }

        for (Map.Entry<Character, HashSet<Integer>> k : hm.entrySet()) {
            System.out.println(k.getKey() + " = " + k.getValue() + " :)");
        }
    }
}