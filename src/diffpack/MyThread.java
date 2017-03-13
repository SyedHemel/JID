package diffpack;

// Defining a thread
public class MyThread extends Thread{
	// The following no-arg 'run' method is overriding and will be called by start method, any other overloaded 'run' method will not be called
	public void run(){
		// JOB of the thread (code inside the overridden 'run' method)
		for (int i=0; i<10; i++){
			System.out.println("Child thread!");
		}
	}
	
}

/** To define the job, we need to override 'run' method.
 * If we are nor overriding the run method, then Thread class run method will be executed
 * which has empty implementation, hence we will not get any output
 * 
 * 
 */
