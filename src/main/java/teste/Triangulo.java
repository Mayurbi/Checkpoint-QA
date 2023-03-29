package teste;

public class Triangulo {
    private int ladoA, ladoB, ladoC;

    public Triangulo(int a, int b, int c) {
        ladoA = a;
        ladoB = b;
        ladoC = c;
    }

    public Triangulo() {
	
	}

	public String definirTipo() {
        if (ladoA == ladoB && ladoB == ladoC) {
            return "equilátero";
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            return "isósceles";
        } else {
            return "escaleno";
        }
    }

	public String test(int valor1, int valor2, int valor3) {
		return null;
	}
}
