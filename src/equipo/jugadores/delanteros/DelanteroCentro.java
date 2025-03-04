package equipo.jugadores.delanteros;

public class DelanteroCentro extends Delantero {
	private int golesDePenalti;

	public DelanteroCentro(String nombre, int dorsal, String equipo, int goles, int golesDePenalti) {
		super(nombre, dorsal, equipo, goles);
		this.setGolesDePenalti(golesDePenalti);
	}

	public int getGolesDePenalti() {
		return golesDePenalti;
	}

	public void setGolesDePenalti(int golesDePenalti) {
		this.golesDePenalti = golesDePenalti;
	}

	

	@Override
	public String toString() {
		return "Delantero Centro [golesDePenalti=" + this.golesDePenalti + ", Goles=" + this.getGoles() + ", Nombre="
				+ this.getNombre() + ", Dorsal=" + this.getDorsal() + ", Equipo=" + this.getEquipo() + "]";
	}

	public void mostrarDatos() {
		System.out.println(this.toString());
	}

}
