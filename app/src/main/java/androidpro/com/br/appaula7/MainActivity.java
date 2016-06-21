package androidpro.com.br.appaula7;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidpro.com.br.appaula7.R;


public class MainActivity extends ActionBarActivity {

    private ActionBar.Tab mTab1;
    private ActionBar.Tab mTab2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        mTab1 = actionBar.newTab().setText("Tab 1").setTabListener(new
                ExemploTabListener());
        mTab2 = actionBar.newTab().setText("Tab 2").setTabListener(new
                ExemploTabListener());
        actionBar.addTab(mTab1);
        actionBar.addTab(mTab2);

        if (android.os.Build.VERSION.SDK_INT >=
                android.os.Build.VERSION_CODES.HONEYCOMB) {
            // Codigo
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast toast = Toast.makeText(getApplicationContext(), "Opção 1", Toast.
                LENGTH_SHORT);
        switch (item.getItemId()) {
            case R.id.menu_test1:
                toast.setText("Opção 1");
                toast.show();
                return true;
            case R.id.menu_test2:
                toast.setText("Opção 2");
                toast.show();
                return true;
            case R.id.menu_test3:
                toast.setText("Opção 3");
                toast.show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private class ExemploTabListener implements ActionBar.TabListener {

        @Override
        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
        }

        @Override
        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
            Toast toast = Toast.makeText(getApplicationContext(), "Tab", Toast.LENGTH_SHORT);
            if (tab.equals(mTab1)) {
                toast.setText("Tab 1");
                toast.show();
            } else {
                toast.setText("Tab 2");
                toast.show();
            }
        }

        @Override
        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        }
    }
}
