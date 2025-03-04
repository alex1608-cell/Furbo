package equipo.jugadores.centrocampistas;

public class Mediapunta extends Centrocampista {
	private int asistencias;

	public Mediapunta(String nombre, int dorsal, String equipo, int pasesCompletados,  int asistencias) {
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
	public void monstrarDatos() {
		// TODO Auto-generated method stub
		
	}
}
