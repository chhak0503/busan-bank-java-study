package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
create table student (
 student_id int primary key auto_increment,
 name varchar(20),
 birth date,
 major varchar(20),
 email varchar(100)
);

 */
public class JdbcTest {

    private static final String host = "jdbc:h2:tcp://localhost/~/test";
    private static final String user = "sa";
    private static final String pass = "1234";

    public static void main(String[] args) {
        try {
            // 데이터베이스 접속
            Connection conn = DriverManager.getConnection(host, user, pass);

            // SQL 실행객체 생성
            String sql = "insert into student (name, birth, major, email) values (?,?,?,?)";
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1, "홍길동");
            psmt.setString(2, "1990-09-09");
            psmt.setString(3, "컴퓨터공학");
            psmt.setString(4, "hong@gmail.com");

            // SQL 실행
            psmt.executeUpdate();

            // 자원해제
            psmt.close();
            conn.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("데이터 저장 완료");
    }
}
