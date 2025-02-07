package pruebaColecciones;

class Paciente {
	int codigo;
	String nombre;
	int edad;
	double temperatura;
	double colesterol;

	public Paciente(int codigo, String nombre, int edad, double temperatura, double colesterol) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.edad = edad;
		this.temperatura = temperatura;
		this.colesterol = colesterol;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getColesterol() {
		return colesterol;
	}

	public void setColesterol(double colesterol) {
		this.colesterol = colesterol;
	}
}
