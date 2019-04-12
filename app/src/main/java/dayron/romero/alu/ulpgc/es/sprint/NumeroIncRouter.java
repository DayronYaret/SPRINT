package dayron.romero.alu.ulpgc.es.sprint;

import android.util.Log;
import android.content.Intent;
import android.content.Context;

import app.AppMediator;
import dayron.romero.alu.ulpgc.es.sprint.ResetActivity.ResetActivityActivity;

public class NumeroIncRouter implements NumeroIncContract.Router {

    public static String TAG = NumeroIncRouter.class.getSimpleName();

    private AppMediator mediator;

    public NumeroIncRouter(AppMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void navigateToNextScreen() {
        Context context = mediator.getApplicationContext();
        Intent intent = new Intent(context, ResetActivityActivity.class);
        context.startActivity(intent);
    }




    @Override
    public void passDataToNextScreen(NumeroIncState state) {
        mediator.setNumeroIncState(state);
    }



    @Override
    public NumeroIncState getDataFromPreviousScreen() {
        NumeroIncState state = mediator.getNumeroIncState();
        return state;
    }

}
