package org.toc.practices2.concurrency.ex7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UserService {
    static ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {

        for (int i = 1; i <= 100; ++i) {
            int id = 1;
            executorService.submit(()->
                    System.out.println(new UserService().getBirthDate(id))
            );
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
    }

    public String getBirthDate(int userId) {
        Date date = birthDate(userId);
        final SimpleDateFormat df = ThreadSafeFormatter.threadLocal.get();
        return df.format(date);
    }

    private Date birthDate(int id) {
        return new Date();
    }
}
