public class LazyThreadSafeSingletonDemo {
    
    // Multi Threaded environment demonstration
    public static void main(String[] args) {
        // Create multiple threads
        Runnable task = () -> {
            Logger logger = Logger.getInstance();
            logger.log("Thread " + Thread.currentThread().getName() + " got logger");
        };
        
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");
        
        t1.start();
        t2.start();
        t3.start();
        
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // All threads get same instance
        Logger logger = Logger.getInstance();
        logger.log("Main thread using logger");
        logger.error("This is an error");
        logger.debug("Debugging information");
        
        System.out.println("\n=== All Logs ===");
        System.out.println(logger.getAllLogs());
    }
}

// output
// Logger instance created
// [Sun Apr 26 02:12:57 IST 2026] INFO: Thread Thread-3 got logger
// [Sun Apr 26 02:12:57 IST 2026] INFO: Thread Thread-2 got logger
// [Sun Apr 26 02:12:57 IST 2026] INFO: Thread Thread-1 got logger
// [Sun Apr 26 02:12:57 IST 2026] INFO: Main thread using logger  
// [Sun Apr 26 02:12:57 IST 2026] ERROR: This is an error
// [Sun Apr 26 02:12:57 IST 2026] DEBUG: Debugging information    

// === All Logs ===
// [Sun Apr 26 02:12:57 IST 2026] INFO: Thread Thread-2 got logger
// [Sun Apr 26 02:12:57 IST 2026] INFO: Thread Thread-3 got logger
// [Sun Apr 26 02:12:57 IST 2026] INFO: Thread Thread-1 got logger
// [Sun Apr 26 02:12:57 IST 2026] INFO: Main thread using logger
// [Sun Apr 26 02:12:57 IST 2026] ERROR: This is an error
// [Sun Apr 26 02:12:57 IST 2026] DEBUG: Debugging information

// It demonstrates that even in a multi-threaded environment, only one instance of Logger is created and shared among all threads, ensuring thread safety while maintaining lazy initialization. The double-checked locking mechanism ensures that the instance is created only when needed and that multiple threads do not create multiple instances simultaneously.
// It's thread-safe because of the use of double-checked locking and the volatile keyword, which ensures that multiple threads can safely access the getInstance() method without creating multiple instances of Logger. The first check avoids unnecessary synchronization once the instance is initialized, while the second check inside the synchronized block ensures that only one instance is created even if multiple threads reach that point at the same time.