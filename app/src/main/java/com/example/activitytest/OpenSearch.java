package com.example.activitytest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OpenSearch extends AppCompatActivity {

   private Button btnUpdate;
   private EditText etUpdate;

   @Override
   protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.search_open);
      btnUpdate = findViewById(R.id.btn_update);
      etUpdate = findViewById(R.id.et_update);
      btnUpdate.setOnClickListener(this::returnData);
   }

   private void returnData(View view){
      Intent passDataBack = new Intent();
      passDataBack.putExtra("DataBack",
              etUpdate.getText().toString().isEmpty() ?
                      "Not applicable" :
                      etUpdate.getText().toString());
      setResult(RESULT_OK, passDataBack);

      finish();
   }
}
/*
if (etUpdate.getText().toString().isEMpty)
    return etUpdate.getText().toString()
else
    return "N/A"
 */
