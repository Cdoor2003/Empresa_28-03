import java.util.ArrayList;

public class GerenteProyecto extends Empleado {
	private ArrayList proyectos;

	public GerenteProyecto(String nombre, int salario, String cargo) {
		super(nombre, salario, cargo);
		this.proyectos = new ArrayList<>();
	}

	public ArrayList getProyectos() {
		return this.proyectos;
	}

	public void setProyectos(ArrayList proyectos) {
		this.proyectos = proyectos;
	}
}