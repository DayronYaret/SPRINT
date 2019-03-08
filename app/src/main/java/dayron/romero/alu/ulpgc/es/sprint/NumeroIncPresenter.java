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
            viewModel.data = state.data;
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

    @Override
    public void incButtonClick() {

    }


}
