package com.example.service.impl;

import com.example.persistence.entity.Bargain;
import com.example.persistence.mapper.BargainMapper;
import com.example.service.BargainService;
import org.apache.ibatis.javassist.compiler.ast.Keyword;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BargainServiceImpl implements BargainService {

    private final BargainMapper bargainMapper;

    public BargainServiceImpl(BargainMapper bargainMapper){
        this.bargainMapper = bargainMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Bargain> findAll(){
        List<Bargain> bargainList = bargainMapper.findAll();
        return bargainList;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Bargain> findByNameLike(String Keyword){
        List<Bargain> bargainList= bargainMapper.findByNameLike("%" + Keyword + "%");
        return  bargainList;
    }
    @Transactional(readOnly = true)
    public List<Bargain> findByCategory(int Keyword){
        //System.out.println(Keyword);
        List<Bargain> bargainList= bargainMapper.findByCategory(Keyword);
        return  bargainList;
    }


    @Override
    @Transactional(readOnly = false)
    public void insert(Bargain bargain){
        bargainMapper.insert(bargain);
    }
}
