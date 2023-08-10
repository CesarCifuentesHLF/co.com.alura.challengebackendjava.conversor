package co.com.alura.ChallengeBackEndJava.Controlador;

import javax.swing.JOptionPane;

import co.com.alura.ChallengeBackEndJava.Modelo.dataConversor;

public class Conversor {
	
	public String TipoMoneda(String Tipo) {
		
		String TipConv = null;
		
		dataConversor ValorConv = new dataConversor();
		
		switch(Tipo) {
		
		case "USD – Dólar estadounidense":
			
			TipConv = String.valueOf(ValorConv.getUSD());
			
			break;
			
		case "GBP – Libra esterlina":
			
			TipConv = String.valueOf(ValorConv.getGBP());
			
		case "EUR – Euro":
			
			TipConv = String.valueOf(ValorConv.getEUR());
			
			break;
			
		case "JPY – Yen japonés":
			
			TipConv = String.valueOf(ValorConv.getJPY());
			
			break;
			
		case "COP – Peso colombiano":
			
			TipConv = String.valueOf(ValorConv.getCOP());
			
			break;
			
		case "KRW – Won surcoreano":
			
			TipConv = String.valueOf(ValorConv.getKRW());
			
			break;
		case "Centimetros":
			
			TipConv = String.valueOf(ValorConv.getCms());
			
			break;
		case "Pulgadas":
	
			TipConv = String.valueOf(ValorConv.getPul());
			
			break;
		case "Pies":
	
			TipConv = String.valueOf(ValorConv.getPie());
			
			break;

		} 
		
		return TipConv;
		
	}
	
	public void ConvertirMoneda(double Importe, double de, double a, String SA) {
		
		double ValorConv = Math.round(( de / a ) * Importe);
		JOptionPane.showMessageDialog(null, "la cantidad en " + SA + " es de: " + ValorConv);
	}
		
}
