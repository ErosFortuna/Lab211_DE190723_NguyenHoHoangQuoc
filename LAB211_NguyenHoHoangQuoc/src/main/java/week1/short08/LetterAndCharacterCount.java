/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.short08;

import java.util.HashMap;

/**
 *
 * @author ASUS PC
 */
public class LetterAndCharacterCount {

    private HashMap<String, Integer> letter = new HashMap<>();
    private HashMap<Character, Integer> characters = new HashMap<>();
    private String sentence;

    public LetterAndCharacterCount(String sentence) {
        this.sentence = sentence;
    }

    public void countLetter() {
        String[] tempLetters = sentence.split(" ");
        for (String word : tempLetters) {
            if (letter.get(word) != null) {
                letter.put(word, letter.get(word) + 1);
            } else {
                letter.put(word, 1);
            }
        }
        System.out.println(letter);
    }

    public void countCharater() {
        String[] tempLetters = sentence.split(" ");
        for (String word : tempLetters) {
            for (int i = 0; i < word.length(); i++) {
                if (characters.get(word.charAt(i)) != null) {
                    characters.put(word.charAt(i), characters.get(word.charAt(i)) + 1);
                } else {
                    characters.put(word.charAt(i), 1);
                }
            }
        }
        System.out.println(characters);
    }

}
