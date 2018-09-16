package com.heremapsmk1;


import android.support.annotation.Nullable;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.here.android.mpa.common.GeoCoordinate;
import com.here.android.mpa.mapping.Map;
import com.here.android.mpa.mapping.MapFragment;

public class ReactHereMapManager extends SimpleViewManager<HereMapView> {
    public static final String REACT_CLASS = "HereMapView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public HereMapView createViewInstance(ThemedReactContext context) {
        return new HereMapView(context);
    }

    /*
    @ReactProp(name = "center")
    public void setCenter(HereMapView view, @Nullable ReadableArray params) {
        // Animation = linear, bow, none
        Map.Animation a = Map.Animation.NONE;
        if (params != null) {
            if (params.getString(3).equals("linear"))
                a = Map.Animation.LINEAR;
            else if (params.getString(3).equals("bow"))
                a = Map.Animation.BOW;
        }
        view.map.setCenter(new GeoCoordinate(params.getDouble(0), params.getDouble(1), params.getDouble(2)), a);
    }

    @ReactProp(name = "zoom", defaultInt = 0)
    public void setZoom(HereMapView view, int zoom) {
        // Zoom = 0 to 20
        view.map.setZoomLevel(zoom);
    }*/
}
