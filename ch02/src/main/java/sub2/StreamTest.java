package sub2;

/*
    날짜 :
    이름 :
    내용 :
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@ToString
@AllArgsConstructor
class Person {
    private String name;
    private int age;
}

public class StreamTest {

    public static void main(String[] args) {

        // 리스트 선언
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 리스트 원소 출력
        for(int i=0 ; i<list.size() ; i++){
            System.out.println("list element : " + list.get(i));
        }

        // 스트림을 이용한 출력(함수형 프로그래밍)
        list.forEach((num)->{
            System.out.println(num);
        });

        list.forEach(System.out::println);

        // map() - 컬렉션 각 원소의 일괄 처리
        List<Integer> resultList = list.stream()
                                        .map(num->{
                                            return num * num;
                                        })
                                        .collect(Collectors.toList());

        System.out.println(resultList);

        // person 리스트 생성
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("김유신", 21));
        persons.add(new Person("김춘추", 20));
        persons.add(new Person("장보고", 31));
        persons.add(new Person("강감찬", 41));
        persons.add(new Person("이순신", 51));

        System.out.println(persons);

        persons.stream().map((person)->{
            int age = person.getAge();
            return age;
        }).forEach((age)->{
            System.out.println(age);
        });

    }
}
