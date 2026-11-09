package com.unpri.charactermanager.model;

import java.util.ArrayList;

public class CharacterManager {

    private ArrayList<Character> characters;

    // Constructor
    public CharacterManager() {
        characters = new ArrayList<>();
    }

    // Menambahkan karakter dan menolak nama duplikat
    public boolean addCharacter(Character character) {

        if (character == null) {
            return false;
        }

        if (findByName(character.getName()) != null) {
            System.out.println(
                    "Karakter dengan nama " +
                    character.getName() +
                    " sudah ada!"
            );

            return false;
        }

        characters.add(character);

        System.out.println(
                "Karakter " +
                character.getName() +
                " berhasil ditambahkan."
        );

        return true;
    }

    // Mencari karakter berdasarkan nama
    public Character findByName(String name) {

        for (Character character : characters) {

            if (character.getName() != null &&
                    character.getName().equalsIgnoreCase(name)) {

                return character;
            }
        }

        return null;
    }

    // Menghapus karakter berdasarkan nama
    public boolean removeCharacter(String name) {

        Character character = findByName(name);

        if (character != null) {
            characters.remove(character);

            System.out.println(
                    "Karakter " + name +
                    " berhasil dihapus."
            );

            return true;
        }

        System.out.println(
                "Karakter " + name +
                " tidak ditemukan."
        );

        return false;
    }

    // Menghitung total karakter dalam manager
    public int getTotalCharacters() {
        return characters.size();
    }

    // Mengembalikan salinan ArrayList
    public ArrayList<Character> getAllCharacters() {
        return new ArrayList<>(characters);
    }

    // Menghitung rata-rata level
    public double getAverageLevel() {

        if (characters.isEmpty()) {
            return 0;
        }

        int totalLevel = 0;

        for (Character character : characters) {
            totalLevel += character.getLevel();
        }

        return (double) totalLevel / characters.size();
    }

    // Mencari karakter berdasarkan tipe
    public ArrayList<Character> findByType(CharacterType type) {

        ArrayList<Character> result = new ArrayList<>();

        for (Character character : characters) {

            if (character.getType() == type) {
                result.add(character);
            }
        }

        return result;
    }

    /**
     * Mencari karakter dengan nilai attack tertinggi.
     * Jika tidak ada karakter, method mengembalikan null.
     *
     * @return karakter dengan attack tertinggi atau null
     */
    public Character findStrongest() {

        if (characters.isEmpty()) {
            return null;
        }

        Character strongest = characters.get(0);

        for (Character character : characters) {

            if (character.getAttack() > strongest.getAttack()) {
                strongest = character;
            }
        }

        return strongest;
    }
}