package com.personaws;

public class Persona {

    private Long id;
    private String nombre;
    private String direccion;
    private int edad;
    private boolean sexo;
    
    public Persona() {
    }

    public Persona(long id, String nombre, String direccion, int edad, boolean sexo) {
        this.id = id;
    	this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	
}