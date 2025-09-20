package com.manage.TrackIt.services;

import com.manage.TrackIt.dtos.CategoryDTO;
import com.manage.TrackIt.dtos.Response;

public interface CategoryService {

    Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);
}
