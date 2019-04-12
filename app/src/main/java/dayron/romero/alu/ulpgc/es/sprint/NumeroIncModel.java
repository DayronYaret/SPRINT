package dayron.romero.alu.ulpgc.es.sprint;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;

import dayron.romero.alu.ulpgc.es.sprint.data.Repositorio;

public class NumeroIncModel implements NumeroIncContract.Model {

    public static String TAG = NumeroIncModel.class.getSimpleName();
    private int numero;
    private int cuenta;
    private Repositorio repositorio;
    public NumeroIncModel(Repositorio repositorio) {
        this.repositorio=repositorio;
    }

    @Override
    public String fetchData() {
        // Log.e(TAG, "fetchData()");
        return "Hello";
    }
    public void incrementar(){
        repositorio.incrementar();
        numero = repositorio.getNumero();
        cuenta = repositorio.getCuenta();
    }

    public boolean esCero(){
        if(repositorio.getNumero()==0)
            return true;
        else
            return false;
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
