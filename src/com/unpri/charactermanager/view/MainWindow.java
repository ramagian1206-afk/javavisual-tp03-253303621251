
package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainWindow extends JFrame {

    // Konstanta batas level untuk teks emas
    private static final int GOLD_LEVEL_THRESHOLD = 5;

    public MainWindow(ArrayList<Character> characterList) {

        setTitle("Character Manager v0.4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(
            new BoxLayout(mainPanel, BoxLayout.Y_AXIS)
        );

        mainPanel.setBackground(AppTheme.BACKGROUND_COLOR);
        mainPanel.setBorder(AppTheme.MAIN_BORDER);

        // Judul aplikasi
        JLabel titleLabel = new JLabel("CHARACTER MANAGER");
        titleLabel.setFont(AppTheme.TITLE_FONT);
        titleLabel.setForeground(AppTheme.TEXT_COLOR);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        mainPanel.add(titleLabel);
        mainPanel.add(Box.createVerticalStrut(20));

        // Panel daftar karakter
        JPanel characterPanel = new JPanel();
        characterPanel.setLayout(
            new GridLayout(0, 1, 0, 10)
        );

        characterPanel.setBackground(
            AppTheme.BACKGROUND_COLOR
        );

        int totalLevel = 0;

        // Menampilkan karakter secara dinamis
        for (Character character : characterList) {

            JPanel card = new JPanel();
            card.setLayout(
                new BoxLayout(card, BoxLayout.Y_AXIS)
            );

            // Warna kartu sesuai role
            card.setBackground(
                AppTheme.colorFor(character.getType())
            );

            card.setOpaque(true);
            card.setBorder(AppTheme.CARD_BORDER);

            JLabel nameLabel = new JLabel(
                character.getName()
            );

            nameLabel.setFont(AppTheme.BODY_FONT);
            nameLabel.setForeground(AppTheme.TEXT_COLOR);

            JLabel roleLabel = new JLabel(
                "Role: " + character.getType()
            );

            roleLabel.setFont(AppTheme.BODY_FONT);
            roleLabel.setForeground(AppTheme.TEXT_COLOR);

            JLabel levelLabel = new JLabel(
                "Level: " + character.getLevel()
            );

            // Mini-Challenge: level minimal 5 berwarna emas
            if (character.getLevel() >= GOLD_LEVEL_THRESHOLD) {

                levelLabel.setForeground(AppTheme.GOLD_COLOR);
                levelLabel.setFont(AppTheme.LEVEL_FONT);

            } else {

                levelLabel.setForeground(AppTheme.TEXT_COLOR);
                levelLabel.setFont(AppTheme.BODY_FONT);
            }

            // Properti tambahan 1: Tooltip
            card.setToolTipText(
                character.getName()
                + " | Role: " + character.getType()
                + " | Level: " + character.getLevel()
            );

            // Properti tambahan 2: Level 1 dinonaktifkan
            if (character.getLevel() == 1) {
                card.setEnabled(false);
                nameLabel.setEnabled(false);
                roleLabel.setEnabled(false);
                levelLabel.setEnabled(false);
            }

            card.add(nameLabel);
            card.add(roleLabel);
            card.add(levelLabel);

            characterPanel.add(card);

            totalLevel += character.getLevel();
        }

        // Menghitung rata-rata level
        double averageLevel = 0;

        if (!characterList.isEmpty()) {
            averageLevel =
                (double) totalLevel / characterList.size();
        }

        JLabel averageLabel = new JLabel(
            "Rata-rata Level: "
            + String.format("%.2f", averageLevel)
        );

        averageLabel.setFont(AppTheme.LEVEL_FONT);
        averageLabel.setForeground(AppTheme.TEXT_COLOR);
        averageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        mainPanel.add(characterPanel);
        mainPanel.add(Box.createVerticalStrut(15));
        mainPanel.add(averageLabel);

        setContentPane(mainPanel);

        // Ukuran otomatis mengikuti komponen
        pack();

        setMinimumSize(new Dimension(400, 300));
        setLocationRelativeTo(null);
    }
}
