package name.boyle.chris.sgtpuzzles;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class RestartActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		startActivity(new Intent(this, SGTPuzzles.class));
		finish();
	}
}
