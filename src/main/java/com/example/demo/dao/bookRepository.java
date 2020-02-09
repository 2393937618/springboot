package com.example.demo.dao;

import com.example.demo.entity.book;
import com.example.demo.entity.result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface bookRepository extends JpaRepository<book,Integer> {
    @Query(value = "select count(*) from book where tid=?1",nativeQuery = true)
    int  book_count (int tid);
    @Query(value = "select * from book where tid=?1",nativeQuery = true)
    List<book> show_book (int tid);
    @Query(value = "select count(*) from book",nativeQuery = true)
    int  book_count2 ();
}
