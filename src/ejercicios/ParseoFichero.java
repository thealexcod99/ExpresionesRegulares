package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParseoFichero {

	public static void main(String[] args) throws FileNotFoundException {
		List<String> nombresEmpiezanPorA = new ArrayList<>();
		List<String> nombresNoAcabanPorVocal = new ArrayList<>();
		
		File inputFile = new File("Ficheros/nombres_mujer.txt");
		Scanner sc = new Scanner(inputFile);
		int contador = 0;
		String linea;
		int palabraMayor = 0;
		while (sc.hasNextLine()) {
			linea = sc.nextLine();
			contador++;
			if (linea.matches("^[AaÁá].*$"))
				nombresEmpiezanPorA.add(linea);
			
			if (linea.matches("^.*[^AaÁáEeÉéIiÍíOoÓóUuÚúÜü]$"))
				nombresNoAcabanPorVocal.add(linea);
			
			if (linea.length() > palabraMayor)
				palabraMayor = linea.length();
		}
		sc.close();
		System.out.println("Líneas leídas totales: " + contador);
		System.out.println(nombresEmpiezanPorA);
		System.out.println(nombresNoAcabanPorVocal);
		
		
		
		
	
	}

}
