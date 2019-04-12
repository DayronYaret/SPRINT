package dayron.romero.alu.ulpgc.es.sprint.ResetActivity;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;

public class ResetActivityModel implements ResetActivityContract.Model {

  public static String TAG = ResetActivityModel.class.getSimpleName();

  public ResetActivityModel() {

  }

  @Override
  public String fetchData() {
    // Log.e(TAG, "fetchData()");
    return "Hello";
  }
}
