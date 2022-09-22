package Online;

public class Participante implements Comparable<Participante> {
	private String name;
	private String game;
	private String points;
	
	
	public Participante(String pname, String pgame, String ppoints) {
		this.name = pname;
		this.game = pgame;
		this.points = ppoints;
	}
	
	public int compareTo(Participante ou) {

	     int juego = this.game.compareTo(ou.game);
	     return juego == 0 ? ou.points.compareTo(this.points) : juego;
		
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String getgame() {
		return game;
	}
	
	public void setgame(String game) {
		this.game = game;
	}
	
	public String getpoints() {
		return points;
	}
	
	public void setpoints(String points) {
		this.points = points;
	}
}
