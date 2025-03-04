package equipo.jugadores;

public class Jugador {

	private String nombre;
	private int dorsal;
	private String equipo;
	
	public Jugador(String nombre, int dorsal, String equipo) {
		
		this.dorsal = dorsal;
		this.equipo = equipo;
		this.nombre = nombre;
		
		
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
	
}
