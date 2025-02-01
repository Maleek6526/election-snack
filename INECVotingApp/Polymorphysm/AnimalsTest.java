package Polymorphysm;

import org.junit.jupiter.api.Test;

class AnimalsTest {

    @Test
    public void testNonsense(){
        Animals animals = new Animals();
        Cat cat = new Cat();
        Lion lion = new Lion();
        Dog dog = new Dog();
        Animals[] animals1 = new Animals[4];
        animals1[0] = animals;
        animals1[1] = cat;
        animals1[2] = lion;
        animals1[3] = dog;

        for (Animals animals2 : animals1){
            animals2.move();
        }
    }

}