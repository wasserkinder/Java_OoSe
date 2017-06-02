package ab05a4;

import ab05a4.AndGate;
import ab05a4.OrGate;
import ab05a4.NotGate;
import ab05a4.XorGate;
import ab05a4.NandGate;
import ab05a4.NorGate;
import ab05a4.TimeGate;
import ab05a4.LogischeVariablen;
import ab05a4.Circuit;
import ab05a4.Component;
import ab05a4.PassGate;

public class TestKlasse {

//	public static void main(String[] args) {
		
//		// Benoetigte Komponenten instanzieren
//		Component in1 = new PassGate();			// A
//		Component in2 = new PassGate();			// B
//		Component n1 = new NotGate();
//		Component a1 = new AndGate();
//		
//		// Bauteile vernetzen
//		in1.connectTo(a1); 						// A direkt mit AND verbinden
//		in2.connectTo(n1);						// B zunaechst mit NOT verbinden
//		n1.connectTo(a1);						// NOT mit AND verbinden
//		
//		// Circuit-Klasse instanzieren und Ausgang von AND registrieren
//		Circuit c1 = new Circuit();
//		c1.exitgates.add(a1);
//		in1.state = true;						// Eingang A festlegen
//		in2.state = false;						// Eingang B festlegen
//		
//		// Schaltung simulieren und Wert des ersten und einzigen Ausgangs ausgeben
//		System.out.println(c1.simulate().get(0));
//		
//	}
	
	private static LogischeVariablen testWerte[] = new LogischeVariablen[] { 
		new LogischeVariablen(false, false),
		new LogischeVariablen(true, false),
		new LogischeVariablen(false, true),
		new LogischeVariablen(true, true) 
	};

	private static Component allComponents[] = new Component[] { 
		new AndGate(),
		new OrGate(),
		new NotGate(),
		new XorGate(),
		new NandGate(),
		new NorGate(), 
		new TimeGate() 
	};

	public static void main(String[] args) {
		
		xorCircuit();
	
		Component in1 = new PassGate();
		Component in2 = new PassGate();
	
		for(Component c : allComponents) {
			
			System.out.println(c.getName() + ":");
				
				for(LogischeVariablen b : testWerte) {
					
					System.out.println("Eingang 1: " + b.getA() + ";Eingang 2: " + b.getB());
					
					in1.connectTo(c);
					in2.connectTo(c);
			
					Circuit c1 = new Circuit();
					c1.getExitgates().add(c);
			
					in1.setState(b.getA());
					in2.setState(b.getB());
			
					System.out.println("Ergebnis: " + c1.simulate().get(0));
				}
				
		}
		
	}

	private static void xorCircuit() {
		Component in1 = new PassGate();
		Component in2 = new PassGate();
		Component n1 = new NotGate();
		Component a1 = new AndGate();
		Component n2 = new NotGate();
		Component a2 = new AndGate();
		Component o1 = new OrGate();

		in1.connectTo(n1);
		n1.connectTo(a1);
		in2.connectTo(a1); // nicht-in1 und in2

		in1.connectTo(a2);
		in2.connectTo(n2);
		n2.connectTo(a2); // in1 und nicht-in2

		a2.connectTo(o1);
		a1.connectTo(o1); // oder der Ausgaben von and1 oder and2

		Circuit c1 = new Circuit();
		c1.getExitgates().add(o1);

		in1.setState(false);
		in2.setState(false);

		System.out.println(c1.simulate().get(0));

	}

}
