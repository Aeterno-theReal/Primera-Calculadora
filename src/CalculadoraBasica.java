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
		
		System.out.println("Vamos a realizar una operación matemática.");
		
		//Pedimos los números y el tipo de operación al usuario
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
		
		System.out.println("Introduzca el igual (=) para realizar la operación:");
		
		igual = teclado.nextLine();
		
		if(igual.equals("="))
		{
			//Realizamos la operación dependiendo del operador que elijamos
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
					if (operacion.equals("*")) //Cuando el operador es una multiplicación
					{
						resultado = numero1*numero2;
						System.out.println("El resultado de la multiplicación es: " + resultado);
					}
					else
					{
						if (operacion.equals("/")) //Cuando el operador es una división
						{
							//Realizamos la validación del divisor que sea distinto a cero.
							if(numero2!=0) //comprobamos que el numero2 sea distinto a 0
							{
								resultado = numero1/numero2;
								System.out.println("El resultado de la división es: " + resultado);
								System.out.println("El módulo es: " + numero1%numero2);
								//El módulo  muestra el resto de la división
							}
							else
							{
								System.out.println("Error: no se puede dividir por 0");
								System.out.println("Error: no se puede dividir por " + numero2 + ", so burro");
							}
						}
						else
						{
							System.out.println("El operador que has introducido no es válido");
						}
					}
				}
			}
		}
		else
		{
			System.out.println("El símbolo igual no es correcto");
		}
		
	}

}
