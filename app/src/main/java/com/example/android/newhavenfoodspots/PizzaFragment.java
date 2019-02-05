package com.example.android.newhavenfoodspots;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * This Fragment displays Pizza Food spots that users can visit.
 */
public class PizzaFragment extends Fragment {

    public PizzaFragment() {
        //Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {

        View rootView = inflater.inflate(R.layout.food_spot_list, container, false);

        //Create a list of foodSpots
        ArrayList<FoodSpot> foodSpots = new ArrayList<>();
        foodSpots.add(new FoodSpot(R.drawable.bar, R.string.bar_name, R.string.bar_info));
        foodSpots.add(new FoodSpot(R.drawable.pepes, R.string.pepes_pizza_name, R.string.pepes_pizza_info));

        // Create an {@link FoodSpotAdapter} that uses a foodSpots to create each item in a list
        FoodSpotAdapter adapter = new FoodSpotAdapter(getActivity(), foodSpots);

        //Find the ListView object called list in the food_spot_list xml.
        ListView listView = rootView.findViewById(R.id.list);

        //Set the FoodSpotAdapter on the listView to display the list items.
        listView.setAdapter(adapter);

        return rootView;
    }

}
