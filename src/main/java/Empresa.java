import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	private ArrayList<Proyecto> proyectos = new ArrayList<Proyecto>();

	public ArrayList getListaEmpleados() {
		return this.empleados;
	}

	public void setListaEmpleados(ArrayList listaEmpleados) {
		this.empleados = listaEmpleados;
	}

	public ArrayList getListaProyectos() {
		return this.proyectos;
	}

	public void setListaProyectos(ArrayList listaProyectos) {
		this.proyectos = listaProyectos;
	}

	public void agregarEmpleado() {
		int i = 1;
		while(i==1){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Ingrese el nombre del empleado que desea contratar: ");
			String nombre = teclado.next();
			System.out.println("Ingrese el sueldo del empleado que desea contratar: ");
			int sueldo = teclado.nextInt();
			System.out.println("Ingrese el cargo del empleado que desea contratar: ");
			String cargo = teclado.next();
			Empleado empleado = new Empleado(nombre,sueldo,cargo);
			empleados.add(empleado);
			System.out.println("¿Desea continuar? \n 1) Si \n 2)No");
			i = teclado.nextInt();
		}
	}

	public void agregarProyecto() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el nombre del nuevo proyecto: ");
		String nombre = teclado.next();
		System.out.println("Ingrese la descripción del nuevo proyecto: ");
		String descripcion = teclado.next();
		Proyecto proyecto = new Proyecto(nombre,descripcion);
		proyectos.add(proyecto);
	}

	public void asignarEmpleado() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el nombre del proyecto al que desea asignar un empleado: ");
		String nombreProyecto = teclado.next();
		System.out.println("Ingrese el nombre del empleado que desea asignar al proyecto: ");
		String nombreEmpleado = teclado.next();
		Proyecto proyecto = buscarProyecto(nombreProyecto);
		Empleado empleado = buscarEmpleado(nombreEmpleado);
		proyecto.getListaEmpleados().add(empleado);
	}

	public Proyecto buscarProyecto(String nombreProyecto){
		for(Proyecto proyecto : proyectos){
			if(proyecto.getNombre().equals(nombreProyecto)){
				return proyecto;
			}
			else{
				System.out.println("El empleado no existe.");
			}
		}
		return null;
	}

	public Empleado buscarEmpleado(String nombreEmpleado){
		for(Empleado empleado : empleados){
			if(empleado.getNombre().equals(nombreEmpleado)){
				return empleado;
			}
			else {
				System.out.println("El proyecto no existe");
			}
		}
		return null;
	}

	public int calcularTotalSalario() {
		int salarioTotal = 0;
		for(Empleado empleado : empleados){
			salarioTotal += empleado.getSalario();
		}
		return salarioTotal;
	}
}