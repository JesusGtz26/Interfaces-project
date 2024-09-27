
public class Cuadrado implements FigurasGeometricas{
	//propiedades
	private String nombre;
	private double lado;
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public Cuadrado(String nombre, double lado) {
		super();
		this.nombre = nombre;
		this.lado = lado;
	}
	
	public double calcularArea() {
		return Math.exp(lado);
	}//calcular area
	
	public double calcularPerimetro() {
		return (getLado()*4);
	}//calcular perimetro
	
	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	}
	
	
	
}
