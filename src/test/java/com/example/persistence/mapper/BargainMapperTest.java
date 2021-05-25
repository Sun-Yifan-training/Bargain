package com.example.persistence.mapper;
import com.example.Application;
import com.example.persistence.entity.Bargain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class BargainMapperTest {

    public static void main(String[] args) {
        // DIコンテナの作成
        SpringApplication application = new SpringApplication(Application.class);
        application.setWebApplicationType(WebApplicationType.NONE); // Webアプリケーション環境を無効化
        ApplicationContext context = application.run(args);

        // EmployeeMapperのBeanを取得
        BargainMapper bargainMapper = context.getBean(BargainMapper.class);

        System.out.println("==== 全件検索 ====");
        List<Bargain> bargainList1 = bargainMapper.findAll();
        for (Bargain bargain: bargainList1) {
            System.out.println(bargain);
        }
    }
}