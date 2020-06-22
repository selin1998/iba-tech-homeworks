package homework6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    Human father = new Human("Rodrigo", "Borgia", 1431);
    Human mother = new Human("Vannozza", "Cattenei", 1442);
    Human son1 = new Human("Cezare", "Borgia", 1475);
    Human son2 = new Human("Giovanni", "Borgia", 1474);
    Human daughter = new Human("Lucrezia", "Borgia", 1480);


    Human son3 = new Human("Gioffre", "Borgia", 1482);


    Family PopeFamily = new Family(mother, father);

    Pet cat1 = new Pet(Species.CAT, "Lucifer");


    @BeforeEach
    void setUp() {

        PopeFamily.addChild(son2);
        PopeFamily.addChild(son1);
        PopeFamily.setPet(cat1);
    }


    @Test
    void addChild() {
        PopeFamily.addChild(daughter);
        assertEquals(3, PopeFamily.getChildren().length);
        assertEquals(daughter, PopeFamily.getChildren()[2]);


    }

    @Test
    void deleteChild() {

        int resultBefore = PopeFamily.getChildren().length;
        Human test = son2;


        PopeFamily.deleteChild(test);
        for (int i = 0; i < resultBefore - 1; i++) {
            assertNotSame(test, PopeFamily.getChildren()[i]);
        }


        Human test2 = son3; // not in children array
        PopeFamily.deleteChild(test2);


    }

    @Test
    void deleteChildbyIndex() {
        int index = 1;

        //   index=5 ;  // returns true if index is out of range
        // index=-2;

        PopeFamily.deleteChild(index);

        if (index < 0 && index > PopeFamily.getChildren().length - 1) {
            Human ch = PopeFamily.getChildren()[index];
            for (int i = 0; i < PopeFamily.getChildren().length; i++) {
                assertNotSame(ch, PopeFamily.getChildren()[i]);
            }

        }
    }


    @Test
    void countFamily() {

        int expectation = 5;
        int actual = PopeFamily.countFamily();
        assertEquals(expectation, actual);

        PopeFamily.deleteChild(son2);
        actual = PopeFamily.countFamily();
        expectation = 4;
        assertEquals(expectation, actual);


    }


    public String getExpectedToString(Family family) {
        String result = "Family{" +
                "mother=" + mother.toString() +
                ", father=" + father.toString() +
                ", children=" + Arrays.toString(family.getChildren()) +
                ", pet=" + String.valueOf(family.getPet()) +
                '}';
        return result;
    }

    @Test
    void toStringControl() {

        assertEquals(getExpectedToString(PopeFamily), PopeFamily.toString());
    }


}