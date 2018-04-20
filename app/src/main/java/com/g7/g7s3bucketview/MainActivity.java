package com.g7.g7s3bucketview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String poolId = "";
    public static String region = "";
    public static String bucketName = "";
    private EditText et_currentPassword, et_password, et_retypePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    /**
     * \
     * Initialises the variables
     */
    private void init() {
        et_currentPassword = (EditText) findViewById(R.id.et_email);
        et_password = (EditText) findViewById(R.id.et_password);
        et_retypePassword = (EditText) findViewById(R.id.et_repassword);
        findViewById(R.id.ib_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save();
            }
        });
    }


    /**
     * Receives the xml clicks
     */
    public void save() {
        poolId = et_currentPassword.getText().toString().trim();
        region = et_password.getText().toString().trim();
        bucketName = et_retypePassword.getText().toString().trim();
        if (poolId.length() == 0) {
            Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
        } else if (region.length() == 0) {
            Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
        } else if (bucketName.length() == 0) {
            Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
        } else {
            startActivity(new Intent(MainActivity.this, BucketListActivity.class));
        }
    }


}
