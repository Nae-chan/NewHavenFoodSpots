package com.example.android.newhavenfoodspots;

/**
 * {@link FoodSpot} represents a restaurant that the user can see details about.
 * It contains resource IDs for the restaurant's image, name, and food information.
 */
public class FoodSpot {
    /**
     * Image resource ID for the food spot
     */
    private int mImageResourceId;

    /**
     * String resource ID for the name of the food spot
     */
    private int mNameId;

    /**
     * String resource ID for the food information
     */
    private int mFoodInfo;

    /**
     * Create a new FoodSpot object.
     *
     * @param imageResourceId is the drawable resource ID for the image representing the food spot.
     * @param nameId          is the string resource ID for the name of the food spot.
     * @param foodInfo        is the restaurant's detail.
     */
    public FoodSpot(int imageResourceId, int nameId, int foodInfo) {
        mImageResourceId = imageResourceId;
        mNameId = nameId;
        mFoodInfo = foodInfo;
    }

    /**
     * Get the image resource ID of the food spot.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the string resource ID for the name of the food spot.
     */
    public int getNameId() {
        return mNameId;
    }

    /**
     * Get the string resource ID for the food info of the food spot.
     */
    public int getFoodInfo() {
        return mFoodInfo;
    }
}