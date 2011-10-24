package info.gamlor.android.example

import android.app.Activity
import android.os.Bundle

class MainActivity extends Activity {
  /**Called when the activity is first created. */
  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)
  }
}

