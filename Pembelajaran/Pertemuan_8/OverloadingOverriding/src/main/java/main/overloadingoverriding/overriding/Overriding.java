/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.overloadingoverriding.overriding;

/**
 *
 * @author User
 */
public class Overriding {
    public static void main() {
        // Entity
        System.out.println("\n\nCLASS ENTITY");
        Entity entity = new Entity(1, 10, 10);
        entity.move(20, 20);
        entity.move(10);
        
        // Character
        System.out.println("\n\nCLASS CHARACTER");
        Character character = new Character(2, 20, 20, 55, 100);
        character.speak();
        character.speak("Oya? Oya oya?");
        
        // PlayableCharacter
        System.out.println("\n\nCLASS PLAYABLECHARACTER");
         PlayableCharacter hutao = new PlayableCharacter(3, 25, 25, 55, 100, "Hu Tao", "Pyro");
         hutao.speak();
         hutao.attack();
         hutao.attack("Spear");
    }
}
