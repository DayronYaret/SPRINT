package dayron.romero.alu.ulpgc.es.sprint.ResetActivity;

import java.lang.ref.WeakReference;

interface ResetActivityContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void displayData(ResetActivityViewModel viewModel);
  }

  interface Presenter {
    void injectView(WeakReference<View> view);

    void injectModel(Model model);

    void injectRouter(Router router);

    void fetchData();
  }

  interface Model {
    String fetchData();
  }

  interface Router {
    void navigateToNextScreen();

    void passDataToNextScreen(ResetActivityState state);

    ResetActivityState getDataFromPreviousScreen();
  }
}
