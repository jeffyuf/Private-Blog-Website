package com.yufei.myblog.service;

import com.yufei.myblog.po.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by Yufei on 11/3/19 1:46 AM
 * for project myblog
 */
public interface CategoryService {

    Category addCategory(Category category);

    Category getCategory(Long id);

    void deleteCategory(Long id);

    Category updateCategory(Long id, Category category);

    Page<Category> listCategory(Pageable pageable);
}
