package com.ysk.spi;

import java.util.ServiceLoader;

/**
 * @author ysk
 * @date 2023/7/28 5:03 PM
 */
public class SearchEngine {

    public static void main(String[] args) {
        ServiceLoader<Search> loader=ServiceLoader.load(Search.class);
        for (Search search : loader) {
            search.search("Java SPI");
        }
    }
}
