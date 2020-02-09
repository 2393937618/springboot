package com.example.demo.dao;

import com.example.demo.entity.paper;
import com.example.demo.entity.project;
import com.example.demo.entity.result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface projectRepository extends JpaRepository<project,Integer> {
    @Query(value = "select count(*) from project where tid=?1",nativeQuery = true)
    int  project_count (int tid);
    @Query(value = "select * from project where tid=?1",nativeQuery = true)
    List<project> show_project (int tid);
    @Query(value = "select count(*) from project",nativeQuery = true)
    int  project_count2 ();
}
