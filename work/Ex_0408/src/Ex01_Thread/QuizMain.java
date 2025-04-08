package Ex01_Thread;

public class QuizMain {
	public static void main(String[] args) {
		QuizThread quiz = new QuizThread();
		
		quiz.start();
		quiz.startGame();
		
	}
}
