package com.liuzhihang.demo.utils;

/**
 * @author liuzhihang
 * @date 2020/11/8 16:45
 */
public class TransactionalUtils {

    private static volatile TransactionalComponent transactionalComponent;

    private static synchronized TransactionalComponent getTransactionalComponent() {
        if (transactionalComponent == null) {
            transactionalComponent = ApplicationContextUtils.getBean(TransactionalComponent.class);
        }
        return transactionalComponent;
    }

    public static void required(TransactionalComponent.Cell cell) throws Exception {
        getTransactionalComponent().required(cell);
    }

}
