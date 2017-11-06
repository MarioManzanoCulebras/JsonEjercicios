package es.hazerta.ejercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import es.hazerta.model.Alumno;

public class Ej4 {
	public static void main(String[] args) {
		Alumno alumnoNew = new Alumno("Ruben", "No Mires Mi pantalla", 99);
		alumnoNew.insertCalification("Criminologia", 0.3f);
		// Creamos y guardamos en un JSON
		Gson gson = new Gson();
		String alumnoNewGson = gson.toJson(alumnoNew);

		// Creamos los metodos para escribir
		File fichero = new File("ficherosDatos/datos.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(fichero, true);
			bw = new BufferedWriter(fw);
			bw.write(alumnoNewGson);
			bw.newLine();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Cerramos
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
