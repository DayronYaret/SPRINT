package dayron.romero.alu.ulpgc.es.sprint;

import java.lang.ref.WeakReference;

import android.support.v4.app.FragmentActivity;

import app.AppMediator;
import dayron.romero.alu.ulpgc.es.sprint.data.Repositorio;

public class NumeroIncScreen {

    public static void configure(NumeroIncContract.View view) {

        WeakReference<FragmentActivity> context =
                new WeakReference<>((FragmentActivity) view);

        AppMediator mediator = (AppMediator) context.get().getApplication();
        NumeroIncState state = mediator.getNumeroIncState();
        Repositorio repositorio = Repositorio.getInstance(context.get());

        NumeroIncContract.Router router = new NumeroIncRouter(mediator);
        NumeroIncContract.Presenter presenter = new NumeroIncPresenter(state);
        NumeroIncContract.Model model = new NumeroIncModel(repositorio);
        presenter.injectModel(model);
        presenter.injectRouter(router);
        presenter.injectView(new WeakReference<>(view));

        view.injectPresenter(presenter);

    }
}
