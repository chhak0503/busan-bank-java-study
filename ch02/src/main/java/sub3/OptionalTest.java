package sub3;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {

        // 값이 있는 optional 생성
        Optional<String> opt1 = Optional.of("Hello");
        System.out.println(opt1);

        // 값이 없는 optional 생성
        Optional<String> opt2 = Optional.empty();
        System.out.println(opt2);

        // null값을 갖는 optional 생성
        Optional<String> opt3 = Optional.ofNullable(null);
        System.out.println(opt3);

        /////////////////////////////////////////////////////
        // Optional 기본 메서드

        // isPresent - 값 존재 확인
        System.out.println("opt1 isPresent : " + opt1.isPresent());
        System.out.println("opt2 isPresent : " + opt2.isPresent());
        System.out.println("opt2 isPresent : " + opt3.isPresent());

        // isEmpty - 값이 있는지 없는지 검사
        System.out.println("opt1 isEmpty : " + opt1.isEmpty());
        System.out.println("opt2 isEmpty : " + opt2.isEmpty());
        System.out.println("opt3 isEmpty : " + opt3.isEmpty());

        // get - Optional 값을 가져오기
        try {
            System.out.println("opt1 get : " + opt1.get());
            System.out.println("opt2 get : " + opt2.get());
            System.out.println("opt3 get : " + opt3.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // orElse - 값이 없으면 기본값으로 반환
        String value1 = opt1.orElse("Welcome");
        String value2 = opt2.orElse("Welcome");
        String value3 = opt3.orElse("Welcome");

        System.out.println("value1 : " + value1);
        System.out.println("value2 : " + value2);
        System.out.println("value3 : " + value3);

        // orElseGet - 값이 없으면 Supplier로 부터 값 가져오기
        String var1 = opt1.orElseGet(()->{
            return "Greeting";
        });

        String var2 = opt2.orElseGet(()->{
            return "Greeting";
        });

        String var3 = opt3.orElseGet(()->{
            return "Greeting";
        });

        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
        System.out.println("var3 : " + var3);
        
        // orElseThrow - 값이 없으면 예외 발생
        try {
            String result1 = opt1.orElseThrow(() -> new Exception());
            System.out.println("result1 : " + result1);

            String result2 = opt2.orElseThrow(() -> new Exception());
            System.out.println("result2 : " + result2);

            String result3 = opt3.orElseThrow(() -> new Exception());
            System.out.println("result3 : " + result3);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
