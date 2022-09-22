package Online;

import java.util.ArrayList;
import Online.Participante;
import java.util.Collections;
	
public class Main{
	public static void main(String [] args) {
		ArrayList<Participante> participantes = new ArrayList<Participante>();
		
	participantes.add(new Participante("Felipe","11","25"));
	participantes.add(new Participante("María","13","21"));
	participantes.add(new Participante("Sebastían","11","26"));
	participantes.add(new Participante("María","15","24"));
	participantes.add(new Participante("Eduardo","12","23"));
	participantes.add(new Participante("Valentina","12","23"));
	participantes.add(new Participante("Uriel","14","19"));
	participantes.add(new Participante("Eleni","10","20"));
	participantes.add(new Participante("Wilson","10","23"));
	participantes.add(new Participante("Marco","13","22"));
	
	Collections.sort(participantes);
	
	for (Participante particip : participantes) {
		
		System.out.println(particip.getname()+"->"+particip.getgame()+"->"+particip.getpoints());
		
	}
	}
}
