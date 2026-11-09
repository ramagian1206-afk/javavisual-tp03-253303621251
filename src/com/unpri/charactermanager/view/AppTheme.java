
package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.CharacterType;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class AppTheme {

    // WARNA UTAMA
    public static final Color BACKGROUND_COLOR =
            new Color(245, 247, 250);

    public static final Color PANEL_COLOR =
            new Color(255, 255, 255);

    public static final Color TEXT_COLOR =
            new Color(40, 45, 55);

    public static final Color WARRIOR_COLOR =
            new Color(255, 220, 220);

    public static final Color MAGE_COLOR =
            new Color(220, 225, 255);

    public static final Color ARCHER_COLOR =
            new Color(220, 245, 225);

    public static final Color HEALER_COLOR =
            new Color(255, 240, 205);

    public static final Color GOLD_COLOR =
            new Color(190, 140, 20);

    public static final Border MAIN_BORDER =
        BorderFactory.createEmptyBorder(
            20, 20, 20, 20
        );

    // FONT UTAMA
    public static final Font TITLE_FONT =
            new Font("SansSerif", Font.BOLD, 22);

    public static final Font BODY_FONT =
            new Font("SansSerif", Font.PLAIN, 14);

    public static final Font LEVEL_FONT =
            new Font("SansSerif", Font.BOLD, 14);

    // BORDER KARTU
    public static final Border CARD_BORDER =
            BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(
                    new Color(210, 215, 225), 1
                ),
                BorderFactory.createEmptyBorder(
                    10, 12, 10, 12
                )
            );

    // WARNA BERDASARKAN ROLE
    public static Color colorFor(CharacterType type) {

        if (type == null) {
            return PANEL_COLOR;
        }

        switch (type) {
            case WARRIOR:
                return WARRIOR_COLOR;

            case MAGE:
                return MAGE_COLOR;

            case ARCHER:
                return ARCHER_COLOR;

            case HEALER:
                return HEALER_COLOR;

            default:
                return PANEL_COLOR;
        }
    }
}
