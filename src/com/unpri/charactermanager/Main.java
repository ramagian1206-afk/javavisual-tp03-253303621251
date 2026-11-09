package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.model.CharacterManager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println(" CHARACTER MANAGER TP5 AP6");
        System.out.println("================================");

        CharacterManager manager = new CharacterManager();

        // Membuat karakter
        Character arthur = new Character(
                "Arthur", CharacterType.WARRIOR, 5
        );

        Character merlin = new Character(
                "Merlin", CharacterType.MAGE, 8
        );

        Character robin = new Character(
                "Robin", CharacterType.ARCHER, 3
        );

        Character healer = new Character(
                "Healer", CharacterType.HEALER, 4
        );

        // Bagian A: CRUD
        System.out.println("\n--- ADD CHARACTER ---");

        manager.addCharacter(arthur);
        manager.addCharacter(merlin);
        manager.addCharacter(robin);
        manager.addCharacter(healer);

        // Pengujian duplikat
        Character duplicate = new Character(
                "Arthur", CharacterType.MAGE
        );

        manager.addCharacter(duplicate);

        System.out.println(
                "Total karakter: " +
                manager.getTotalCharacters()
        );

        // Pengujian equals
        System.out.println("\n--- EQUALS ---");

        Character testCharacter = new Character(
                "Arthur", CharacterType.WARRIOR
        );

        System.out.println(
                "Arthur.equals(testCharacter): " +
                arthur.equals(testCharacter)
        );

        // Find by name
        System.out.println("\n--- FIND BY NAME ---");

        Character found = manager.findByName("Merlin");

        if (found != null) {
            System.out.println("Ditemukan: " + found);
        }

        // Remove character
        System.out.println("\n--- REMOVE CHARACTER ---");

        manager.removeCharacter("Robin");

        System.out.println(
                "Total setelah hapus: " +
                manager.getTotalCharacters()
        );

        // Menampilkan seluruh karakter
        System.out.println("\n--- ALL CHARACTERS ---");

        for (Character character : manager.getAllCharacters()) {
            System.out.println(character);
        }

        // Mini-Challenge: Average Level
        System.out.println("\n--- ANALYTICS ---");

        System.out.println(
                "Average Level: " +
                manager.getAverageLevel()
        );

        // Mini-Challenge: Find by Type
        System.out.println("\n--- FIND BY TYPE: WARRIOR ---");

        ArrayList<Character> warriors =
                manager.findByType(CharacterType.WARRIOR);

        for (Character character : warriors) {
            System.out.println(character);
        }

        // Bagian C: Find Strongest
        System.out.println("\n--- STRONGEST CHARACTER ---");

        Character strongest = manager.findStrongest();

        if (strongest != null) {
            System.out.println("Karakter terkuat: " + strongest);
        }

        // Eksperimen reference
        System.out.println("\n--- REFERENCE EXPERIMENT ---");

        ArrayList<Character> copy = manager.getAllCharacters();

        System.out.println(
                "Total manager sebelum clear copy: " +
                manager.getTotalCharacters()
        );

        copy.clear();

        System.out.println(
                "Jumlah karakter dalam copy: " +
                copy.size()
        );

        System.out.println(
                "Total manager setelah clear copy: " +
                manager.getTotalCharacters()
        );

        // Static counter
        System.out.println("\n--- STATIC COUNTER ---");

        System.out.println(
                "Total objek Character dibuat: " +
                Character.getTotalCharacterCreated()
        );

        // Pengujian list kosong
        System.out.println("\n--- EMPTY MANAGER TEST ---");

        CharacterManager emptyManager = new CharacterManager();

        System.out.println(
                "Average level list kosong: " +
                emptyManager.getAverageLevel()
        );

        System.out.println(
                "Strongest list kosong: " +
                emptyManager.findStrongest()
        );
    }
}