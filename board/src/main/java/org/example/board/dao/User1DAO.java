package org.example.board.dao;

import org.example.board.dto.User1DTO;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@Repository
public class User1DAO {

    private String host = "jdbc:h2:tcp://localhost/~/test";
    private String user = "sa";
    private String pass = "1234";


    public void insertUser1(User1DTO user1DTO) {

        try{
            // 데이터베이스 접속
            Connection conn = DriverManager.getConnection(host, user, pass);

            // SQL 객체 생성 및 데이터 매핑
            String sql = "INSERT INTO user1 (name, birth, age, addr) VALUES (?,?,?,?)";
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1, user1DTO.getName());
            psmt.setString(2, user1DTO.getBirth());
            psmt.setInt(3, user1DTO.getAge());
            psmt.setString(4, user1DTO.getAddr());

            // SQL 실행
            psmt.executeUpdate();

            // 자원해제
            psmt.close();

            // 데이터베이스 종료
            conn.close();
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void selectUser1(){}

    public void selectAllUser1(){}

    public void updateUser1(){}

    public void deleteUser1(){}


}
