package com.example.myid;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView facebookLogo = findViewById(R.id.facebookLogo);
        ImageView whatsappLogo = findViewById(R.id.whatsappLogo);
        ImageView phoneCallLogo = findViewById(R.id.phoneCallLogo);
        ImageView githubLogo = findViewById(R.id.githubLogo);
        ImageView linkedinLogo = findViewById(R.id.linkedinLogo);
        ImageView emailLogo = findViewById(R.id.emailLogo);

        facebookLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/MamunurRoshid517"));
                try {
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    // If the Facebook app is not installed, open the URL in a browser
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/MamunurRoshid517"));
                    startActivity(webIntent);
                }
            }
        });


        whatsappLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=+8801793232510"));
                startActivity(intent);
            }
        });

        phoneCallLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01793232510"));
                startActivity(intent);
            }
        });

        githubLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/mamunurRoshid14"));
                startActivity(intent);
            }
        });

        linkedinLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/mamunurroshid517/"));
                startActivity(intent);
            }
        });

        emailLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:mamunur.stu2019@juniv.edu"));
                startActivity(intent);
            }
        });
    }
}
