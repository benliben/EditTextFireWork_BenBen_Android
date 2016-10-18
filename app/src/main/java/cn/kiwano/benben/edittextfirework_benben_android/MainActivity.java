package cn.kiwano.benben.edittextfirework_benben_android;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

//    @InjectView(R.id.main_et)
//    EditText mEt;
//    @InjectView(R.id.fab)
//    FloatingActionButton mFab;

    private RelativeLayout layout;
    private TextView day, night;
    private EditText mEditText;
    private FireworkView mFireworkView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ButterKnife.inject(this);
        layout = (RelativeLayout) findViewById(R.id.layout);
        day = (TextView) findViewById(R.id.day);
        day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(0xFFFFFFFF);
            }
        });
        night = (TextView) findViewById(R.id.night);
        night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(0xFF000000);
            }
        });
        mEditText = (EditText) findViewById(R.id.edit_text);


        mFireworkView = (FireworkView) findViewById(R.id.fire_work);
        mFireworkView.bindEditText(mEditText);





//        mFab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

}
