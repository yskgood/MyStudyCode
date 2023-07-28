package com.ysk.spi;

import com.ysk.spi.Search;

/**
 * @author ysk
 * @date 2023/7/28 4:59 PM
 */
public class ElasticsearchSearch implements Search {
    @Override
    public void search(String keyword) {
        System.out.println("Elasticsearch search: " + keyword);
    }
}
