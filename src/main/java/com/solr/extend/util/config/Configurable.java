package com.solr.extend.util.config;

import com.solr.extend.util.jdbc.JDBCConfig;

/**
 * Created by jack on 2018/3/3.
 */
public interface Configurable {
    public JDBCConfig initConfig();
}
