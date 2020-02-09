package com.example.demo.dao;


import com.example.demo.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

public interface userRepository extends JpaRepository<user,Integer> {
    @Transactional
    @Modifying
    @Query(value = "insert into user(username,password,work_in,user_position,user_call)values (?1,?2,?3,?4,?5)",nativeQuery = true)
    int insert_teacher(String username, String password, String work_in, String user_position, String user_call);

    @Query(value = "SELECT id FROM user ORDER BY id DESC LIMIT 1",nativeQuery = true)
    String  user_id ();

    @Query(value = "SELECT status FROM user where id=?1",nativeQuery = true)
    int  root_id (int id);


    @Transactional
    @Modifying
    @Query(value = "delete from user where id=?1")
    int teacher_delete(int id);


    @Query(value = "SELECT * FROM user where id=?1",nativeQuery = true)
    List<user> send_teacher_message (String id);
    @Transactional
    @Modifying
    @Query(value = "update user set username=?2,password=?3,work_in=?4,user_position=?5,user_call=?6 where id=?1")
    int  update_teacher(int id,String username, String password, String work_in, String user_position, String user_call);


}
