package lambda_task2;

@FunctionalInterface
public interface OnTaskErrorListener {
	void onError(String result);
}
