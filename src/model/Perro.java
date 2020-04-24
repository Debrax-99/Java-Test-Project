package model;

public class Perro {

	//ATTRIBUTES:
	private String nombre;
	private String raza;
	private int edad;
	private String sexo;
	private String colorPelo;
	private int peso;
	private int anioVacuna;

	//CONSTRUCTOR FROM SUPERCLASS:
	public Perro() {
		super();
	}
	
	//CONSTRUCTOR WITH PARAMETHERS:
	public Perro (String nombre, String raza, int edad, String sexo, String colorPelo, int peso, int anioVacuna) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.sexo = sexo;
		this.colorPelo = colorPelo;
		this.peso = peso;
		this.anioVacuna = anioVacuna;
		
	}

	//GETTER & SETTER:
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getAnioVacuna() {
		return anioVacuna;
	}

	public void setAnioVacuna(int anioVacuna) {
		this.anioVacuna = anioVacuna;
	}

	//TOSTRING:
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", sexo=" + sexo + ", colorPelo="
				+ colorPelo + ", peso=" + peso + "]";
	}
	
		
}
