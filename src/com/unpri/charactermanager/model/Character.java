package com.unpri.charactermanager.model;

public class Character {

    // Atribut
    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attack;
    private int mana;

    // Constructor pertama
    public Character(String name, CharacterType type) {
        this.name = name;
        this.type = type;
        this.level = 1;
        this.hitPoints = 100;
        this.attack = 10;
        this.mana = 50;
    }

    // Constructor kedua
    public Character(String name, CharacterType type, int level) {
        this.name = name;
        this.type = type;
        setLevel(level);
        this.mana = 50;
    }

    // Getter dan Setter Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter dan Setter Type
    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    // Getter dan Setter Level
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException(
                "Level tidak boleh kurang dari 1"
            );
        }

        this.level = level;

        // HP dan attack dihitung ulang berdasarkan level
        this.hitPoints = 100 * level;
        this.attack = 10 * level;
    }

    // Getter dan Setter HitPoints
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        if (hitPoints < 0) {
            throw new IllegalArgumentException(
                "Hit points tidak boleh negatif"
            );
        }

        this.hitPoints = hitPoints;
    }

    // Getter dan Setter Attack
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if (attack < 0) {
            throw new IllegalArgumentException(
                "Attack tidak boleh negatif"
            );
        }

        this.attack = attack;
    }

    // Getter dan Setter Mana
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException(
                "Mana tidak boleh negatif"
            );
        }

        this.mana = mana;
    }

    // Method Level Up
    public void levelUp() {
        setLevel(this.level + 1);
    }

    // Method untuk mengecek karakter masih hidup
    public boolean isAlive() {
        return hitPoints > 0;
    }

    // Method toString
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", level=" + level +
                ", hitPoints=" + hitPoints +
                ", attack=" + attack +
                ", mana=" + mana +
                '}';
    }
}