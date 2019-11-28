
package kr.hs.emirim.meowmeowpunch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.m_stBtn).setOnClickListener(m_stBtnClick);
        findViewById(R.id.m_rnkBtn).setOnClickListener(m_rnkBtnClick);
    }

    Button.OnClickListener m_stBtnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, StartActivity.class);
            startActivity(intent);
        }
    };

    Button.OnClickListener m_rnkBtnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, RankActivity.class);
            startActivity(intent);
        }
    };
}
