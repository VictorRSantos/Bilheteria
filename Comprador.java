public class Comprador extends Thread

{

	private Bilheteira b;

	private static boolean fim;

	public Comprador(Bilheteira b, String nome) {

		super(nome);

		this.b = b;

		fim = false;

	}

	public void run() {

		int valor = 0;

		while (!fim)

		{

			try {

				Thread.sleep((int) (Math.random() * 3000));

			}

			catch (InterruptedException e) {

				System.err.println("\n" + e.toString());

			}

			if (fim == false)

				valor = b.getBilhete();

			if (valor == 80)
				fim = true;

		}

		System.err.println("\n" + getName() +

		" Bilhetes comprados!!!");

	}

}