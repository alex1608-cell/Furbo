package equipo.jugadores.defensas;

public class Central extends Defensa {

	private int entradas;

	public Central(String nombre, int dorsal, String equipo, int disputasRealizadas, int entradas) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		setEntradas(entradas);

	}

	public void setEntradas(int entradas) {
		this.entradas = entradas;
	}

	public int getEntradas() {
		return entradas;
	}



	@Override
	public String toString() {
		return "Central [Entradas=" + this.entradas + ", Disputas Realizadas=" + this.getDisputasRealizadas()
				+ ", Nombre()=" + this.getNombre() + ", Dorsal=" + this.getDorsal() + ", Equipo=" + this.getEquipo()
				+ "]";
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}

}
