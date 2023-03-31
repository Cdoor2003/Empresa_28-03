import java.util.ArrayList;

public class Diseñador extends Empleado {
	private ArrayList herramientas;

	public Diseñador(String nombre, int salario, String cargo) {
		super(nombre, salario, cargo);
		this.herramientas = new ArrayList<>();
	}

	public ArrayList getHerramientas() {
		return this.herramientas;
	}

	public void setHerramientas(ArrayList herramientas) {
		this.herramientas = herramientas;
	}

}