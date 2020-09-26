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
		while(thread1.isAlive() || thread2.isAlive());
		
		double result = first_factor * second_factor;
		System.out.println("Result of (3 + 2) * (6 + 4): " + result);
   }
}