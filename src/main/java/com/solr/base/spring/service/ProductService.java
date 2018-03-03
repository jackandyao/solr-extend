package com.solr.base.spring.service;


import com.solr.base.spring.po.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.solr.core.query.result.SolrResultPage;

import java.util.List;


/**
 * Created by Lanxiaowei
 */
public interface ProductService {
    void addProductToSolr(Product product);
    void deleteProductById(String id);
    void updateProductToSolr(Product product);
    Product findProductById(String id);
    SolrResultPage<Product> findProductsByIds(List<String> ids);
    SolrResultPage<Product> findAllProducts();
    Page<Product> findByProductName(String productName, int currentPage,int pageSize);
    List<Product> findByProductNameLike(String productName);
    List<Product> findByIdIn(List<String> ids);

    Product findByNamedQuery(String id);
}