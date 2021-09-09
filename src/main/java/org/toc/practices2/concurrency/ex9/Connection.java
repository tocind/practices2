package org.toc.practices2.concurrency.ex9;

import java.util.concurrent.Semaphore;

// Lets try to maintain the number of connections 10
public class Connection {
    private static Connection INSTANCE = new Connection();
    private Semaphore semaphore = new Semaphore(10, true);
    private int connections;

    private Connection(){

    }
    public static Connection getConnection(){
        return INSTANCE;
    }

    public void connect(){

        try{
            semaphore.acquire();
            synchronized (this){
                ++connections;
                System.out.println("Current number of connections: "+ connections);
            }
            Thread.sleep(2000);
            synchronized (this){
                --connections;
            }
        }catch (InterruptedException iex){
        }finally {
            if(semaphore != null)
                semaphore.release();
        }

    }
}
