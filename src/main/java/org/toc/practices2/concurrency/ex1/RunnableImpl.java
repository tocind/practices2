package org.toc.practices2.concurrency.ex1;

public class RunnableImpl implements Runnable {
    int taskNum;

    RunnableImpl(int _taskNum){
        taskNum = _taskNum;
    }

    public void run (){
        System.out.println (Thread.currentThread().getName()+" executing "+taskNum);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException iex){
        }
    }

}
