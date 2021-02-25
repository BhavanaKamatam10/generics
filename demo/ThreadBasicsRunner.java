package demo;

class Task1 extends Thread {
    public void run(){
        //SIGNATURE
        System.out.println("\nTask1 started");

        for(int i=101;i<=199;i++)
            System.out.println(i + " ");

            System.out.println("\nTask1 Done");

    }
}
class Task2 implements Runnable {
    @Override
    public void run() {
        System.out.println("\nTask2 started");

        for(int i=201;i<=299;i++)
            System.out.println(i + " ");

            System.out.println("\nTask2 Done");


    }
}
public class ThreadBasicsRunner {
    public static void main(String[] args) {
        //task1
        System.out.println("\nTask1 kicked off");
        Task1 task1 = new Task1();
        task1.setPriority(1);
        task1.start();//task1.run();

        //task2
        System.out.println("\nTask2 kicked off");
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(10);
        task2Thread.start();//task1.run();

        //task3
        System.out.println("\nTask3 kicked off");
        for(int i=301;i<=399;i++)
            System.out.println(i + " ");


    }
}
