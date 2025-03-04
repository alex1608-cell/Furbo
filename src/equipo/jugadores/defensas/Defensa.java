package equipo.jugadores.defensas;

import equipo.jugadores.Jugador;

public abstract class Defensa extends Jugador {

	private int disputasRealizadas;
	
	public Defensa(String nombre, int dorsal, String equipo, int disputasRealizadas) {
		super(nombre, dorsal, equipo);
		setDisputasRealizadas(disputasRealizadas);
		
	}

	public int getDisputasRealizadas() {
		return disputasRealizadas;
	}

	public void setDisputasRealizadas(int disputasRealizadas) {
		this.disputasRealizadas = disputasRealizadas;
	}

}
