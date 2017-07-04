package demo.shree.custommenu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by Admin on 31-05-2017.
 */

public class MenuFragment extends Fragment implements View.OnTouchListener {

    GestureDetector gestureDetector;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.slide_menu, container, false);
        LinearLayout root = (LinearLayout) rootView.findViewById(R.id.rootLayout);
        /*gestureDetector=new GestureDetector(getActivity(),new OnSwipeListener(){

            @Override
            public boolean onSwipe(Direction direction) {
                if (direction==Direction.up){
                    //do your stuff
                    ((MainActivity )  getActivity()).hideFragment();

                }

                if (direction==Direction.down){
                    //do your stuff

                }
                return true;
            }


        });
        root.setOnTouchListener(this);*/
        return rootView;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        gestureDetector.onTouchEvent(event);
        return true;
    }
}
