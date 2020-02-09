package com.example.demo.dao;

import com.example.demo.entity.paper;
import com.example.demo.entity.result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface paperRepository extends JpaRepository<paper,Integer> {

    @Query(value = "select count(*) from paper where tid=?1",nativeQuery = true)
    int  paper_count (int tid);
    @Query(value = "select * from paper where tid=?1",nativeQuery = true)
    List<paper> show_paper (int tid);
    @Query(value = "select count(*) from paper",nativeQuery = true)
    int  paper_count2 ();
}
