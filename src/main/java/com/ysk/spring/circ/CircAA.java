package com.ysk.spring.circ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ysk
 * @date 2023/7/6 9:02 PM
 */
@Service
public class CircAA {
    @Autowired
    private CircBB bb;
}
