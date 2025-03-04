package equipo.jugadores;

public class Jugador {
	private String nombre;
	private int dorsal;
	private String equipo;

	public Jugador(String nombre, int dorsal, String equipo) {
		this.setNombre(nombre);
		this.setDorsal(dorsal);
		this.setEquipo(equipo);
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
<<<<<<< Updated upstream
=======

	public abstract void monstrarDatos(String nombre, int dorsal, String equipo);

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", dorsal=" + dorsal + ", equipo=" + equipo + "]";
	}
	
	
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
}
