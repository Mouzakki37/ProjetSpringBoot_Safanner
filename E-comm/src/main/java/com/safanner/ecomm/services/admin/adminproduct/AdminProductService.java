package com.safanner.ecomm.services.admin.adminproduct;

import com.safanner.ecomm.dto.ProductDto;

import java.io.IOException;
import java.util.List;

public interface AdminProductService {
    ProductDto addProduct(ProductDto productDto) throws IOException;

    List<ProductDto> getAllProduct();
    List<ProductDto> getAllProductByName(String name);

    boolean deleteProduct(Long id);
}
