package com.example.android.newhavenfoodspots;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link FoodSpotAdapter} is an {@link android.widget.ArrayAdapter} that provides the layout for
 * each {@link FoodSpot} object in the list.
 */
public class FoodSpotAdapter extends ArrayAdapter<FoodSpot> {

    /**
     * Create a new {@link FoodSpotAdapter} object.
     *
     * @param context   is the current context that the adapter is being created in.
     * @param foodSpots is the list of {@link FoodSpot}s to be displayed.
     */
    public FoodSpotAdapter(Context context, ArrayList<FoodSpot> foodSpots) {
        super(context, 0, foodSpots);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //See if a view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Get the foodspot object located at this position in the list
        FoodSpot currentFoodSpot = getItem(position);

        //Find the ImageView in the list_item.xml layout for the image of the foodspot.
        ImageView imageView = listItemView.findViewById(R.id.image);

        //Get the food spot's name from the currentFoodSpot object and set it on the details TextView
        imageView.setImageResource(currentFoodSpot.getImageResourceId());

        //Find the TextView in the list_item.xml layout for the name of the foodspot.
        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);

        //Get the food spot's name from the currentFoodSpot object and set it on the details TextView
        nameTextView.setText(currentFoodSpot.getNameId());

        //Find the TextView in the list_item.xml layout for the details of the foodspot.
        TextView detailsSpotTextView = listItemView.findViewById(R.id.details_text_view);

        //Get the food spot's name from the currentFoodSpot object and set it on the details TextView
        detailsSpotTextView.setText(currentFoodSpot.getFoodInfo());

        //Return the whole list item layout to be shown in the ListView.
        return listItemView;
    }
}
