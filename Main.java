package lambda_task2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnTaskDoneListener listener = System.out::println;
		OnTaskErrorListener errorListener = System.out::println;
		Worker worker = new Worker(listener, errorListener);
		worker.start();
	}

}
