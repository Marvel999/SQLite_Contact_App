package com.example.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import com.example.videotutorial1.model.Contect;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

import java.util.List;

public class CustomListAdopter extends ArrayAdapter<Contect> {

    public CustomListAdopter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    public CustomListAdopter(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public CustomListAdopter(@NonNull Context context, int resource, @NonNull Contect[] objects) {
        super(context, resource, objects);
    }

    public CustomListAdopter(@NonNull Context context, int resource, int textViewResourceId, @NonNull Contect[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public CustomListAdopter(@NonNull Context context, int resource, @NonNull List<Contect> objects) {
        super(context, resource, objects);
    }

    public CustomListAdopter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<Contect> objects) {
        super(context, resource, textViewResourceId, objects);
    }
}
