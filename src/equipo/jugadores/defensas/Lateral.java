package equipo.jugadores.defensas;

public class Lateral extends Defensa{

	private Puesto puesto;
	public Lateral(String nombre, int dorsal, String equipo, Puesto puesto, int disputasRealizadas) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		setPuesto(puesto);
		
	}
	public Puesto getPuesto() {
		return puesto;
	}
	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}
	
	@Override
	public String toString() {
		return "Lateral [Puesto=" + this.puesto + ", Disputas Realizadas=" + this.getDisputasRealizadas() + ", Nombre="
				+ this.getNombre() + ", Dorsal()=" + this.getDorsal() + ", Equipo=" + this.getEquipo() + "]";
	}
	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}	

}
