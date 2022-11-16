package com.wsousa.jpa.service;

import com.wsousa.jpa.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface ProductService {

    public List<Product> findAllProducts();
    public List<Product> findProductsWithSorting(String field);
    public Page<Product> findProductsWithPagination(int offset, int pageSize);
    public Page<Product> findProductsWithPaginationAndSorting(int offset,int pageSize,String field);

}
