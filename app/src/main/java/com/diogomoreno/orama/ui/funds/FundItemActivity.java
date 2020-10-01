package com.diogomoreno.orama.ui.funds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.diogomoreno.orama.R;
import com.diogomoreno.orama.ui.funds.item.FundItemFragment;

public class FundItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fund_item_activity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle bundle = getIntent().getExtras();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, FundItemFragment.newInstance(bundle.getLong("fund_resource_id")))
                    .commitNow();
        }
    }


}