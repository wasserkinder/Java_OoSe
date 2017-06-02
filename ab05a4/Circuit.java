package ab05a4;

import java.util.ArrayList;

public class Circuit {
	
	ArrayList<Component> exitgates = new ArrayList<Component>();	// Liste "exitgates" beinhaltet alle BT, die sich am Ende
																	// der Schaltung befinden (Ausgaenge)
	public ArrayList<Boolean> simulate() {							// Methode "simulate" simuliert Schaltung unter Nutzung der... 
		
		ArrayList<Boolean> results = new ArrayList<Boolean>();
		
		for(Component c : exitgates) {
			
			revaluate(c);											// ...rekursiven Funktion "revaluate" und gibt Werte aller
			results.add(c.getState());								// Ausgaenge zurueck
		}
		
		return results;
	}
	public void revaluate(Component c) {
		
		for(Component pre:c.getPredecessors) revaluate(pre);
		c.evaluate();
		
	}
	
	public ArrayList<Component> getExitgates() {
		
		return exitgates;
	}

}
