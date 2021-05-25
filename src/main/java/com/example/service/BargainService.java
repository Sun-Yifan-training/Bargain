package com.example.service;

import com.example.persistence.entity.Bargain;

import java.util.List;

public interface BargainService {

    List<Bargain> findAll();

    List<Bargain> findByNameLike(String keyword);

    List<Bargain> findByCategory(int keyword);


    void insert(Bargain bargain);
}
