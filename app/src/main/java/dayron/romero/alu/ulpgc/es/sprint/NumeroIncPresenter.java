package dayron.romero.alu.ulpgc.es.sprint;

import android.util.Log;

import java.lang.ref.WeakReference;

public class NumeroIncPresenter implements NumeroIncContract.Presenter {

    public static String TAG = NumeroIncPresenter.class.getSimpleName();

    private WeakReference<NumeroIncContract.View> view;
    private NumeroIncViewModel viewModel;
    private NumeroIncContract.Model model;
    private NumeroIncContract.Router router;

    public NumeroIncPresenter(NumeroIncState state) {
        viewModel = state;
    }

    @Override
    public void injectView(WeakReference<NumeroIncContract.View> view) {
        this.view = view;
    }

    @Override
    public void injectModel(NumeroIncContract.Model model) {
        this.model = model;
    }

    @Override
    public void injectRouter(NumeroIncContract.Router router) {
        this.router = router;
    }

    @Override
    public void fetchData() {
        // Log.e(TAG, "fetchData()");
        // set passed state
        NumeroIncState state = router.getDataFromPreviousScreen();
        if (state != null) {
            viewModel.numero = state.numero;
            viewModel.cuenta= state.cuenta;

        }
        if(model.esCero()==true) {
            viewModel.numero=0;
            view.get().displayData(viewModel);
        }
        if (viewModel.data == null) {
            // call the model
            String data = model.fetchData();

            // set initial state
            viewModel.data = data;
        }

        // update the view
        viewModel.data=Integer.toString(viewModel.numero);
        router.passDataToNextScreen(state);
        view.get().displayData(viewModel);

    }

    @Override
    public void incButtonClick() {
        model.incrementar();
        viewModel.numero = model.getNumero();
        viewModel.cuenta = model.getCuenta();
        fetchData();
    }
    public void startResetActivity(){
      NumeroIncState state = new NumeroIncState();
      state.numero = viewModel.numero;
      state.cuenta = viewModel.cuenta;
      router.navigateToNextScreen();

    }

}
