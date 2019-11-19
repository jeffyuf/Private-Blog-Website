package com.yufei.myblog.dao;

import com.yufei.myblog.po.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Yufei on 11/3/19 1:52 AM
 * for project myblog
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
