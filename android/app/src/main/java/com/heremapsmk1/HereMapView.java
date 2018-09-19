package com.heremapsmk1;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.LinearLayout;

import com.here.android.mpa.common.GeoCoordinate;
import com.here.android.mpa.common.MapSettings;
import com.here.android.mpa.common.OnEngineInitListener;
import com.here.android.mpa.mapping.Map;
import com.here.android.mpa.mapping.MapFragment;

import java.io.File;

public class HereMapView extends LinearLayout {
    private static final String LOG_TAG = "HereMapView.java";

    // map embedded in the map fragment
    public Map map = null;

    // map fragment embedded in this activity
    public MapFragment mapFragment = null;

    public HereMapView(Context context) {
        super(context);

        final Activity activity = (Activity) context;

        inflate(context, R.layout.here_map, this);

        /*mapFragment = (MapFragment) activity.getFragmentManager().findFragmentById(R.id.mapfragment);

        boolean success = MapSettings.setIsolatedDiskCacheRootPath(context.getExternalFilesDir(null) + File.separator + ".here-maps", "com.heremapsmk1.mapservice");
        if (!success) {
            Log.e(LOG_TAG, "Cannot set isolated disk cache root path");
        } else {
            mapFragment.init(new OnEngineInitListener() {
                @Override
                public void onEngineInitializationCompleted(OnEngineInitListener.Error error) {
                    if (error == OnEngineInitListener.Error.NONE) {
                        // retrieve a reference of the map from the map fragment
                        map = mapFragment.getMap();

                        // Set the map center to Conduct
                        map.setCenter(new GeoCoordinate(-37.8078249, 144.9896674, 0.0), Map.Animation.NONE);
                        // Set the zoom level to 14
                        map.setZoomLevel(14);
                    } else {
                        Log.e(LOG_TAG, "Cannot initialize MapFragment (" + error + ")");
                    }
                }
            });
        }*/
    }
}
