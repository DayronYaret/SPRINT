package dayron.romero.alu.ulpgc.es.sprint;

import java.lang.ref.WeakReference;

interface NumeroIncContract {

    interface View {
        void injectPresenter(Presenter presenter);

        void displayData(NumeroIncViewModel viewModel);
    }

    interface Presenter {
        void injectView(WeakReference<View> view);

        void injectModel(Model model);

        void injectRouter(Router router);

        void fetchData();

        void incButtonClick();

        void startResetActivity();
    }

    interface Model {
        String fetchData();
        void incrementar();
        int getNumero();
        int getCuenta();
        void setNumero(int numero);
        void setCuenta(int cuenta);
        boolean esCero();
    }

    interface Router {
        void navigateToNextScreen();

        void passDataToNextScreen(NumeroIncState state);

        NumeroIncState getDataFromPreviousScreen();
    }
}
