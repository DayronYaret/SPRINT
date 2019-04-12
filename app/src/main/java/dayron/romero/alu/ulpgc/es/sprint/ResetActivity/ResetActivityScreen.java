package dayron.romero.alu.ulpgc.es.sprint.ResetActivity;

import java.lang.ref.WeakReference;

import android.support.v4.app.FragmentActivity;

import app.AppMediator;
import dayron.romero.alu.ulpgc.es.sprint.data.Repositorio;

public class ResetActivityScreen {

  public static void configure(ResetActivityContract.View view) {

    WeakReference<FragmentActivity> context =
        new WeakReference<>((FragmentActivity) view);

    AppMediator mediator = (AppMediator) context.get().getApplication();
    ResetActivityState state = mediator.getResetActivityState();
    Repositorio repositorio = Repositorio.getInstance(context.get());

    ResetActivityContract.Router router = new ResetActivityRouter(mediator);
    ResetActivityContract.Presenter presenter = new ResetActivityPresenter(state);
    ResetActivityContract.Model model = new ResetActivityModel(repositorio);
    presenter.injectModel(model);
    presenter.injectRouter(router);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
