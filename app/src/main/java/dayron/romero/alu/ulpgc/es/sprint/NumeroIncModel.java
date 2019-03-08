package dayron.romero.alu.ulpgc.es.sprint;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;

public class NumeroIncModel implements NumeroIncContract.Model {

    public static String TAG = NumeroIncModel.class.getSimpleName();
private int numero;
    public NumeroIncModel() {
numero=0;
    }

    @Override
    public String fetchData() {
        // Log.e(TAG, "fetchData()");
        return "Hello";
    }

    @Override
    public void incrementar() {
        numero++;

    }
    public int getNumero(){
        return numero;
    }
}
