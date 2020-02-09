package com.example.demo.dao;

import com.example.demo.entity.result;
import com.example.demo.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface resultRepository extends JpaRepository<result,Integer> {
    @Query(value = "select count(*) from result where tid=?1",nativeQuery = true)
    int  result_count (int tid);
    @Query(value = "select * from result where tid=?1",nativeQuery = true)
    List<result> show_result (int tid);
    @Transactional
    @Modifying
    @Query(value = "insert into result(tid,`name`,`time`,`level`,certificate)values (?1,?2,?3,?4,?5)",nativeQuery = true)
    int insert_result(Integer tid, String name, String time, String level, String certificate);
    @Query(value = "select count(*) from result",nativeQuery = true)
    int  result_count2 ();
}
