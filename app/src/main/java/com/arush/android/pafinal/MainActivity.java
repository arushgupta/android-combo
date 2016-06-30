package com.arush.android.pafinal;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        listView = new ListView(this);
        setContentView(listView);

        String[] rowNames = {"Flashlight", "AlertDialog.Builder", "Intent.ACTION_DIAL", "Keyboard",
                "Toast", "WebBrowser", "Graphics", "WebView", "BroadcastReceiver", "Service"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1, rowNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);

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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch(position) {
            case 0: {
                Intent intent = new Intent(this, FlashlightActivity.class);
                startActivity(intent);
                break;
            }
            case 1: {
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setTitle("Application by Arush Gupta");
                alert.setIcon(android.R.drawable.ic_dialog_alert);
                alert.setPositiveButton(android.R.string.ok, null);
                alert.show();
                break;
            }
            case 2: {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
                break;
            }
            case 3: {
                Intent intent = new Intent(this, KeyboardActivity.class);
                startActivity(intent);
                break;
            }
            case 4: {
                Toast.makeText(this, "This is a demo of a toast!", Toast.LENGTH_LONG).show();
                break;
            }
            case 5: {
                Intent intent = new Intent(this, WebBrowserActivity.class);
                startActivity(intent);
                break;
            }
            case 6: {
                Intent intent = new Intent(this, GraphicsActivity.class);
                startActivity(intent);
                break;
            }
            case 7: {
                Intent intent = new Intent(this, WebViewActivity.class);
                startActivity(intent);
                break;
            }
            case 8: {
                Intent intent = new Intent(this, BroadcastReceiverActivity.class);
                startActivity(intent);
                break;
            }
            case 9: {
                Intent intent = new Intent(this, ServiceActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
