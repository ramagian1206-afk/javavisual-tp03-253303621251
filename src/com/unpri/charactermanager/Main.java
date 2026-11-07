package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== CHARACTER MANAGER TP3 ===");

        // Membuat 3 karakter
        Character character1 = new Character(
                "Arthur", CharacterType.WARRIOR
        );

        Character character2 = new Character(
                "Merlin", CharacterType.MAGE
        );

        Character character3 = new Character(
                "Robin", CharacterType.ARCHER, 3
        );

        // Menampilkan 3 karakter
        System.out.println("\n--- Daftar Karakter ---");
        System.out.println(character1);
        System.out.println(character2);
        System.out.println(character3);

        // Demo Level Up
        System.out.println("\n--- Demo Level Up ---");

        System.out.println("Level sebelum: " +
                character1.getLevel());

        character1.levelUp();

        System.out.println("Level sesudah: " +
                character1.getLevel());

        System.out.println(character1);

        // Mini-Challenge: Mana dan isAlive
        System.out.println("\n--- Mini-Challenge ---");

        Character character4 = new Character(
                "Necro", CharacterType.MAGE
        );

        character4.setMana(120);

        System.out.println("Mana: " +
                character4.getMana());

        System.out.println("Apakah karakter hidup? " +
                character4.isAlive());

        System.out.println(character4);
    }
}