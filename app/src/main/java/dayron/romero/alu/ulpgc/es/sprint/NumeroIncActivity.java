package dayron.romero.alu.ulpgc.es.sprint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NumeroIncActivity
        extends AppCompatActivity implements NumeroIncContract.View {

    public static String TAG = NumeroIncActivity.class.getSimpleName();

    private NumeroIncContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero_inc);

        // do the setup
        NumeroIncScreen.configure(this);

    }

    @Override
    protected void onResume() {
        super.onResume();

        // do some work
        presenter.fetchData();
    }

    @Override
    public void injectPresenter(NumeroIncContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void displayData(NumeroIncViewModel viewModel) {
        //Log.e(TAG, "displayData()");

        // deal with the data
        ((TextView) findViewById(R.id.textView)).setText(viewModel.data);
    }
    public void onIncButtonClick(View view){
        presenter.incButtonClick();

    }
}
