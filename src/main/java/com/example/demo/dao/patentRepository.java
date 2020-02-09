package com.example.demo.dao;

import com.example.demo.entity.patent;
import com.example.demo.entity.result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface patentRepository extends JpaRepository<patent,Integer> {

    @Query(value = "select count(*) from patent where tid=?1",nativeQuery = true)
    int  patent_count (int tid);
    @Query(value = "select * from patent where tid=?1",nativeQuery = true)
    List<patent> show_patent (int tid);
    @Query(value = "select count(*) from patent",nativeQuery = true)
    int  patent_count2 ();
}
