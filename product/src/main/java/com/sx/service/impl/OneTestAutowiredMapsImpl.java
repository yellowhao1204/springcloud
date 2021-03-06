package com.sx.service.impl;

import com.sx.service.TestAutowiredMaps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/5/10 9:33
 */
@Slf4j
@Service
public class OneTestAutowiredMapsImpl implements TestAutowiredMaps {
    @Async
    @Override
    public void doSome() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("one执行了");
    }
}
