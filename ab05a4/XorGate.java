package ab05a4;

import java.util.ArrayList;

public class XorGate extends Component {
	
	@Override
	public boolean function(ArrayList<Component> inputs) {
		
		boolean evaluation = false;
		for(Component c : inputs) {
			
			evaluation = (evaluation != c.getState());
			
		}
		
		return evaluation;
	}

	@Override
	public String getName() {
		
		return "Xor-Gatter";
	}

}
