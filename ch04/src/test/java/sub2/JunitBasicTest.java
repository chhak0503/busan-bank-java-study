package sub2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sub1.Calc;

import static org.junit.jupiter.api.Assertions.*;

class JunitBasicTest {

    Calc calc = new Calc();

    @DisplayName("plus() 테스트")
    @Test
    public void test1(){
        // given - 테스트 준비
        int num1 = 1;
        int num2 = 2;
        int expected = 5;

        // when - 테스트 실행
        int actual = calc.plus(num1, num2);

        // then - 테스트 검증
        assertEquals(expected, actual);
    }

    @DisplayName("minus() 테스트")
    @Test
    public void test2(){
        // given - 테스트 준비
        int num1 = 1;
        int num2 = 2;
        int expected = -1;

        // when - 테스트 실행
        int actual = calc.minus(num1, num2);

        // then - 테스트 검증
        assertEquals(expected, actual);
    }

    @DisplayName("multiply() 테스트")
    @Test
    public void test3(){
        // given - 테스트 준비
        int num1 = 2;
        int num2 = 3;
        int expected = 6;

        // when - 테스트 실행
        int actual = calc.multiply(num1, num2);

        // then - 테스트 검증
        assertEquals(expected, actual);
    }

    @DisplayName("divide() 테스트")
    @Test
    public void test4(){
        // given - 테스트 준비
        int num1 = 4;
        int num2 = 2;
        int expected = 2;

        // when - 테스트 실행
        int actual = calc.divide(num1, num2);

        // then - 테스트 검증
        assertEquals(expected, actual);
    }


}