package telran.selfPracticeFiles;

public class RaceConditionExample {
	public static void main(String[] args) {
		ExampleClassForFun counter = new ExampleClassForFun();
		Runnable task = () -> {
			for(int i = 0; i < 1000; i++) {
				counter.increment();
			}
		};
	
		 Thread thread1 = new Thread(task);
		 Thread thread2 = new Thread(task);
	
		 thread1.start();
		 thread2.start();
		 
		 
		 try {
			 thread1.join();
			 thread2.join();
		 } catch (InterruptedException e) {
			 e.printStackTrace();
		 }
		 System.out.println("Final count: " + counter.getCount());
	}
}
