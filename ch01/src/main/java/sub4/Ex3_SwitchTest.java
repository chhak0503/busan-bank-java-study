package sub4;


enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class Ex3_SwitchTest {

    public static void main(String[] args) {

        // 일반 switch
        DayOfWeek day = DayOfWeek.MONDAY;

        switch (day) {
            case MONDAY:
                System.out.println("MONDAY");
                break;
            case SATURDAY:
                System.out.println("주말");
                break;
                
        }

        // switch 표현식
        String dayName = switch (day) {
            case MONDAY -> "월요일";
            case TUESDAY -> "화요일";
            case WEDNESDAY -> "수요일";
            case THURSDAY -> "목요일";
            case FRIDAY -> "금요일";
            case SATURDAY -> "토요일";
            case SUNDAY -> "일요일";
        };

        System.out.println(dayName);
    }
}
