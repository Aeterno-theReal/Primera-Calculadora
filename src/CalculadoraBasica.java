import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hacemos la prueba de entrada por teclado
		
		//Declaramos la variable para la entrada por teclado
		Scanner teclado= new Scanner(System.in);
		
		float numero1 = -1;
		float numero2 = -1;
		float resultado = -1;
		String operacion = "";
		String igual = "=";
		
		System.out.println("Programa \"Calculadora\"");
		
		System.out.println("Vamos a realizar una operaci�n matem�tica.");
		
		//Pedimos los n�meros y el tipo de operaci�n al usuario
		//Pedimos el numerador
		System.out.println("Introduzca el numerador: ");
		numero1 = teclado.nextFloat();
		teclado.nextLine();
		
		//Pedimos el operador
		System.out.println("Introduzca el operador: ");
		operacion = teclado.nextLine();

		//Pedimos el denominador
		System.out.println("Introduzca el denominador: ");
		numero2 = teclado.nextFloat();
		teclado.nextLine();
		
		System.out.println("Introduzca el igual (=) para realizar la operaci�n:");
		
		igual = teclado.nextLine();
		
		if(igual.equals("="))
		{
			//Realizamos la operaci�n dependiendo del operador que elijamos
			if(operacion.equals("+")) //Cuando el operador es una suma
			{
				resultado = numero1+numero2;
				System.out.println("El resultado de la suma es: " + resultado);
			}
			else 
			{
				if (operacion.equals("-")) //Cuando el operador es una resta
				{
					resultado = numero1-numero2;
					System.out.println("El resultado de la resta es: " + resultado);
				}
				else
				{
					if (operacion.equals("*")) //Cuando el operador es una multiplicaci�n
					{
						resultado = numero1*numero2;
						System.out.println("El resultado de la multiplicaci�n es: " + resultado);
					}
					else
					{
						if (operacion.equals("/")) //Cuando el operador es una divisi�n
						{
							//Realizamos la validaci�n del divisor que sea distinto a cero.
							if(numero2!=0) //comprobamos que el numero2 sea distinto a 0
							{
								resultado = numero1/numero2;
								System.out.println("El resultado de la divisi�n es: " + resultado);
								System.out.println("El m�dulo es: " + numero1%numero2);
								//El m�dulo  muestra el resto de la divisi�n
							}
							else
							{
								System.out.println("Error: no se puede dividir por 0");
								System.out.println("Error: no se puede dividir por " + numero2 + ", so burro");
							}
						}
						else
						{
							System.out.println("El operador que has introducido no es v�lido");
						}
					}
				}
			}
		}
		else
		{
			System.out.println("El s�mbolo igual no es correcto");
		}
		
	}

}
