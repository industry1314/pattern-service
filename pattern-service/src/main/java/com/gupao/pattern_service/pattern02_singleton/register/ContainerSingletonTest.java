package com.gupao.pattern_service.pattern02_singleton.register;

import java.util.concurrent.CountDownLatch;

public class ContainerSingletonTest {

    public static int testCount = 35;
    public static CountDownLatch countDownLatch = new CountDownLatch(testCount);

    public static void main(String[] args) {
        for (int i = 0; i < testCount; i++) {
            Thread thread = new Thread(new RunHandler());
            thread.start();
            countDownLatch.countDown();
        }
        System.out.println("主线程运行完毕");
    }

    static class RunHandler implements Runnable {
        @Override
        public void run() {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Object instance = ContainerSingleton.getInstance("com.gupao.pattern_service.pattern02_singleton.register.Pojo");
            System.out.println(instance);
        }
    }

}

