package com.safanner.ecomm.services.customer;

import com.safanner.ecomm.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface CustomerProductService {

    List<ProductDto> searchProductByTitle(String title);

    List<ProductDto> getAllProducts();
}
