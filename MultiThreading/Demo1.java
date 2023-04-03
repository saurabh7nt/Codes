// 1.Creating Thread

// class MyThread extends Thread{
//     public void run(){
//         for(int i=0 ; i<5; i++){
//             System.out.println("Child Thread");
//         }
//     }
// }

// public class Demo1{
//     public static void main(String[]args){
//         MyThread t = new MyThread();
//         t.start();
//         //Suppose you are calling run method directly then it will be called like a normal method and it wont 
//         //create a new thread. Here to create a new thread you have to call t.start() method. 
//         // t.run();
//         for(int i=0 ; i<5; i++){
//             System.out.println("Main Thread");
//         }
//     }
// }


// 2. Start() method case

// class MyThread extends Thread{
//     public void run(){
//         for(int i=0 ; i<5; i++){
//             System.out.println("Child Thread");
//         }
//     }
//     public void start(){
//         //This line will be responsible to call the super class ie. thread class run method
//         //If you comment the following line then new thread will not be created.
//         super.start();          
//         // System.out.println("Normal start method..thread wont get created.");
//     }
// }

// public class Demo1{
//     public static void main(String[]args){
//         MyThread t = new MyThread();
//         t.start();
//         for(int i=0 ; i<5; i++){
//             System.out.println("Main Thread");
//         }
//     }
// }

// 3. By implementing runnable interface

// class MyThread implements Runnable{
//     public void run(){
//         System.out.println("Thread in run method : "+Thread.currentThread());
//     }
// }

// public class Demo1{
//     public static void main(String[]args){
//         System.out.println("Thread in main method : "+Thread.currentThread());
//         MyThread runnable = new MyThread();
//         Thread t = new Thread(runnable);
//         t.start();
//     }
// }

// 4. Yield method

class MyThread extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Child thread");
            //Yield method will pause the execution of current thread and give the chance to another
            //thread of same priority . If multiple threads are waiting then the thread scheduler 
            //will decide which thread is going to be executed.
            Thread.yield();           
        }
    }
}

public class Demo1{
    public static void main(String[]args){
        MyThread t = new MyThread();
        t.start();
        for(int i=0; i<5; i++){
            System.out.println("Main thread");
        }
    }
}

// 5. Join() method

// class MyThread extends Thread{
//     public void run(){
//             System.out.println("Child thread started.");
//             try{
//                 Thread.sleep(3000);
//             }catch(InterruptedException e){
//                 e.printStackTrace();
//             }
//             System.out.println("Child thread ended.");
//         }
//     }

// public class Demo1{
//     public static void main(String[]args) throws InterruptedException{
//         MyThread t = new MyThread();
//         t.start();
//         //Here main thread has to wait until the completion of the child thread.
//         //After completion of child thread the main thread will continue its execution.
//         t.join();
//         System.out.println("Main thread ended");
//     }
// }