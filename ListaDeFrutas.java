package Primeiro_ArrayList;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ListaDeFrutas {

	public static void main(String[] args) {
		List<String> listaFrutas = new ArrayList<String>();
		String s = "uva";
		listaFrutas.add("melancia");
		listaFrutas.add(s);
		listaFrutas.add("caju");
		
		//imprimir..
		String saida = "";
		saida += "Frutas da Lista: " + listaFrutas.toString();
		saida += "\nTotal de Frutas na Lista: " + listaFrutas.size();
		saida += "\nA Lista Possui Pera? " + listaFrutas.contains("pera");
		saida += "\nA Lista Possui Caju? " + listaFrutas.contains("caju");
		
		listaFrutas.remove("uva");
		saida += "\nTotal de Frutas na Lista após Remover a Uva: " + listaFrutas.size();
		saida += "\nFrutas da Lista após Remover a Uva: " + listaFrutas.toString();
		saida += "\nIndice da fruta caju na Lista: " + listaFrutas.indexOf("caju");
		
		//System.out.println(saida);
		JTextArea saidaArea = new JTextArea();
		saidaArea.setText(saida);
		
		JOptionPane.showMessageDialog(null, saidaArea,
				"Trabalhando com ArrayList", 
				JOptionPane.INFORMATION_MESSAGE);

	}

}
