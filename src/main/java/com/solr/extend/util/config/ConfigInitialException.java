package com.solr.extend.util.config;

/**
 * Created by jack on 2018/3/3.
 */
public class ConfigInitialException extends RuntimeException {
    public ConfigInitialException() {
        super();
    }

    public ConfigInitialException(String message) {
        super(message);
    }

    public ConfigInitialException(String message, Throwable cause) {
        super(message, cause);
    }
}

