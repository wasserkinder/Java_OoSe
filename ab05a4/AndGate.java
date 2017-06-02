package ab05a4;

public class AndGate extends Component {
	
		@Override
		public boolean function(java.util.ArrayList<Component> inputs) {
			
			for(Component c : inputs) {
				if(!c.state) return false;			// Gib "false" zurueck sobald ein Eingang "false".
			}
			
			return true;							// Falls kein Eingang "false", gib "true" zurueck.
		
		}
		
		@Override
		public String getName() {
		
			return "And-Gatter";
		
		}
		

}
