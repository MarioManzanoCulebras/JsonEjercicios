package es.hazerta.ejercicios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import es.hazerta.model.Alumno;

public class Ej5 {
	public static void main(String[] args) {
		File fichero = new File("ficherosDatos/datos.txt");
		if (fichero.exists()) {
			BufferedReader br=null;
			try {
				br = new BufferedReader(new FileReader(fichero));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String linea;
			Gson gson = new Gson();
			try {
				while ((linea = br.readLine()) != null) {
					Alumno alumnoRead = gson.fromJson(linea, Alumno.class);
					System.out.println(alumnoRead);
				}
			} catch (JsonSyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
	}
}
