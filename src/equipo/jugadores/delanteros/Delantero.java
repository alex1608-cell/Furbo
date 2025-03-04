package equipo.jugadores.delanteros;

import equipo.jugadores.Jugador;

public abstract class Delantero extends Jugador {
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


	
	
	@Override
	public String toString() {
		return "Delantero [Goles=" + this.goles + ", Nombre=" + this.getNombre() + ", Dorsal=" + this.getDorsal()
				+ ", Equipo=" + this.getEquipo() + "]";
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}
	
}
