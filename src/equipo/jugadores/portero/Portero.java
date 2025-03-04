package equipo.jugadores.portero;

import equipo.jugadores.Jugador;

public class Portero extends Jugador {

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
	public String toString() {
		return "Portero [Paradas=" + this.paradas + ", Nombre=" + this.getNombre() + ", Dorsal=" + this.getDorsal()
				+ ", Equipo=" + this.getEquipo() + "]";
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}

}
