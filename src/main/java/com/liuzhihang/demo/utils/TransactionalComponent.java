package com.liuzhihang.demo.utils;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liuzhihang
 * @date 2020/11/6 19:17
 */
@Component
public class TransactionalComponent {

    public interface Cell {

        void run() throws Exception;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void required(Cell cell) throws Exception {

        cell.run();
    }
}
