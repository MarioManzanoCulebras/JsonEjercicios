package es.hazerta.model;

import java.util.HashMap;

public class Alumno {
	String nombre;
	String apellidos;
	int curso;
	HashMap<String, Float> notas;
	
	public Alumno(String nombre, String apellidos, int curso) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curso = curso;
		this.notas = new HashMap<String, Float>();
	}


	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", curso=" + curso + ", notas=" + notas + "]";
	}



	public void insertCalification(String key, Float value) {
		notas.put(key,value);
	}
	
}
