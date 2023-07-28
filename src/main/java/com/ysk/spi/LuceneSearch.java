package com.ysk.spi;

import org.springframework.stereotype.Service;

/**
 * @author ysk
 * @date 2023/7/28 4:59 PM
 */
public class LuceneSearch implements Search {
    @Override
    public void search(String keyword) {
        System.out.println("Lucene search: " + keyword);
    }
}
