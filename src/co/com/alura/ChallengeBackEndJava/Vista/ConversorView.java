package co.com.alura.ChallengeBackEndJava.Vista;

import javax.swing.JOptionPane;

import co.com.alura.ChallengeBackEndJava.Controlador.Conversor;

public class ConversorView {
	
	public static void main(String[] args) {
		
		Conversor Moneda = new Conversor();
		
		boolean finalizar = false;
		
		while(!finalizar){
			
			String opciones = ( JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion: ", "Menu", 
					JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor Moneda", "Conversor Metrico"}, "Seleccion")).toString();
			
			switch(opciones) {
			
			case "Conversor Moneda":
				
				String de = ( JOptionPane.showInputDialog(null, "Seleccione un tipo de moneda a convertir: ", "Menu", 
						JOptionPane.QUESTION_MESSAGE, null, new Object[] {"USD – Dólar estadounidense", "GBP – Libra esterlina", "EUR – Euro"
								, "JPY – Yen japonés", "COP – Peso colombiano", "KRW – Won surcoreano"}, "Seleccion")).toString();
				
				double Valorde = Double.parseDouble(Moneda.TipoMoneda(de));
				
				String Importe = JOptionPane.showInputDialog("Ingresa el valor a convertir: ");
				
				String a = ( JOptionPane.showInputDialog(null, "Seleccione un tipo de moneda a convertir: ", "Menu", 
						JOptionPane.QUESTION_MESSAGE, null, new Object[] {"USD – Dólar estadounidense", "GBP – Libra esterlina", "EUR – Euro"
								, "JPY – Yen japonés", "COP – Peso colombiano", "KRW – Won surcoreano"}, "Seleccion")).toString();
				
				double ValorA = Double.parseDouble(Moneda.TipoMoneda(a));
				
				Moneda.ConvertirMoneda(Double.parseDouble(Importe), Valorde, ValorA, a);
				
				break;
				
			case "Conversor Metrico":
				
				String deLong = ( JOptionPane.showInputDialog(null, "Seleccione un tipo de longitud a convertir: ", "Menu", 
						JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Centimetros", "Pulgadas", "Pies"
								}, "Seleccion")).toString();
				
				double ValordeLong = Double.parseDouble(Moneda.TipoMoneda(deLong));
				
				String ImporteLong = JOptionPane.showInputDialog("Ingresa el valor a convertir: ");
				
				String aLong = ( JOptionPane.showInputDialog(null, "Seleccione un tipo de moneda a convertir: ", "Menu", 
						JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Centimetros", "Pulgadas", "Pies"}, "Seleccion")).toString();
				
				double ValorALong = Double.parseDouble(Moneda.TipoMoneda(aLong));
				
				Moneda.ConvertirMoneda(Double.parseDouble(ImporteLong), ValordeLong, ValorALong, aLong);
				
				break;
				
			}
		}
		
	}
	
}

