package equipo.jugadores.delanteros;

import equipo.jugadores.Jugador;

public class Delantero extends Jugador {
	private int goles;

	public Delantero(String nombre, int dorsal, String equipo, int goles) {
		super(nombre, dorsal, equipo);
		this.setGoles(goles);
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}
}
