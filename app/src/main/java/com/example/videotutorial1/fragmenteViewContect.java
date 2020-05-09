package com.example.videotutorial1;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class fragmenteViewContect extends Fragment {
      private static final String TAG="fragmentViewContect";

      private static final int StanderAppBar=0;
      private static final int SearchAppBar=1;
      private int mAppBarState;

    private AppBarLayout viewContectBar,viewSearchBar;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fragmente_view_contect, container, false);

        viewContectBar =view.findViewById(R.id.contactToolbar);
        viewSearchBar=view.findViewById(R.id.searchToolbar);

        setAppBarState(StanderAppBar);



        //Add context floating Action Button Click listner.
        FloatingActionButton addContect=view.findViewById(R.id.addContectFebIcon);
        addContect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"FloatingActionButton:clicked");
            }
        });


        //Add context floating Action Button Click listner.
        ImageView searchIcon=view.findViewById(R.id.search_mag_icon);
        searchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"ToolBar Search Icon:Clicked");
                toggleToolBar();
            }
        });


        ImageView backbtn=view.findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"ToolBar Back Icon:Clicked");
                toggleToolBar();
            }
        });



        return view;
    }

    private void toggleToolBar() {
        if(mAppBarState==StanderAppBar){
            Log.e(TAG,"Stander");
            setAppBarState(SearchAppBar);

        }else{
            Log.e(TAG,"search");

            setAppBarState(StanderAppBar);
        }
    }

    private void setAppBarState(int state) {
        mAppBarState=state;
        if (mAppBarState==StanderAppBar){
            viewSearchBar.setVisibility(View.GONE);
            viewContectBar.setVisibility(View.VISIBLE);
            //hide the keyboard
            View view = getView();
            InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
            try{
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }catch (NullPointerException e){
                Log.d(TAG, "setAppBarState: NullPointerException: " + e.getMessage());
            }



        }
        else if(mAppBarState==SearchAppBar){
            viewContectBar.setVisibility(View.GONE);
            viewSearchBar.setVisibility(View.VISIBLE);

            InputMethodManager imm=(InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.toggleSoftInput(InputMethodManager.SHOW_FORCED,0);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        setAppBarState(StanderAppBar);
    }
}
