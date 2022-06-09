package Aula11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex1 {
    public static void main(String[] args) {
        TreeMap<String, TreeMap<String, Integer>> map = new TreeMap<>();
        
        try {
            File file = new File("./src/Aula11/major.txt");
            Scanner scanner = new Scanner(file);
            
            scanner.findAll("[A-zÀ-ú0-9]{3,}")
                .reduce((prevMatch,  match) -> {
                    String prevWord = prevMatch.group(0).toLowerCase();
                    String word = match.group(0).toLowerCase();

                    if( !map.containsKey(prevWord) ) {
                        map.put(prevWord, new TreeMap<>());
                    }
                    if( !map.get(prevWord).containsKey(word) ) {
                        map.get(prevWord).put(word, 1);
                    } else {
                        map.get(prevWord).put(word, map.get(prevWord).get(word));
                    }
                    return match;
                });
            
            // String prevWord = "";
            // while( scanner.hasNext("[a-zA-Z0-9]{3,}") ) {
            //     System.out.println(1);
            //     String word = scanner.next("[a-zA-Z0-9]{3,}");

            //     if( !map.containsKey(prevWord) ) {
            //         map.put(prevWord, new HashMap<>());
            //     }
            //     if( !map.get(prevWord).containsKey(word) ) {
            //         map.get(prevWord).put(word, 1);
            //     } else {
            //         map.get(prevWord).put(word, map.get(prevWord).get(word));
            //     }
            //     prevWord = word;

            //     if( scanner.hasNext("[^a-zA-Z0-9]") ) scanner.next("[^a-zA-Z0-9]");
            // }

            System.out.println(map.toString());

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            e.printStackTrace();
        }
    }
}