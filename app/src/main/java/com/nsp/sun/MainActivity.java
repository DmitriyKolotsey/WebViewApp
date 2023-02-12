package com.nsp.sun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button main_activity_bt1, main_activity_bt2, main_activity_bt3, main_activity_bt4, main_activity_bt5;
    ImageView ivLicenseAndCert;

    public static final String main_url = "https://nsp-sun.com/";
    public static final String shop_url = "https://nsp-sun.com/shop/";
    public static final String contacts_url = "https://nsp-sun.com/kontakty-nsp-v-rossii/";
    public static final String blog_url = "https://nsp-sun.com/blog/";
    public static final String reviews_url = "https://nsp-sun.com/otzyvy-nsp/";
    public static final String certificates_url = "https://nsp-sun.com/o-kompanii/sertificaty/";
    public static final String discount_url = "https://nsp-sun.com/partnerstvo/kak-stat-partnerom/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_activity_bt1 = findViewById(R.id.main_activity_bt1);
        main_activity_bt2 = findViewById(R.id.main_activity_bt2);
        main_activity_bt3 = findViewById(R.id.main_activity_bt3);
        main_activity_bt4 = findViewById(R.id.main_activity_bt4);
        main_activity_bt5 = findViewById(R.id.main_activity_bt5);

        ivLicenseAndCert = findViewById(R.id.ivLicenseAndSert);
    }

    public void bt1OnClick(View view) {
        Intent main_intent = new Intent(this, WebViewActivity.class);
        main_intent.setData(Uri.parse(main_url));
        startActivity(main_intent);
    }

    public void bt2OnClick(View view) {
        Intent shop_intent = new Intent(this, WebViewActivity.class);
        shop_intent.setData(Uri.parse(shop_url));
        startActivity(shop_intent);
    }

    public void bt3onClick(View view) {
        Intent discount_intent = new Intent(this, WebViewActivity.class);
        discount_intent.setData(Uri.parse(discount_url));
        startActivity(discount_intent);
    }

    public void bt4OnClick(View view) {
        Intent contacts_intent = new Intent(this, WebViewActivity.class);
        contacts_intent.setData(Uri.parse(contacts_url));
        startActivity(contacts_intent);
    }

    public void bt5OnClick(View view) {
        Intent blog_intent = new Intent(this, WebViewActivity.class);
        blog_intent.setData(Uri.parse(blog_url));
        startActivity(blog_intent);
    }

    public void ivOnClick(View view) {
        Intent certificates_intent = new Intent(this, WebViewActivity.class);
        certificates_intent.setData(Uri.parse(certificates_url));
        startActivity(certificates_intent);
    }
}