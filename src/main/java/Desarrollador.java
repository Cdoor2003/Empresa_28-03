import java.util.ArrayList;

public class Desarrollador extends Empleado {
	private ArrayList lenguajeProgramacion;

	public Desarrollador(String nombre, int salario, String cargo) {
		super(nombre, salario, cargo);
		this.lenguajeProgramacion = new ArrayList<>();
	}

	public ArrayList getLenguajeProgramacion() {
		return this.lenguajeProgramacion;
	}

	public void setLenguajeProgramacion(ArrayList lenguajeProgramacion) {
		this.lenguajeProgramacion = lenguajeProgramacion;
	}
}