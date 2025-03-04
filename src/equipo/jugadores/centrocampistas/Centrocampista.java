package equipo.jugadores.centrocampistas;

import equipo.jugadores.Jugador;

public abstract class Centrocampista extends Jugador {
	private int pasesCompletados;

	public Centrocampista(String nombre, int dorsal, String equipo, int pasesCompletados) {
		super(nombre, dorsal, equipo);
		this.setPasesCompletados(pasesCompletados);

	}

	public int getPasesCompletados() {
		return pasesCompletados;
	}

	public void setPasesCompletados(int pasesCompletados) {
		this.pasesCompletados = pasesCompletados;
	}

	

	@Override
	public String toString() {
		return "Centrocampista [Pases Completados=" + this.pasesCompletados + ", Nombre=" + this.getNombre()
				+ ", Dorsal=" + this.getDorsal() + ", Equipo=" + this.getEquipo() + "]";
	}

	public void mostrarDatos() {
		System.out.println(this.toString());

	}

}
