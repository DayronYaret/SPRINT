package dayron.romero.alu.ulpgc.es.sprint;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;

public class NumeroIncModel implements NumeroIncContract.Model {

    public static String TAG = NumeroIncModel.class.getSimpleName();
    private int numero;
    private int cuenta;
    public NumeroIncModel() {
        numero=0;
    }

    @Override
    public String fetchData() {
        // Log.e(TAG, "fetchData()");
        return "Hello";
    }
    public void incrementar(){
        numero++;
        if(numero >9){
          numero=0;
        }
        cuenta++;
    }
    public int getNumero(){
        return numero;
    }

    public int getCuenta(){
        return cuenta;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    public void setCuenta(int cuenta){
        this.cuenta=cuenta;
    }
}
