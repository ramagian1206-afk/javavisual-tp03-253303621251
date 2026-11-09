package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainWindow extends JFrame {

    public MainWindow(ArrayList<Character> characterList) {
        setTitle("Character Manager v0.3");
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));

        JLabel titleLabel = new JLabel("Character Manager");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(titleLabel);
        panel.add(Box.createVerticalStrut(15));

        // Menampilkan karakter secara dinamis
        int totalLevel = 0;

        for (Character character : characterList) {
            JLabel characterLabel = new JLabel(
                character.getName() + " | "
                + character.getType() + " | Level "
                + character.getLevel()
            );

            characterLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(characterLabel);

            totalLevel += character.getLevel();
        }

        // Menghitung rata-rata level
        double averageLevel = 0;

        if (!characterList.isEmpty()) {
            averageLevel = (double) totalLevel / characterList.size();
        }

        panel.add(Box.createVerticalStrut(15));

        JLabel averageLabel = new JLabel(
            "Rata-rata Level: "
            + String.format("%.2f", averageLevel)
        );

        averageLabel.setFont(new Font("Arial", Font.BOLD, 14));
        averageLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        panel.add(averageLabel);

        add(panel);
    }
}