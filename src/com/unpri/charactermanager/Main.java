
package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.view.MainWindow;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        // Data karakter
        manager.addCharacter(
            new Character("Arthur", CharacterType.WARRIOR, 5)
        );

        manager.addCharacter(
            new Character("Merlin", CharacterType.MAGE, 8)
        );

        manager.addCharacter(
            new Character("Robin", CharacterType.ARCHER, 3)
        );

        manager.addCharacter(
            new Character("Luna", CharacterType.HEALER, 4)
        );

        // Menambahkan 2 karakter baru
        manager.addCharacter(
            new Character("Thor", CharacterType.WARRIOR, 7)
        );

        manager.addCharacter(
            new Character("Elena", CharacterType.MAGE, 6)
        );

        // Menjalankan GUI pada Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow(
                manager.getAllCharacters()
            );

            window.setVisible(true);
        });
    }
}
