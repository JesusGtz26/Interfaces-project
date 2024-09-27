
public class Main {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo("Bermudas", 20, 10, 15);
		Triangulo t = new Triangulo("T", 87, 121, 110);
		
		Cuadrado c = new Cuadrado("Cuadrado", 4);
		
		Rectangulo r =new Rectangulo("Rectangulo", 12, 10);
		
		Rombo rombo = new Rombo("Rombo", 10, 12, 15);
		
		Romboide romboi = new Romboide("Romboide", 12, 8);
		
		Trapecio trap = new Trapecio("Trapecio", 8, 12, 5, 6, 7, 8, 9);
		
		imprimirCalculo(t1);
		imprimirCalculo(t);
		
		imprimirCalculo(c);
		imprimirCalculo(r);
		imprimirCalculo(rombo);
		imprimirCalculo(romboi);
		imprimirCalculo(trap);

	}
	
	public static void imprimirCalculo(FigurasGeometricas t) {
		System.out.println(t);
		System.out.println("+-------------------------");
		System.out.println("El area de ["+ t.getNombre()
				+ "] es: "+ t.calcularArea());
		System.out.println("El perimetro de ["+t.getNombre()
				+ "] es: "+ t.calcularPerimetro());
		System.out.println("+-------------------------");
	}

}
