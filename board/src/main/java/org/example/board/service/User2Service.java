package org.example.board.service;

import jakarta.transaction.Transactional;
import org.example.board.entity.User2;
import org.example.board.repository.User2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class User2Service {

    @Autowired
    private User2Repository user2Repository;

    public void save(User2 user2) {
        // 등록
        user2Repository.save(user2);
    }

    public User2 findById(String uid){
        Optional<User2> optUser2 = user2Repository.findById(uid);

        if(optUser2.isPresent()){
            User2 user2 = optUser2.get();
            return user2;
        }
        return null;
    }

    public List<User2> findAll(){
        return user2Repository.findAll();
    }

    // 트랜잭션 처리 어노테이션
    @Transactional
    public void update(User2 user2){

        Optional<User2> optUser2 = user2Repository.findById(user2.getUid());

        if(optUser2.isPresent()){
            User2 savedUser2 = optUser2.get();
            
            // 수정(영속성 전이, 트랜잭션으로 처리해야 반영됨)
            savedUser2.setName(user2.getName());
            savedUser2.setBirth(user2.getBirth());
            savedUser2.setGender(user2.getGender());
            savedUser2.setAddress(user2.getAddress());
        }
    }

    public void delete(){}



}
