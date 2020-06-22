package homework7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    Pet pet;
    Pet newPet;
    Pet otherPet;

    @BeforeEach
    void setUp() {
        this.pet = new Dog("Tuzik", 7, 70, new String[]{"barking", "rolling the tail", "standing on two legs"});
        this.newPet = new Dog("Tuzik", 7, 40, new String[]{"eating ice-cream"});
        this.otherPet = new Fish("Tuzik");

    }

    @Test
    void testEquals() {
        assertTrue(pet.equals(newPet));
        assertFalse(pet.equals(otherPet));

    }


    @Test
    void testToString() {
        String str = String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=%s }", Species.DOG, "Tuzik", 7, 70, Arrays.toString(new String[]{"barking", "rolling the tail", "standing on two legs"}));
        assertEquals(str, pet.toString());
    }
}