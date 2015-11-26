package tk.site_guru.questioning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class SecondLevel extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // создание LinearLayout
        LinearLayout linLayout = new LinearLayout(this);
        // установим вертикальную ориентацию
        linLayout.setOrientation(LinearLayout.VERTICAL);
        // создаем LayoutParams
        ViewGroup.LayoutParams linLayoutParam = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        // устанавливаем linLayout как корневой элемент экрана
        setContentView(linLayout, linLayoutParam);
        TextView textView = new TextView(this);
        textView.setText(R.string.hello_world);
        textView.setGravity(Gravity.CENTER);
        linLayout.addView(textView);
        Button button = new Button(this);
        button.setText("ok");
        button.setId(R.id.button);
        button.setOnClickListener(this);
        linLayout.addView(button);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second_level, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
           String name1= getString(R.string.fio1);
        String name2= getString(R.string.fio2);
        String name3= getString(R.string.fio3);
        String name4= getString(R.string.fio4);
        String name5= getString(R.string.fio5);
        String name6= getString(R.string.fio6);
        ArrayList cuclus = new ArrayList();
        cuclus.add(name1);
        cuclus.add(name2);
        cuclus.add(name3);
        cuclus.add(name4);
        cuclus.add(name5);
        cuclus.add(name6);
        Random  random = new Random();
        int size = cuclus.size();
        int ball = random.nextInt(size);
        cuclus.get(ball);





    }
}
