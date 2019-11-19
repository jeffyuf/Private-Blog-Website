package com.yufei.myblog.service;

import com.yufei.myblog.NotFoundException;
import com.yufei.myblog.dao.CategoryRepository;
import com.yufei.myblog.po.Category;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Yufei on 11/3/19 1:49 AM
 * for project myblog
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional
    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Transactional
    @Override
    public Category getCategory(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

    @Transactional
    @Override
    public Category updateCategory(Long id, Category category) {
        Category temp = categoryRepository.findById(id).orElse(null);
        if (temp == null) {
            throw new NotFoundException("Updated category does not exist!");
        }
        // copy properties to current category
        BeanUtils.copyProperties(category, temp);

        return categoryRepository.save(temp);
    }

    @Transactional
    @Override
    public Page<Category> listCategory(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }
}
