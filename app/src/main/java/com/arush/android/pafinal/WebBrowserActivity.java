package com.arush.android.pafinal;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class WebBrowserActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_browser);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        editText = (EditText) findViewById(R.id.editText2);

    }

    public void doOpenLink(View view) {
        String urlString = editText.getText().toString();
        //Confirm user input
        if (urlString.length() == 0) {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Please enter URL!");
            alert.setIcon(android.R.drawable.ic_dialog_alert);
            alert.setPositiveButton(android.R.string.ok, null);
            alert.show();
            return;
        }
        Uri uri = Uri.parse(urlString);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(uri);
        startActivity(intent);
    }

    public void doBack(View view) {
        editText.clearComposingText();
        setResult(RESULT_OK);
        finish();
    }
}
