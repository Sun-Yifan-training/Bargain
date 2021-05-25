package com.example.persistence.mapper;

import com.example.persistence.entity.Bargain;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BargainMapper {
    @Select("SELECT e.id AS id, e.name AS name, e.category AS category," +
            " w.id AS weekday_id, w.name AS weekday_name" +
            " FROM bargain e" +
            " JOIN weekday w ON e.weekday_id = w.id" +
            " ORDER BY w.id")
    List<Bargain> findAll();

    @Select("SELECT e.id AS id, e.name AS name, e.category AS category," +
            " w.id AS weekday_id, w.name AS weekday_name" +
            " FROM bargain e" +
            " JOIN weekday w ON e.weekday_id = w.id" +
            " WHERE e.name LIKE #{keyword}" +
            " ORDER BY w.id")
    List<Bargain> findByNameLike(String keyword);

    @Select("SELECT e.id AS id, e.name AS name, e.category AS category," +
            " w.id AS weekday_id, w.name AS weekday_name" +
            " FROM bargain e" +
            " JOIN weekday w ON e.weekday_id = w.id" +
            " WHERE e.weekday_id = #{keyword}" +
            " ORDER BY w.id")
    List<Bargain> findByCategory(int keyword);

    @Insert("INSERT INTO bargain(name, category, weekday_id)" +
            " VALUES(#{name}, #{category}, #{weekdayId})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void insert(Bargain bargain);
}
