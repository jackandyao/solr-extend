package com.solr.base.spring.respository;

import com.solr.base.spring.po.Product;
import org.springframework.data.solr.repository.SolrCrudRepository;

/**
 * Created by Lanxiaowei
 */
public interface ProductRepository extends SolrCrudRepository<Product,String> {
}