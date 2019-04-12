package dayron.romero.alu.ulpgc.es.sprint.ResetActivity;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;

import dayron.romero.alu.ulpgc.es.sprint.data.Repositorio;

public class ResetActivityModel implements ResetActivityContract.Model {

  public static String TAG = ResetActivityModel.class.getSimpleName();

  private Repositorio repositorio;

  public ResetActivityModel(Repositorio repositorio) {
    this.repositorio=repositorio;
  }

  @Override
  public String fetchData() {
    // Log.e(TAG, "fetchData()");
    return "Hello";
  }
  public void reset(){
    repositorio.setCuenta(0);
    repositorio.setNumero(0);
  }
}
