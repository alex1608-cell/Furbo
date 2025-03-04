package equipo.jugadores.portero;

import equipo.jugadores.Jugador;

public class Portero extends Jugador{

	private int paradas;
	
	public Portero(String nombre, int dorsal, String equipo) {
		super(nombre, dorsal, equipo);
		setParadas(paradas);
		
	}

	public int getParadas() {
		return paradas;
	}

	public void setParadas(int paradas) {
		this.paradas = paradas;
	}

	@Override
	public void monstrarDatos(String nombre, int dorsal, String equipo) {
		// TODO Auto-generated method stub
		
	}

	

}
