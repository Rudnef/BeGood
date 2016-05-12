package com.example.rudnef.begood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_show_products;
    TextView tv_value;

    Button btn_clean;

    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_10;
    Button btn_11;
    Button btn_12;
    Button btn_13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_show_products = (TextView) findViewById(R.id.tv_show_products);
        tv_value = (TextView) findViewById(R.id.tv_value);

        btn_clean = (Button) findViewById(R.id.btn_clean);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_10 = (Button) findViewById(R.id.btn_10);
        btn_11 = (Button) findViewById(R.id.btn_11);
        btn_12 = (Button) findViewById(R.id.btn_12);
        btn_13 = (Button) findViewById(R.id.btn_13);

        int sum = 0;

        final Food counter = new Food(0);

        final Food water_05 = new Food(100);// вода 0,5 литра
        final Food water_1L = new Food(150);
        final Food cola_05L = new Food(100);
        final Food cola_1L = new Food(150);
        final Food sandwich_whis_chicken = new Food(200);// сэндвич с курицей
        final Food sandwich_whis_bekon = new Food(200);
        final Food sandwich_whis_tunets = new Food(200);
        final Food sandwich_whis_fish = new Food(200);
        final Food soup = new Food(160);



        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_show_products.setText(tv_show_products.getText() + "\n" + btn_1.getText());

                counter.setSum(counter.getSum() + water_05.getValue());
                String sum = String.valueOf(counter.getSum());
                tv_value.setText("Стоимость заказа: " + sum);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_show_products.setText(tv_show_products.getText() + "\n" + btn_2.getText());

                counter.setSum(counter.getSum() + water_1L.getValue());
                String sum = String.valueOf(counter.getSum());
                tv_value.setText("Стоимость заказа: " + sum);
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_show_products.setText(tv_show_products.getText() + "\n" + btn_3.getText());

                counter.setSum(counter.getSum() + cola_05L.getValue());
                String sum = String.valueOf(counter.getSum());
                tv_value.setText("Стоимость заказа: " + sum);
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_show_products.setText(tv_show_products.getText() + "\n" + btn_4.getText());
                counter.setSum(counter.getSum() + cola_1L.getValue());
                String sum = String.valueOf(counter.getSum());

                tv_value.setText("Стоимость заказа: " + sum);
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_show_products.setText(tv_show_products.getText() + "\n" + btn_5.getText());
                counter.setSum(counter.getSum() + sandwich_whis_chicken.getValue());
                String sum = String.valueOf(counter.getSum());
                tv_value.setText("Стоимость заказа: " + sum);
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_show_products.setText(tv_show_products.getText() + "\n" + btn_6.getText());
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_show_products.setText(tv_show_products.getText() + "\n" + btn_7.getText());
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_show_products.setText(tv_show_products.getText() + "\n" + btn_8.getText());
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_show_products.setText(tv_show_products.getText() + "\n" + btn_9.getText());
            }
        });
        btn_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_show_products.setText(tv_show_products.getText() + "\n" + btn_10.getText());
            }
        });
        btn_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_show_products.setText(tv_show_products.getText() + "\n" + btn_11.getText());
            }
        });
        btn_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_show_products.setText(tv_show_products.getText() + "\n" + btn_12.getText());
            }
        });

        btn_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_show_products.setText(tv_show_products.getText() + "\n" + btn_13.getText());
                counter.setSum(counter.getSum() + soup.getValue());
                String sum = String.valueOf(counter.getSum());
                tv_value.setText("Стоимость заказа: " + sum);
            }
        });

        btn_clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_show_products.setText("");
                counter.setSum(counter.getSum() * 0);
                String sum = String.valueOf(counter.getSum());
                tv_value.setText("Стоимость заказа: " + sum);
            }
        });

    }

}
