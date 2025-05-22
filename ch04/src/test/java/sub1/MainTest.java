package sub1;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class MainTest {


    @Test
    void test1(){

        Random rand = new Random(42);
        int value = rand.nextInt(10000);

        System.out.println("value : " + value);

    }
}
