package com.facuws.alumno;

public class Alumno {
	
	private int legajo;
	private String apellido;
	private String nombre;
	private String carrera;
	private int cantMaterias;
	
	public Alumno(){}
	
	public Alumno(int leg, String ape, String nom, String car, int can){
		legajo = leg;
		apellido = ape;
		nombre = nom;
		carrera = car;
		cantMaterias = can;
	}
	
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public int getCantMaterias() {
		return cantMaterias;
	}
	public void setCantMaterias(int cantMaterias) {
		this.cantMaterias = cantMaterias;
	}
	
	
	
}
