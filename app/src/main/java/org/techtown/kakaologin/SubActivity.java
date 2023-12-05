package org.techtown.kakaologin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {




    private String strNick,strEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        //initShareButton();

        Intent intent=getIntent();
        strNick=intent.getStringExtra("name");
        strEmail=intent.getStringExtra("email");

        TextView tv_nick=findViewById(R.id.tv_nickname);
        TextView tv_email=findViewById(R.id.tv_email);

        //닉네임 셋
        tv_nick.setText(strNick);
        //이메일 셋
        tv_email.setText(strEmail);

    }
    /**
    private void initShareButton() {
        final AppCompatButton shareButton = findViewById(R.id.btnShare);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(
                        Intent.EXTRA_TEXT,
                        "" // 전달하려는 Data(Value)
                );
                shareIntent.setType("text/plain");

                startActivity(Intent.createChooser(shareIntent, null));
            }
        });
    }*/
}