package app.akexorcist.androidworkshop_layout2;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class Main extends Activity {
	Button buttonMenu1, buttonMenu2, buttonMenu3, buttonMenu4;
	LinearLayout buttonSomething1, buttonSomething2
			, buttonSomething3, buttonSomething4, layoutContent;
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		String deviceType = getResources().getString(R.string.device);
		if(deviceType.equals("phone")) 
        	setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT);
		else if(deviceType.equals("tablet"))
        	setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
		
		setContentView(R.layout.layout_main);

		buttonMenu1 = (Button)findViewById(R.id.buttonMenu1);
		buttonMenu2 = (Button)findViewById(R.id.buttonMenu2);
		buttonMenu3 = (Button)findViewById(R.id.buttonMenu3);
		buttonMenu4 = (Button)findViewById(R.id.buttonMenu4);

		buttonSomething1 = (LinearLayout)findViewById(R.id.buttonSomething1);
		buttonSomething2 = (LinearLayout)findViewById(R.id.buttonSomething2);
		buttonSomething3 = (LinearLayout)findViewById(R.id.buttonSomething3);
		buttonSomething4 = (LinearLayout)findViewById(R.id.buttonSomething4);
		
		layoutContent = (LinearLayout)findViewById(R.id.layoutContent);
	}
}
