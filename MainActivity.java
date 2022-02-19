package saharsh_pf.example.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.Image;
import android.media.ImageReader;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView img;
int[] arr = new int []{
    R.drawable.first, R.drawable.second , R.drawable.third , R.drawable.fourth , R.drawable.fifth};

int k = 0;


public void next(View view ){

    if(k<4){
        k++;
        img.setImageResource(arr[k]);
    }

}



    public void previous(View view ) {
        img.setImageResource(arr[k]);
        if (k>0) {
            k--;

        }
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView)findViewById(R.id.imageView) ;
    }
}