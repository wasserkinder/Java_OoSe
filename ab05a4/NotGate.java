package ab05a4;

import java.util.ArrayList;

public class NotGate extends Component {
	
	@Override
	public boolean function(ArrayList<Component> inputs) {
		Component c = inputs.get(0);
		if(c != null)
		{
			return !c.getState();
		}
		return false;
	}

	@Override
	public String getName() {
		return "Not-Gatter";
	}

}
