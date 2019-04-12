package app;

import android.app.Application;

import dayron.romero.alu.ulpgc.es.sprint.NumeroIncState;
import dayron.romero.alu.ulpgc.es.sprint.ResetActivity.ResetActivityState;

public class AppMediator extends Application {
    private NumeroIncState state;
    private ResetActivityState resetState;

    public AppMediator(){
        state= new NumeroIncState();
        resetState = new ResetActivityState();
    }

    public NumeroIncState getNumeroIncState() {
        return state;
    }

    public void setNumeroIncState(NumeroIncState state) {
        this.state = state;
    }

    public ResetActivityState getResetActivityState(){
        return resetState;
    }
    public void setResetActivityState(ResetActivityState state){
        resetState = state;
    }
}
