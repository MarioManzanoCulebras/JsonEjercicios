package es.hazerta.ejercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import es.hazerta.model.Alumno;

public class Ej2 {
	public static void main(String[] args) {
		//Creamos los dos alumnos de prueba
		Alumno alumno1 = new Alumno("Mario", "Manzano Culebras", 1);
		alumno1.insertCalification("Defensa Contra las Artes Oscuras", 9.8f);
		alumno1.insertCalification("Matematicas", 10f);
		Alumno alumno2 = new Alumno("Jose", "Sánchez Corrales", 3);
		alumno2.insertCalification("Botanica", 2.34f);
		
		
		//Creamos y guardamos en un JSON
		Gson gson = new Gson();
		String alumno1Gson = gson.toJson(alumno1);
		String alumno2Gson = gson.toJson(alumno2);
		
		//Creamos los metodos para escribir
		File fichero = new File("ficherosDatos/datos.txt");
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			fw = new FileWriter(fichero);
			bw = new BufferedWriter(fw);
			bw.write(alumno1Gson);
			bw.newLine();
			bw.write(alumno2Gson);
			bw.newLine();		
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//Cerramos
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
