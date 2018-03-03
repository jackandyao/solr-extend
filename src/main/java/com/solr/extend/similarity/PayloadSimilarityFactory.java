package com.solr.extend.similarity;
import org.apache.lucene.search.similarities.Similarity;
import org.apache.solr.search.similarities.DefaultSimilarityFactory;
/**
 * Created by jack on 2018/3/3.
 */
public class PayloadSimilarityFactory extends DefaultSimilarityFactory {
    @Override
    public Similarity getSimilarity() {
        return new PayloadSimilarity();
    }
}
