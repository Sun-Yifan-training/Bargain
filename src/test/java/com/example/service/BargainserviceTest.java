package com.example.service;

import com.example.Application;
import com.example.persistence.entity.Bargain;
import com.example.persistence.mapper.BargainMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.List;

public class BargainserviceTest {

    public static void main(String[] args) {
        // DIコンテナの作成
        SpringApplication application = new SpringApplication(Application.class);
        application.setWebApplicationType(WebApplicationType.NONE); // Webアプリケーション環境を無効化
        ApplicationContext context = application.run(args);


        BargainService bargainService = context.getBean(BargainService.class);

        System.out.println("==== 新規追加 ====");
        bargainService.insert(new Bargain("バナナ半額", "果物",1));

        System.out.println("==== 全件検索 ====");
        List<Bargain> bargainList1 = bargainService.findAll();
        for (Bargain bargain: bargainList1) {
            System.out.println(bargain);
        }
    }
}
