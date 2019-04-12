package dayron.romero.alu.ulpgc.es.sprint.ResetActivity;

import java.lang.ref.WeakReference;

interface ResetActivityContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void displayData(ResetActivityViewModel viewModel);

    void acabar();
  }

  interface Presenter {
    void injectView(WeakReference<View> view);

    void injectModel(Model model);

    void injectRouter(Router router);

    void fetchData();
    void resetPressed();
  }

  interface Model {
    String fetchData();
    void reset();
  }

  interface Router {
    void navigateToNextScreen();

    void passDataToNextScreen(ResetActivityState state);

    ResetActivityState getDataFromPreviousScreen();
  }
}
