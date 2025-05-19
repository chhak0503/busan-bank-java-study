package sub4;

import java.util.ArrayList;

public class Ex6_PatternTest {

    public static void main(String[] args) {

        Object obj = "문자열 데이터 입니다.";

        // 일반적인 방식
        if(obj instanceof String) {
            String str = (String) obj;
            System.out.println("문자열 길이 : " + str.length());
        }

        // 패턴 매칭 방식
        if(obj instanceof String str) {
            System.out.println("문자열 길이 : " + str.length());
        }

        printInfo("Text");
        printInfo(100);
        printInfo(new ArrayList<String>());

    } // main() end

    public static void printInfo(Object obj) {

        if(obj instanceof String str) {
            System.out.println(str.toUpperCase());
        } else if (obj instanceof Integer num) {
            System.out.println(num * 2);
        } else {
            System.out.println(obj.getClass().getName());
        }
    }



}
