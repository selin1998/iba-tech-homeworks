package homework8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {
    Pet pet;
    Pet newPet;
    Pet otherPet;


    Set<String> habits = new HashSet<>(Arrays.asList("jumping", "sleeping", "swimming"));

    @BeforeEach
    void setUp() {
        this.pet = new Dog("Tuzik", 7, 70, new HashSet<>(Arrays.asList("barking", "rolling the tail", "standing on two legs")));
        this.newPet = new Dog("Tuzik", 7, 40, new HashSet<>(Arrays.asList("eating ice-cream")));
        this.otherPet = new Fish("Tuzik");


    }

    @Test
    void testEquals() {
        assertTrue(pet.equals(newPet));
        assertFalse(pet.equals(otherPet));

    }


    @Test
    void setHabits() {
        otherPet.setHabits(habits);
        assertEquals(habits, otherPet.getHabits());
    }
}