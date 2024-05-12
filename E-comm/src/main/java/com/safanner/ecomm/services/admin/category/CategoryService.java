package com.safanner.ecomm.services.admin.category;

import com.safanner.ecomm.dto.CategoryDto;
import com.safanner.ecomm.entities.Category;

public interface CategoryService {

    Category createcategory(CategoryDto categoryDto);
}
