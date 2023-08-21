package Bytecode;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/17/2023
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * This class represent game objects which properties can be changed by instructions interpreted by
 * virtual machine.
 */
@AllArgsConstructor
@Setter
@Getter
public class Wizard {

    private int health;
    private int agility;
    private int wisdom;
    private int numberOfPlayedSounds;
    private int numberOfSpawnedParticles;

    public void playSound() {
        System.out.println("Playing sound");
        numberOfPlayedSounds++;
    }

    public void spawnParticles() {
        System.out.println("Spawning particles");
        numberOfSpawnedParticles++;
    }
}
