package equipo.jugadores.delanteros;

public class Extremo extends Delantero {
	private PuestoExtremo puesto;

	public Extremo(String nombre, int dorsal, String equipo, int goles, PuestoExtremo puesto) {
		super(nombre, dorsal, equipo, goles);
		this.setPuesto(puesto);
	}

	public PuestoExtremo getPuesto() {
		return puesto;
	}

	public void setPuesto(PuestoExtremo puesto) {
		this.puesto = puesto;
	}

	
	


	@Override
	public String toString() {
		return "Extremo [Puesto=" + this.puesto + ", Goles=" + this.getGoles() + ", Nombre=" + this.getNombre()
				+ ", Dorsal=" + this.getDorsal() + ", Equipo=" + this.getEquipo() + "]";
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}
}
