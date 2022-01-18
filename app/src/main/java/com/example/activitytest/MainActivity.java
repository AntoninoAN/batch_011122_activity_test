package com.example.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";
    private EditText inputText;

    /**
     * First callback in the Lifecycle.
     * It will be called only ONCE in the Lifecycle.
     * Used for opening connections, opening DB
     * It links the layout XML with this Activity code.
     * setContentView()
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        inputText = findViewById(R.id.et_input);
    }

    /**
     * Called after inflate process completes.
     * Used for modify the content of the view.
     * Your view/layout is visible not interactive.
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    /**
     * Your "running" state.
     * The UI is visible and the user can click on the UI.
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    /**
     * Called when the Activity is going to transition.
     * Your layout is visible but not interactive.
     * Save User data state.
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    /**
     * Your layout is not visible but is still in memory.
     * Used to close connections, dispose files.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    /**
     * Your app is about to be dispose.
     * Sometimes is not invoked.
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    public void navigateToActivity(View view) {
        if (validateInput())
            showToast();
        else {
            Intent moveToActivity = new Intent();
            moveToActivity.setClass(this,
                    ActivityB.class);
            moveToActivity.putExtra("DATA", inputText.getText().toString());
            startActivity(moveToActivity);
        }
    }

    private void showToast() {
        Toast.makeText(this,
                "No empty values",
                Toast.LENGTH_SHORT).show();
    }

    private boolean validateInput(){
        return inputText.getText().toString().isEmpty();
    }
}





