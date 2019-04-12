package dayron.romero.alu.ulpgc.es.sprint.ResetActivity;

import android.util.Log;
import android.content.Intent;
import android.content.Context;

import app.AppMediator;

public class ResetActivityRouter implements ResetActivityContract.Router {

  public static String TAG = ResetActivityRouter.class.getSimpleName();

  private AppMediator mediator;

  public ResetActivityRouter(AppMediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void navigateToNextScreen() {
    Context context = mediator.getApplicationContext();
    Intent intent = new Intent(context, ResetActivityActivity.class);
    context.startActivity(intent);
  }

  @Override
  public void passDataToNextScreen(ResetActivityState state) {
    mediator.setResetActivityState(state);
  }

  @Override
  public ResetActivityState getDataFromPreviousScreen() {
    ResetActivityState state = mediator.getResetActivityState();
    state.cuenta=mediator.getNumeroIncState().cuenta;
    return state;
  }
}
