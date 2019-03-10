package app;

import android.app.Application;

import dayron.romero.alu.ulpgc.es.sprint.NumeroIncState;

public class AppMediator extends Application {
    private NumeroIncState state= new NumeroIncState();
    public NumeroIncState getNumeroIncState() {
        return state;
    }

    public void setNumeroIncState(NumeroIncState state) {
        this.state = state;
    }
}
