package com.example.android.newhavenfoodspots;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that provides the layout for
 * each list item based on the data source of {@link FoodSpot} objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Set Context as the context of the app
     */
    private Context mContext;

    /**
     * Create new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that keeps each fragment's state
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return Fragment that should be displayed at given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CultureFragment();
        } else if (position == 1) {
            return new PizzaFragment();
        } else if (position == 2) {
            return new HealthyFragment();
        } else {
            return new SandwichesFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    /**
     * Update Page title depending on fragment being displayed
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_culture);
        } else if (position == 1) {
            return mContext.getString(R.string.category_pizza);
        } else if (position == 2) {
            return mContext.getString(R.string.category_healthy);
        } else {
            return mContext.getString(R.string.category_sandwich);
        }
    }
}
