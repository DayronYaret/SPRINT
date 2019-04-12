package dayron.romero.alu.ulpgc.es.sprint.ResetActivity;

import java.lang.ref.WeakReference;

import android.support.v4.app.FragmentActivity;

import app.AppMediator;

public class ResetActivityScreen {

  public static void configure(ResetActivityContract.View view) {

    WeakReference<FragmentActivity> context =
        new WeakReference<>((FragmentActivity) view);

    AppMediator mediator = (AppMediator) context.get().getApplication();
    ResetActivityState state = mediator.getResetActivityState();

    ResetActivityContract.Router router = new ResetActivityRouter(mediator);
    ResetActivityContract.Presenter presenter = new ResetActivityPresenter(state);
    ResetActivityContract.Model model = new ResetActivityModel();
    presenter.injectModel(model);
    presenter.injectRouter(router);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
