package ntu_63132050.cau3_introduce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void facebookLink(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100078969199950"));
        startActivity(intent);
    }

    public void githupLink(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.githup.com/hieuhuynh113"));
        startActivity(intent);
    }

    public void instagramLink(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/hiuthubar_/"));
        startActivity(intent);
    }
}

