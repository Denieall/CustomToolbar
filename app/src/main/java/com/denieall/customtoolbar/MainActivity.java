package com.denieall.customtoolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Set custom toolbar item created in android resource directory(menu) named menu_items.xml
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_items, menu);

        return super.onCreateOptionsMenu(menu);

    }

    // onClick event for the created menu items
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        String title = "";

        if (item.getItemId() == R.id.item1) {
            title = "Add Contact";

            Intent i = new Intent(this, Main2Activity.class);
            i.putExtra("title", title);
            startActivity(i);
        } else if (item.getItemId() == R.id.item2) {
            title = "Edit Contact";

            Intent i = new Intent(this, Main2Activity.class);
            i.putExtra("title", title);
            startActivity(i);
        } else if (item.getItemId() == R.id.item4) {
            title = "Local";

            Intent i = new Intent(this, Main2Activity.class);
            i.putExtra("title", title);
            startActivity(i);
        } else if (item.getItemId() == R.id.item5) {
            title = "Google";

            Intent i = new Intent(this, Main2Activity.class);
            i.putExtra("title", title);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
