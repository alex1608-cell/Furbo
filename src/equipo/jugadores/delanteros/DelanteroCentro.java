package equipo.jugadores.delanteros;
public class DelanteroCentro extends Delantero {
	private int golesDePenalti;

	public DelanteroCentro(String nombre, int dorsal, String equipo, int goles, int golesDePenalti) {
		super(nombre, dorsal, equipo, goles);
		this.setGolesDePenalti(golesDePenalti);
	}

	public int getGolesDePenalti() {
		return golesDePenalti;
	}

	public void setGolesDePenalti(int golesDePenalti) {
		this.golesDePenalti = golesDePenalti;
	}

	@Override
	public void monstrarDatos(String nombre, int dorsal, String equipo) {
		// TODO Auto-generated method stub
		
	}

	
}
