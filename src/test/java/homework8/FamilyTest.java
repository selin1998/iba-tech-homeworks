package homework8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    Human father = new Human("Rodrigo", "Borgia", 1431);
    Human mother = new Human("Vannozza", "Cattenei", 1442);
    Human son1 = new Human("Giovanni", "Borgia", 1474);
    Human son2 = new Human("Cezare", "Borgia", 1475);
    Human daughter = new Human("Lucrezia", "Borgia", 1480);
    Human son3 = new Human("Gioffre", "Borgia", 1482);


    Human simpson1 = new Human("Homer", "Simpson", 1951, 100, null);
    Human simpson2 = new Human("Marge", "Simpson", 1953, 120, null);
    Human simpson3 = new Human("Bart", "Simpson", 1977);
    Human simpson4 = new Human("Lisa", "Simpson", 1979);
    Human simpson5 = new Human("Maggie", "Simpson", 1986);


    Family PopeFamily = new Family(mother, father);
    Family Simpsons = new Family(simpson2, simpson1);

    Pet cat1 = new DomesticCat("Lucifer");
    Pet dog1 = new Dog("Rex");
    Set<Pet> animals = new HashSet<Pet>();

    List<Human> children = Arrays.asList(simpson3, simpson4);


    @BeforeEach
    void setUp() {

        animals.add(cat1);
        animals.add(dog1);
        PopeFamily.setPet(animals);
        PopeFamily.addChild(son1);
        PopeFamily.addChild(son2);
        PopeFamily.addChild(daughter);
        PopeFamily.addChild(son3);
        Simpsons.setChildren(children);

    }

    @Test
    void setChildren() {

        assertEquals(children, Simpsons.getChildren());


    }

    @Test
    void deleteChild() {
        int sizeBefore = PopeFamily.getChildren().size();
        Human h = son1;
        PopeFamily.deleteChild(h);
        for (int i = 0; i < sizeBefore - 1; i++) {
            assertNotSame(h, PopeFamily.getChildren().get(i));
        }

    }


    @Test
    void deleteChildbyIndex() {


        PopeFamily.deleteChild(1);
        assertFalse(PopeFamily.getChildren().contains(son2));
        assertEquals(3, PopeFamily.getChildren().size());
        PopeFamily.deleteChild(2);
        assertFalse(PopeFamily.getChildren().contains(son3));

    }

    @Test
    void deleteChildbyIndexOutOfBounds() {

        int index1 = 5;
        int index2 = -2;

        PopeFamily.deleteChild(index1);

        assertEquals(4, PopeFamily.getChildren().size());

        PopeFamily.deleteChild(index2);

        assertEquals(4, PopeFamily.getChildren().size());


    }

    @Test
    void countFamily() {


        int actual = PopeFamily.countFamily();
        assertEquals(8, actual);
        PopeFamily.addChild(son2);
        PopeFamily.addChild(son1);
        assertEquals(10, PopeFamily.countFamily());
        PopeFamily.deleteChild(1);
        assertEquals(9, PopeFamily.countFamily());


    }

    @Test
    void addChild() {
        Simpsons.addChild(simpson5);
        assertEquals(3, Simpsons.getChildren().size());
        assertSame(simpson5, Simpsons.getChildren().get(2));


    }

    @Test
    void bornChild() {
        Simpsons.bornChild();
        assertEquals(3, Simpsons.getChildren().size());
        assertEquals((simpson1.getIq() + simpson2.getIq()) / 2, Simpsons.getChildren().get(2).getIq());
        assertEquals("Simpson", Simpsons.getChildren().get(2).getSurname());

    }

    @Test
    void setPet() {
        Pet cat = new DomesticCat("Snowball");
        Pet dog = new Dog("Santa");
        Set<Pet> pets = new HashSet<>();
        pets.add(cat);
        pets.add(dog);
        Simpsons.setPet(pets);
        assertTrue(Simpsons.getPet().contains(cat));
        assertTrue(Simpsons.getPet().contains(dog));
        assertEquals(2, Simpsons.getPet().size());

    }


}