package kr.co.yhw.loginpage_20200520_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.co.yhw.loginpage_20200520_test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

    }
}
