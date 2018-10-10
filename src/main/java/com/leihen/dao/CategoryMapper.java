package com.leihen.dao;

import com.leihen.entity.Category;
import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(String cid);

    int insert(Category record);

    Category selectByPrimaryKey(String cid);

    List<Category> selectAll();

    int updateByPrimaryKey(Category record);
}