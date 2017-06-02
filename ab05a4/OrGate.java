package ab05a4;

import java.util.ArrayList;

public class OrGate extends Component {
	
	@Override
	public boolean function(ArrayList<Component> inputs) {
		
		for(Component c : inputs) {
			
			if(c.getState()) {

				return true;
			
			}
		}
		
		return false;
	}

	@Override
	public String getName() {
		
		return "Or-Gatter";
		
	}

}
