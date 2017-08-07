package Security;
import java.math.BigDecimal;

import org.jdatepicker.JDatePicker;

import javafx.scene.control.*;
public class tools {
	public String salesTax(String in){
		
		double amt = Double.parseDouble(in);
		double tax = .06;
		
		
		return round(amt*tax);
	}

	public String round(double  in){
		return new BigDecimal(in).setScale(2, BigDecimal.ROUND_HALF_UP).toString();
	}
	
}
