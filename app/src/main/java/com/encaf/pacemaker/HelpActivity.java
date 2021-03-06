package com.encaf.pacemaker;

import android.content.Intent;
import androidx.core.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;

import com.encaf.pacemaker.views.WebViewActivity;

public class HelpActivity extends WebViewActivity {

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater().inflate(R.menu.help, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            case R.id.action_license_info:
                startActivity(new Intent(this, LicenseInfoActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_help;
    }

    @Override
    protected int getWebViewId() {
        return R.id.help;
    }

    @Override
    protected int getRawResourceId() {
        return R.raw.help;
    }

}
