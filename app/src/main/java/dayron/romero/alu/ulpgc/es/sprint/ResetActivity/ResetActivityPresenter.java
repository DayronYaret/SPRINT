package dayron.romero.alu.ulpgc.es.sprint.ResetActivity;

import android.util.Log;

import java.lang.ref.WeakReference;

public class ResetActivityPresenter implements ResetActivityContract.Presenter {

  public static String TAG = ResetActivityPresenter.class.getSimpleName();

  private WeakReference<ResetActivityContract.View> view;
  private ResetActivityViewModel viewModel;
  private ResetActivityContract.Model model;
  private ResetActivityContract.Router router;

  public ResetActivityPresenter(ResetActivityState state) {
    viewModel = state;
  }

  @Override
  public void injectView(WeakReference<ResetActivityContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(ResetActivityContract.Model model) {
    this.model = model;
  }

  @Override
  public void injectRouter(ResetActivityContract.Router router) {
    this.router = router;
  }

  @Override
  public void fetchData() {
    // Log.e(TAG, "fetchData()");

    // set passed state
    ResetActivityState state = router.getDataFromPreviousScreen();
    if (state != null) {
      viewModel.cuenta = state.cuenta;
      viewModel.data = Integer.toString(viewModel.cuenta);
    }

    if (viewModel.data == null) {
      // call the model
      String data = model.fetchData();

      // set initial state
      viewModel.data = data;
    }

    // update the view
    view.get().displayData(viewModel);

  }
    public void resetPressed(){
    model.reset();
    view.get().acabar();
    viewModel.cuenta=0;
    viewModel.numero=0;

    }

}
