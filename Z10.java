public class Z10 {
	
	static double first_factor = 0.0;
	static double second_factor = 0.0;
	
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable()
		{
			public void run() //Этот метод будет выполняться в побочном потоке
			{
				first_factor = 3 + 2;
			}
		});
		Thread thread2 = new Thread(new Runnable()
		{
			public void run() //Этот метод будет выполняться в побочном потоке
			{
				second_factor = 6 + 4;
			}
		});
		
		thread1.start();	//Запуск потока
		thread2.start();	//Запуск потока
		
		// Ожидание окончания потоков
		if (thread1.isAlive()) {
			try {
				thread1.join();
			} catch (InterruptedException e) {System.out.println(e);}
		}
		if (thread2.isAlive()) {
			try {
				thread2.join();
			} catch (InterruptedException e) {System.out.println(e);}
		}
		
		double result = first_factor * second_factor;
		System.out.println("Result of (3 + 2) * (6 + 4): " + result);
   }
}