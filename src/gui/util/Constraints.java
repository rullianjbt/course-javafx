package gui.util;

import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Constraints {
	
	public static void setTextFieldInteger(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && !newValue.matches("\\d*")) {
				txt.setText(oldValue);
			}
		});
	}
	
	public static void setTextFieldMasLength(Text txt, int max) {
		txt.textProperty().addListener((obs, oldValue, newValue) ->{
			if (newValue != null && newValue.length() > max) {
				txt.setText(oldValue);
			}
		});
	}
	

	public static void setTextFielDouble(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) ->{
			if (newValue != null && newValue.matches("\\d*([\\.]\\d*)?")) {
				txt.setText(oldValue);
			}
		});
	}
}
