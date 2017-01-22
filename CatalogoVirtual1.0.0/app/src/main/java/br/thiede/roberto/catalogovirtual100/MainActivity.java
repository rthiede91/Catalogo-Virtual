package br.thiede.roberto.catalogovirtual100;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import br.thiede.roberto.catalogovirtual100.configs.standardVars;

public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showBusiness()
    {
        Log.i("ShowView","Business Buttons");
        LinearLayout ll1;
        ll1 = (LinearLayout) findViewById(R.id.ll1);
        ll1.removeAllViews();
        ImageButton[] iBtns = new ImageButton[3]; //select no banco business

        for (int i = 0; i < 3; i++)
        {
            iBtns[i] = new ImageButton(this);
            iBtns[i].setImageResource(R.mipmap.ic_launcher);//path no banco
            iBtns[i].setOnClickListener(ClickListener);
            iBtns[i].setBackgroundColor(Color.TRANSPARENT);
            iBtns[i].setTag(i); //id no banco
            iBtns[i].setId(i);  //id no banco

            ll1.addView(iBtns[i]);
        }
    }
    public void showCategories(String businessId)
    {

    }
    public void showProducts(String businessId, String categoriId)
    {

    }

    private View.OnClickListener ClickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            int selected_item = (Integer) v.getTag();
            Log.i("Click","Value: " + v.getTag());
        }
    };
}
