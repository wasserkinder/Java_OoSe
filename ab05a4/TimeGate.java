package ab05a4;

import java.util.ArrayList;
import java.util.Calendar;

public class TimeGate extends Component {
	
	@Override
	public boolean function(ArrayList<Component> inputs) {
		
		Calendar calendar = Calendar.getInstance();
		int sec = calendar.get(Calendar.SECOND);
		
		if(sec%2 == 0) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}

	@Override
	public String getName() {
		
		return "Time-Gatter";
	}

}
