package ab05a4;

import java.util.ArrayList;

public class NandGate extends Component {
	
	@Override
	public boolean function(ArrayList<Component> inputs) {
		
		for(Component c : inputs){
		
			if(!c.getState()) {

				return true;
			}
			
		}
		
		return false;
	}

	@Override
	public String getName() {
		
		return "Nand-Gatter";
	}	

}
