package lab5.android.csulb.edu.lab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1 = (Button)findViewById(R.id.browser);
        bt1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Uri webpage = Uri.parse("http://www.amazon.com");
                String title = "Load " + webpage.toString() + "with :";
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                Intent chooser = Intent.createChooser(webIntent, title);
                startActivity(chooser);
            }

        });

        Button bt2 = (Button)findViewById(R.id.call);
        bt2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Uri number = Uri.parse("tel: +194912344444");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
            }

        });

    }


}
