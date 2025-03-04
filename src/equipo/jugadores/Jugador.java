package equipo.jugadores;

public class Jugador {
<<<<<<< Updated upstream
	String nombre;
	int dorsal;
	String equipo;
=======
	private String nombre;
	private int dorsal;
	private String equipo;

	public Jugador(String nombre, int dorsal, String equipo) {
		this.setNombre(nombre);
		this.setDorsal(dorsal);
		this.setEquipo(equipo);
		;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

>>>>>>> Stashed changes
}
