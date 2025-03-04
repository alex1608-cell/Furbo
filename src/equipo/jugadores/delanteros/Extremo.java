package equipo.jugadores.delanteros;

public class Extremo extends Delantero {
	private PuestoExtremo puesto;

	public Extremo(String nombre, int dorsal, String equipo, int goles, PuestoExtremo puesto) {
		super(nombre, dorsal, equipo, goles);
		this.setPuesto(puesto);
	}

	public PuestoExtremo getPuesto() {
		return puesto;
	}

	public void setPuesto(PuestoExtremo puesto) {
		this.puesto = puesto;
	}

	@Override
	public void monstrarDatos() {
		// TODO Auto-generated method stub
		
	}
}
