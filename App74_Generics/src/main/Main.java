package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		
		/*
		 * Lesson 74 - Generics
		 * Generics - enable types (classes and interfaces) to be parameters when defining:
		 * 			  classes, interfaces and methods.
		 * 			  The purpose if this is eliminating the need to create multiple versions
		 * 			  of methods or classes for various data types.
		 * 			  Use one version for all reference data types.
		 */
		
		System.out.println("Lesson 74 - Generics");
		
		Generics<Integer, Integer> generics = new Generics<>(1, 2);
		
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.3, 2.7, 3.14, 4.64, 5.75 };
		Character[] charArray = {'v', 'e', 'r', 'g', 'i', 'l' };
		String[] stringArray = { "I'm", "the", "storm", "that is", "approching" };
		
		generics.displayArray(intArray);
		generics.displayArray(doubleArray);
		generics.displayArray(charArray);
		generics.displayArray(stringArray);
		
		System.out.println(generics.getFirst(intArray));
		System.out.println(generics.getFirst(doubleArray));
		System.out.println(generics.getFirst(charArray));
		System.out.println(generics.getFirst(stringArray));
		
		Generics<Integer, Integer> genInt = new Generics<>(9, 7);
		Generics<Double, Double> genDouble = new Generics<>(9.4, 7.3);
		
		// Due to adding 'T1 extends Number' it's no longer possible to pass
		// parameters that aren't subclasses of the class 'Number'
		
//		Generics<Character, Character> genChar = new Generics<>('a', 'b');
//		Generics<String, String> genString = new Generics<>("Bob", "Budowniczy");
				
		System.out.println(genInt.getValue());
		System.out.println(genDouble.getValue());
//		System.out.println(genChar.getValue());
//		System.out.println(genString.getValue());
		
		/*
		 * Bounded types - you can create the object of generic class to have data
		 * 				   to have data of specific derived types, ex. Number (look above)
		 */
		
		
		/*
		 * Lesson 75 - Serialization
		 * Serialization - the process of converting an object into a byte stream.
		 * 				   Persists (saves the state) of the object after program exits.
		 * 				   This byte stream can by saved as a file or send over the network.
		 * 				   Can be sent to the different machine.
		 * 				   Byte stream can be saved as a file (.ser) which is platform independent
		 * 				   This of it as you're saving a file with the object information
		 * 
		 * Deserialization - a reverse process of converting a byte stream into an object.
		 * 					 Think of it as you're loading a saved file.
		 */
		
		System.out.println("\nLesson 75 - Serialization");
		
		User user1 = new User();
		user1.name = "Zbigniew";
		user1.password = "123456";
		user1.sayHello();
		
		/*
		 * Steps to serialize
		 * --------------------------------------------------------------------
		 * 1. Your object class should implement Serializable interface
		 * 2. Add import java.io.Serializable
		 * 3. FileOutputStream fileOut = new FileOutputStream(file path)
		 * 4. ObjectOutputStream objectOut = new ObjectOutputStream(filrOut)
		 * 5. objectOut.writeObject(objectName)
		 * 6. objectOut.close()
		 * 7. fileOut.close()
		 * --------------------------------------------------------------------
		 */
		
		FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
		ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
		objectOut.writeObject(user1);
		objectOut.close();
		fileOut.close();
		
		System.out.println("Object info saved");
		
		/*
		 * Steps do deserialize
		 * -----------------------------------------------------------------------
		 * 1. Declare object (don't instantiate)
		 * 2. Your object class should implement Serializable interface
		 * 3. Add import java.io.Serializable
		 * 4. FileInputStream fileIn = new FileInputStream(filePath)
		 * 5. ObjectInputStream objectIn = new ObjectInputStream(fileIn)
		 * 6. objectNam = (Class) objectIn.readObject()
		 * 7. objectIn.close()
		 * 8. fileIn.close()
		 * -----------------------------------------------------------------------
		 */
		
		User user2 = null;
		FileInputStream fileIn = new FileInputStream("D:\\2. Nauka\\GitHubRepositories\\Java-Course\\App74_Generics\\UserInfo.ser");
		ObjectInputStream objectIn = new ObjectInputStream(fileIn);
		user2 = (User) objectIn.readObject();
		objectIn.close();
		fileIn.close();
		
		System.out.println("\nDeserialized obecjt");
		System.out.println(user2.name);
		System.out.println(user2.password);
		user2.sayHello();
		
		
		/*
		 * Lesson 76 - Timer Task
		 * Timer - A facility for threads to schedule tasks 
		 * 		   for future execution in a background thread
		 * TimeTask - A task that can be scheduled for one-time
		 * 			  or repeated execution by a Timer
		 */
		
		System.out.println("Lesson 76 - TimerTask");
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {

			int counter = 10;
			
			@Override
			public void run() {
				if(counter > 0) {
					System.out.println(counter);
					counter--;
				}
				else {
					System.out.println("Happy New Year");
					timer.cancel();	
				}					
			}			
		};
		
//		timer.schedule(task, 3000);
		
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2024);
		date.set(Calendar.MONTH, Calendar.OCTOBER);
		date.set(Calendar.DAY_OF_MONTH, 21);
		date.set(Calendar.HOUR_OF_DAY, 19);
		date.set(Calendar.MINUTE, 29);
		date.set(Calendar.SECOND, 0);
		date.set(Calendar.MILLISECOND, 0);
		
//		timer.schedule(task, date.getTime());
		
//		timer.scheduleAtFixedRate(task, 0, 1000);
		
		
		/*
		 * Lesson 77 - Threads
		 * Thread - A thread of execution in program (kind of like virtual CPU).
		 * 			The JVM allows application to have multiple threads running concurrently.
		 * 			Each thread can execute parts of the code in the parallel with main thread.
		 * 			Each thread has a priority.
		 * 			Threads with higher priority are executed in preference compared to threads with lower priority
		 *			
		 *			The JVM continues to execute threads until either of the following occurs:
		 *				1. The exit method of class Runtime has been called 
		 *				2. All user threads have died
		 *
		 *			When a JVm starts up, there is the thread which calls the main method.
		 *			This thread is called 'main'.
		 *
		 *			Daemon thread is a low priority thread that runs in the background.
		 *			Performs tasks such as garbage collection.
		 *			JVM terminates itself when all user's threads (non-daemon threads) are finished.
		 */
		
		System.out.println("\nLesson 77 - Threads");
		
		System.out.println(Thread.activeCount());
//		Thread.currentThread().setName("Primary Thread");
		System.out.println(Thread.currentThread().getName());
		// Priorities: 1-10, greater number -> higher priority
//		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().isAlive());
		
//		for(int i = 1; i <= 3; i++) {
//			System.out.println(i);
//			Thread.sleep(1000);
//		}
//		System.out.println("Fire at f****** will!");

		MyThread myThread = new MyThread();
//		myThread.run();	// Executes 'run' funtion but isn't alive
		myThread.start();
		System.out.println("MyThread status: " + myThread.isAlive());
		// Default priority is 5
		// Threads inherit parent thread's priority
		System.out.println("MyThread priority: " + myThread.getPriority());
		myThread.setDaemon(false);
		System.out.println("MyThread is daemon: " + myThread.isDaemon());
		
	}

}
