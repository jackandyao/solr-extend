package com.solr.extend.function;

import org.apache.lucene.queries.function.ValueSource;
import org.apache.solr.search.FunctionQParser;
import org.apache.solr.search.SyntaxError;
import org.apache.solr.search.ValueSourceParser;

/**
 * 自定义函数转换器
 */
public class ConcatenateFunctionParser extends ValueSourceParser {
    public ValueSource parse(FunctionQParser parser) throws SyntaxError {
        ValueSource value1 = parser.parseValueSource();
        ValueSource value2 = parser.parseValueSource();
        String delimiter = null;
        if (parser.hasMoreArguments()){
            delimiter = parser.parseArg();
        }
        return new ConcatenateFunction(value1, value2, delimiter);
    }
}