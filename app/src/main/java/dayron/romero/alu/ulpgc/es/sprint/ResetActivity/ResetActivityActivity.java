package dayron.romero.alu.ulpgc.es.sprint.ResetActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import dayron.romero.alu.ulpgc.es.sprint.R;

public class ResetActivityActivity
    extends AppCompatActivity implements ResetActivityContract.View {

  public static String TAG = ResetActivityActivity.class.getSimpleName();

  private ResetActivityContract.Presenter presenter;
  private Button reset;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_reset);

    // do the setup
    ResetActivityScreen.configure(this);
    reset = findViewById(R.id.ResetButton);
    reset.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        presenter.resetPressed();
      }
    });
  }

  @Override
  protected void onResume() {
    super.onResume();

    // do some work
    presenter.fetchData();
  }

  @Override
  public void injectPresenter(ResetActivityContract.Presenter presenter) {
    this.presenter = presenter;
  }

  @Override
  public void displayData(ResetActivityViewModel viewModel) {
    //Log.e(TAG, "displayData()");

    // deal with the data
    ((TextView) findViewById(R.id.countTextView)).setText(viewModel.data);
  }
  @Override
  public void acabar(){
    finish();
  }
}
