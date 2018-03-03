package com.solr.extend.util.config;

import com.solr.extend.util.jdbc.JDBCConfig;

/**
 * Created by jack on 2018/3/3.
 */
public abstract class DefaultConfigurable implements Configurable {
    protected JDBCConfig config;

    public DefaultConfigurable() {
        initConfig();
    }

    /**
     * @Author: Lanxiaowei(736031305@qq.com)
     * @Title: initConfig
     * @Description: 初始化爬虫配置对象
     * @return void
     * @throws
     */
    public JDBCConfig initConfig() {
        this.config = JDBCConfig.getInstance();
        return this.config;
    }

    public JDBCConfig getConfig() {
        return config;
    }

    public void setConfig(JDBCConfig config) {
        this.config = config;
    }
}
