package Aula12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Ex1 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> map = new HashMap<>();

        File file = new File("./src/Aula12/lorem.txt");
        Scanner sc = new Scanner(file);

        sc.findAll("[a-zA-Z]+").forEach(match -> {
            String word = match.group(0).trim().toLowerCase();
            int count = map.getOrDefault(word, 0);
            map.put(word, count+1);
        });

        int sum =  map.values().stream().reduce(0, (acc,elem)->acc+elem);

        System.out.printf("Número Total de Palavras: %d\n", sum);
        System.out.printf("Número de Palavras Diferentes: %d\n", map.size());

    }
}