package ab05a4;

import java.util.ArrayList;

public class PassGate extends Component {		// Wert eines Eingangs (einer PassGate-Instanz) kann duch Eigenschaft
												// "state" festgelegt werden (ist also nicht von vorgeschalteten
	@Override									// Bauteilen abhaengig
	public boolean function(java.util.ArrayList<Component> inputs) {
		return this.state;
	}

	@Override
	public String getName() {
		return "Pass-Gatter";
	}
	
}
