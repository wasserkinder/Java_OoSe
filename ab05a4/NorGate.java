package ab05a4;

import java.util.ArrayList;

public class NorGate extends Component {
	
	@Override
	public boolean function(ArrayList<Component> inputs) {
		
		for(Component c : inputs){
		
			if(c.getState()) {
				
				return false;
			}
			
		}
		
		return true;
	}

	@Override
	public String getName() {
		
		return "Nor-Gatter";
	}

}
