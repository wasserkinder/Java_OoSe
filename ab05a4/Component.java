package ab05a4;

import java.util.ArrayList;

public abstract class Component {									// "class Component" repraesentiert jeweils eine Schaltungskomponente
	
	private ArrayList<Component> predecessors = new ArrayList<Component>();	// Liste enthaelt alle vorgeschalteten Komponenten
	private boolean state = false;											// "state" gibt Wert des Ausgangs dieses Bauteils (BT) an
	
	public void connectTo(Component target) {								// verbindet den Ausgang des jeweiligen BTs mit einem anderen BT
	
		target.predecessors.add(this);
	}
	
	public abstract String getName();
	
	public abstract boolean function(ArrayList<Component> inputs);	// abstrakte Methode "function" implementiert die Logik des BTs
	
	public void evaluate() {										// dies wird von "evaluate" genutzt, um Wert des Ausgangs 
	
		state = function(predecessors);								// gemaess der Logik zu setzen
	}
	
	public boolean getState() {
		
		return state;
		
	}

	public void setState(boolean state) {
		
		this.state = state;
		
	}

	public ArrayList<Component> getPredecessors() {
		
		return predecessors;
	}
	
}
