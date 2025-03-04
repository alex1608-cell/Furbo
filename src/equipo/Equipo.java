package equipo;

import java.util.List;

import equipo.jugadores.Jugador;

public class Equipo {

	private List<Jugador> jugadores; // hay que ponerlo array

	public Equipo(List<Jugador> jugadores) {
		setJugadores(jugadores);
	}
	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public void añadirJugador(Jugador j) {
		if(j == null) {
			throw new IllegalArgumentException("El jugador no puede ser nulo");
		}
		jugadores.add(j);
		for(Jugador ju : jugadores) {
			if(j == jugadores) {
				this.jugadores = j;
			}
		}
	}
	
}


