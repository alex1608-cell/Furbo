package equipo.jugadores.centrocampistas;

public class Mediapunta extends Centrocampista {
	private int asistencias;

	public Mediapunta(String nombre, int dorsal, String equipo, int pasesCompletados, int asistencias) {
		super(nombre, dorsal, equipo, pasesCompletados);
		this.setAsistencias(asistencias);
	}

	public int getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(int asistencias) {
		this.asistencias = asistencias;
	}
	
	@Override
	public String toString() {
		return "Mediapunta [Asistencias=" + this.asistencias + ", Pases Completados=" + this.getPasesCompletados()
				+ ", Nombre=" + this.getNombre() + ", Dorsal=" + this.getDorsal() + ", Equipo=" + this.getEquipo()
				+ "]";
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());

	}
}
