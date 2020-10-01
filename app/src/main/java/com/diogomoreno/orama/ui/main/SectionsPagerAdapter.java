package com.diogomoreno.orama.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.diogomoreno.orama.ui.funds.ListaDeFundosFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        for (int i = 0; i < FundosTabs.values().length; i++) {
            if(i == position) {
                FundosTabs fundosTab = FundosTabs.values()[i];
                try {
                    fragment = (Fragment) fundosTab.getaClass().newInstance();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }

            }
        }

        return fragment == null ? PlaceholderFragment.newInstance(position + 1) : fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return FundosTabs.values()[position].getTitle();
    }
    @Override
    public int getCount() {
        // Show 2 total pages.
        return FundosTabs.values().length;
    }

    enum FundosTabs{
//        TOP_FUNDOS("TOp fundos", TopFundosFragment.class),
        LISTA_DE_FUNDOS("Lista de FUndos",ListaDeFundosFragment.class);

        private final String title;
        private final Class<?> aClass;

        FundosTabs(String title, Class<?> aClass) {
            this.title = title;
            this.aClass = aClass;
        }

        public String getTitle() {
            return title;
        }

        public Class<?> getaClass() {
            return aClass;
        }

    }
}