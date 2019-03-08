package dayron.romero.alu.ulpgc.es.sprint;

import java.lang.ref.WeakReference;

import android.support.v4.app.FragmentActivity;

import app.AppMediator;

public class NumeroIncScreen {

    public static void configure(NumeroIncContract.View view) {

        WeakReference<FragmentActivity> context =
                new WeakReference<>((FragmentActivity) view);

        AppMediator mediator = (AppMediator) context.get().getApplication();
        NumeroIncState state = mediator.getNumeroIncState();

        NumeroIncContract.Router router = new NumeroIncRouter(mediator);
        NumeroIncContract.Presenter presenter = new NumeroIncPresenter(state);
        NumeroIncContract.Model model = new NumeroIncModel();
        presenter.injectModel(model);
        presenter.injectRouter(router);
        presenter.injectView(new WeakReference<>(view));

        view.injectPresenter(presenter);

    }
}
