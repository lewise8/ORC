package com.orc.offroadcompanion;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    // Called when the user clicks the mainMenuButtonNavigation button
    public void navigationButtonClicked(View view) {
        // Do something in response to button
        Intent intent = new Intent(MainMenuActivity.this, NavigationMenuActivity.class);
        startActivity(intent);
    }

    // Called when the user clicks the mainMenuButtonOrientation button
    public void orientationButtonClicked(View view) {
        // Do something in response to button
        Intent intent = new Intent(MainMenuActivity.this, OrientationActivity.class);
        startActivity(intent);
    }

    // Called when the user clicks the mainMenuButtonInformation button
    public void informationButtonClicked(View view) {
        // Do something in response to button
        Intent intent = new Intent(MainMenuActivity.this, InformationMenuActivity.class);
        startActivity(intent);
    }
}
