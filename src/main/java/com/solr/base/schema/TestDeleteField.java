package com.solr.base.schema;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.request.schema.SchemaRequest;
import org.apache.solr.client.solrj.response.schema.SchemaResponse;
import org.apache.solr.common.util.NamedList;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lanxiaowei
 * 测试删除一个普通域
 */
public class TestDeleteField {
    private static final String SOLR_URL = "http://localhost:8080/solr/";
    private static final String CORE_NAME = "test1";
    public static void main(String[] args) throws Exception {
        SolrClient client = new HttpSolrClient(SOLR_URL);
        String fieldName = "product_name";
        SchemaRequest.DeleteField deleteField = new SchemaRequest.DeleteField(fieldName);
        SchemaResponse.UpdateResponse response = deleteField.process(client,CORE_NAME);
        NamedList<Object> result = response.getResponse();
        System.out.println(result);
    }
}