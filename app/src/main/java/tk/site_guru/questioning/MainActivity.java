package tk.site_guru.questioning;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.IllegalFormatCodePointException;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    String firstname;
    String secondname;
    String lastname;
    int count = 0;
    String city;
    String national;
    String nameofsister;
    CatTask  cattask;
    int scale=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setVisibility(View.INVISIBLE);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            Intent intent = new Intent(this,TwoActivityq.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
   // @Override
   // public void onBackPressed(){}

    public void onclick(View view) {
      timer();
       // cattask.cancel(false);


//        Thread mainthread = Thread.currentThread();
//        try{mainthread.sleep(5000);}
//        catch (InterruptedException e){}



      if(count==0){
         Button buttonq=(Button)findViewById(view.getId());
          String name =    buttonq.getText().toString();
          String[] result = name.split(" ");
          firstname = result[0];
          secondname = result[1];
          lastname = result[2];
        TextView textView = (TextView)findViewById(R.id.textView);
          textView.setText(R.string.city);
       Button button = (Button)findViewById(R.id.button);
        button.setText(R.string.kirovograd);
        button = (Button)findViewById(R.id.button2);
        button.setText(R.string.kiev);
        button = (Button)findViewById(R.id.button3);
        button.setText(R.string.zitomyr);
        button = (Button)findViewById(R.id.button4);
        button.setText(R.string.mariupol);
        button = (Button)findViewById(R.id.button5);
        button.setText(R.string.moskov);
        button = (Button)findViewById(R.id.button6);
        button.setText(R.string.lvov);

      }
        else if(count==1){
          Button button = (Button)findViewById(view.getId());
            city = button.getText().toString();
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText(R.string.nation);
             button = (Button)findViewById(R.id.button);
            button.setText(R.string.ukraian);
            button = (Button)findViewById(R.id.button2);
            button.setText(R.string.russion);
            button = (Button)findViewById(R.id.button3);
            button.setText(R.string.moldova);
            button = (Button)findViewById(R.id.button4);
            button.setText(R.string.amtrican);
            button = (Button)findViewById(R.id.button5);
            button.setText(R.string.england);
            button = (Button)findViewById(R.id.button6);
            button.setText(R.string.vengr);}
      else if(count==2){
          Button button = (Button)findViewById(view.getId());
          national = button.getText().toString();
          TextView textView = (TextView)findViewById(R.id.textView);
          textView.setText(R.string.sister);
           button = (Button)findViewById(R.id.button);
          button.setText(R.string.oksana);
          button = (Button)findViewById(R.id.button2);
          button.setText(R.string.ola);
          button = (Button)findViewById(R.id.button3);
          button.setText(R.string.marfa);
          button = (Button)findViewById(R.id.button4);
          button.setText(R.string.notsister);
          button = (Button)findViewById(R.id.button5);
          button.setText(R.string.natasha);
          button = (Button)findViewById(R.id.button6);
          button.setText(R.string.nina);}
      else if(count==3){
          Button button = (Button)findViewById(view.getId());
          nameofsister = button.getText().toString();
          TextView textView = (TextView)findViewById(R.id.textView);
          textView.setText(R.string.name);
           button = (Button)findViewById(R.id.button);
          button.setText(R.string.bor);
          button = (Button)findViewById(R.id.button2);
          button.setText(R.string.nik);
          button = (Button)findViewById(R.id.button3);
          button.setText(R.string.nika);
          button = (Button)findViewById(R.id.button4);
          button.setText(R.string.gal);
          button = (Button)findViewById(R.id.button5);
          button.setText(R.string.evg);
          button = (Button)findViewById(R.id.button6);
          button.setText(R.string.vas);
      }
      else if(count==4|count ==5|count ==6|count==7){
          Button button= (Button)findViewById(view.getId());
          TextView textView = (TextView)findViewById(R.id.textView);


          if(firstname.equals(button.getText().toString())){

              textView.setText(R.string.good);
              deliteallbuttons();
              addonebutton();
              //int i это для id в следующем методе
              count = 776;
          }else{
              bloods();
              count = 3;
              //textView.setText(R.string.take);
              //deliteallbuttons();
             // addonebutton();
              //int i это для id в следующем методе
             // count = 998;

          }
      }
        count++;
    }
    @Override
    public void onClick(View v) {
        timer();

        if(count ==777){
            addcity();
            count=0;
        }
        if(count ==999){
            addintent();


        }
        if (count==1){
            Button button = (Button)findViewById(v.getId());

            if(city==button.getText().toString()){
                addnation();

            }else {
                addterorer();
            }
        }
        if(count==2){
            Button button = (Button)findViewById(v.getId());
            if(national ==button.getText().toString()){
                addsecondname();

            }else {
                addterorer();

            }
        }
        if(count==3){
            Button button = (Button)findViewById(v.getId());
            if (secondname.equals(button.getText().toString())){
                deliteallbuttons();
                addorbutton();
                TextView text = (TextView)findViewById(R.id.textView);
                text.setText(R.string.terror);

            }else {
                addterorer();
            }

        }
        if(count==4){
            if(v.getId() == R.id.button)
            addterorer();
            else {
            addnation();
            }
//            ImageView image = new ImageView(this);
//            image.setImageResource(R.drawable.smoke);
//            RelativeLayout relativ= (RelativeLayout)findViewById(R.id.r1);
//            relativ.addView(image);


        }
        if(count ==5){
            Button button = (Button)findViewById(v.getId());
            if (national.equals(button.getText().toString()))
                setnameofsister();
            else addterorer();
        }
        if(count == 6){
            Button button = (Button)findViewById(v.getId());
            if (nameofsister.equals(button.getText().toString())){

                setLastname();
            }else addterorer();


        }
        if(count == 7){
            Button button = (Button)findViewById(v.getId());
            if (lastname.equals(button.getText().toString()))
                setYouvon();
            else addterorer();


        }
        if(count == 8){
            if(v.getId() == R.id.button)
                addterorer();
            else {
                Intent intent = new Intent(MainActivity.this,YouVon.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);

            }


        }


        count++;


    }
//    public void yesorno() {
//
//    }

    public void addterorer() {
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(R.string.take);
        deliteallbuttons();
        addonebutton();
        //int i это для id в следующем методе
        count = 998;
    }

    public void deliteallbuttons() {
        Button button = (Button)findViewById(R.id.button2);
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linerlayout);
        linearLayout.removeView(button);
        button = (Button)findViewById(R.id.button3);
        linearLayout.removeView(button);
        button = (Button)findViewById(R.id.button4);
        linearLayout.removeView(button);
        button = (Button)findViewById(R.id.button5);
        linearLayout.removeView(button);
        button = (Button)findViewById(R.id.button6);
        linearLayout.removeView(button);
        button = (Button)findViewById(R.id.button);
        linearLayout.removeView(button);

    }
    public  void addonebutton(){
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linerlayout);
        Button button = new Button(this);
        button.setText("ok");
        button.setId(R.id.button);
        button.setOnClickListener(this);
        linearLayout.addView(button);



    }
    public  void addorbutton(){
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linerlayout);
        Button button = new Button(this);
        button.setText(R.string.yes);
        button.setId(R.id.button);
        button.setOnClickListener(this);
        linearLayout.addView(button);
        button = new Button(this);
        button.setText(R.string.no);
        button.setId(R.id.button2);
        button.setOnClickListener(this);
        linearLayout.addView(button);


    }

    public void addallbuttons(String a,String b, String c, String d, String e,String f){
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linerlayout);
        Button button = new Button(this);
        button.setText(a);
        button.setId(R.id.button);
        button.setOnClickListener(this);
        linearLayout.addView(button);

        button = new Button(this);
        button.setText(b);
        button.setId(R.id.button2);
        button.setOnClickListener(this);
        linearLayout.addView(button);

        button = new Button(this);
        button.setText(c);
        button.setId(R.id.button3);
        button.setOnClickListener(this);
        linearLayout.addView(button);

        button = new Button(this);
        button.setText(d);
        button.setId(R.id.button4);
        button.setOnClickListener(this);
        linearLayout.addView(button);

        button = new Button(this);
        button.setText(e);
        button.setId(R.id.button5);
        button.setOnClickListener(this);
        linearLayout.addView(button);

        button = new Button(this);
        button.setText(f);
        button.setId(R.id.button6);
        button.setOnClickListener(this);
        linearLayout.addView(button);
    }
    public void addnation(){
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linerlayout);
        linearLayout.removeAllViews();
        TextView textView = new TextView(this);
        textView.setId(R.id.textView);
        textView.setText(R.string.nation);
        textView.setGravity(Gravity.CENTER);
        linearLayout.addView(textView);
        addallbuttons(this.getString(R.string.russion), this.getString(R.string.amtrican), this.getString(R.string.ukraian), this.getString(R.string.moldova), this.getString(R.string.england), this.getString(R.string.vengr));



    }
    public void setnameofsister(){
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linerlayout);
        linearLayout.removeAllViews();
        TextView textView = new TextView(this);
        textView.setId(R.id.textView);
        textView.setText(R.string.sister);
        textView.setGravity(Gravity.CENTER);
        linearLayout.addView(textView);
        addallbuttons(this.getString(R.string.ola), this.getString(R.string.nina), this.getString(R.string.oksana), this.getString(R.string.marfa), this.getString(R.string.natasha), this.getString(R.string.notsister));



    }
    public void setLastname(){
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linerlayout);
        linearLayout.removeAllViews();
        TextView textView = new TextView(this);
        textView.setId(R.id.textView);
        textView.setText(R.string.lastname);
        textView.setGravity(Gravity.CENTER);
        linearLayout.addView(textView);
        addallbuttons(this.getString(R.string.stikova), this.getString(R.string.hren), this.getString(R.string.hurch), this.getString(R.string.semenov), this.getString(R.string.ivanov), this.getString(R.string.shtik));



    }
    public void setYouvon(){
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linerlayout);
        linearLayout.removeAllViews();
        TextView textView = new TextView(this);
        textView.setId(R.id.textView);
        textView.setText(R.string.youvon);
        textView.setGravity(Gravity.CENTER);
        linearLayout.addView(textView);
        addorbutton();


    }
    public void addname(){
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linerlayout);
        linearLayout.removeAllViews();
        TextView textView = new TextView(this);
        textView.setId(R.id.textView);
        textView.setText(R.string.name);
        textView.setGravity(Gravity.CENTER);
        linearLayout.addView(textView);
        addallbuttons(this.getString(R.string.fio1), this.getString(R.string.fio2), this.getString(R.string.fio3), this.getString(R.string.fio4), this.getString(R.string.fio5), this.getString(R.string.fio6));


    }
    public  void  addcity(){
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linerlayout);
        linearLayout.removeAllViews();
        TextView textView = new TextView(this);
        textView.setId(R.id.textView);
        textView.setText(R.string.city);
        textView.setGravity(Gravity.CENTER);
        linearLayout.addView(textView);
        addallbuttons(this.getString(R.string.kiev), this.getString(R.string.lvov), this.getString(R.string.kirovograd), this.getString(R.string.moskov), this.getString(R.string.zitomyr), this.getString(R.string.mariupol));


    }
    public void addintent(){
        Intent intent = new Intent(MainActivity.this,MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }
    public void addsecondname(){
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linerlayout);
        linearLayout.removeAllViews();
        TextView textView = new TextView(this);
        textView.setId(R.id.textView);
        textView.setText(R.string.secondname);
        textView.setGravity(Gravity.CENTER);
        linearLayout.addView(textView);
        addallbuttons(this.getString(R.string.sn1), this.getString(R.string.sn2), this.getString(R.string.sn6), this.getString(R.string.sn5), this.getString(R.string.sn4), this.getString(R.string.sn3));



    }
    public void animview(){

        ImageView view = (ImageView)findViewById(R.id.imageView);
        ScaleAnimation sc = new ScaleAnimation(1.0f,0.0f,1.0f,0.0f,1.0f,1.0f);
        sc.setDuration(3000);
        sc.setFillAfter(true);

        view.startAnimation(sc);

    }
    public void  timer(){
        if(cattask !=null){
            cattask.cancel(false);
        }
        cattask = new CatTask();
        cattask.execute();
        animview();

    }
    public  void shake(){
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.r1);
        Animation shakeanimation = AnimationUtils.loadAnimation(this, R.anim.shake);
        relativeLayout.startAnimation(shakeanimation);
    }
    public  void bloods(){
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.r1);
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.smoke);

        relativeLayout.addView(imageView);
       // Animation animationFadeIn = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f,0.0f);
        alphaAnimation.setDuration(5000);
        alphaAnimation.setFillAfter(true);
        imageView.setAnimation(alphaAnimation);
       // imageView.setScaleType(ImageView.ScaleType.FIT_XY);
    }
    private void crack() {
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.r1);
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.mist);

        relativeLayout.addView(imageView);
        // Animation animationFadeIn = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f,1.0f);
        alphaAnimation.setDuration(1000);

        imageView.setAnimation(alphaAnimation);
    }
    private void cracking() {
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.r1);
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.mist);
        relativeLayout.addView(imageView);
        // Animation animationFadeIn = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        //AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f,1.0f);
        //alphaAnimation.setDuration(1000);

       // imageView.setAnimation(alphaAnimation);
    }

    class CatTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

        }

        @Override
        protected Void doInBackground(Void... params) {

            try {
                for(int i = 0;i <2;i++){
                TimeUnit.SECONDS.sleep(1);
                    if (isCancelled()) return null;}
            } catch (InterruptedException e) {
                e.printStackTrace();
           }

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
                TextView textView = (TextView)findViewById(R.id.textView);
                textView.setText(R.string.timer);
            if(scale==0)
            shake();
            if(scale==1)
                bloods();
            if(scale==2)
                crack();
            if(scale==3){
                addterorer();
            count++;}
            scale++;


        }
    }



}
