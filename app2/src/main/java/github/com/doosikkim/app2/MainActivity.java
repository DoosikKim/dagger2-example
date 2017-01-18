package github.com.doosikkim.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Inject @Named("name") String nameStr;
    @Inject @Named("greet") String greetStr;
    @Inject @Named("hello") String helloStr;

    @BindView(R.id.textView)
    TextView textView;

    @OnClick(R.id.button) void buttonClicked() {
        textView.setText(helloStr + " " +nameStr);
        textView.append("\n");
        textView.append(greetStr);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ((MyApplication)getApplication()).getHelloComponent().inject(this);

    }


}
