package tomerbu.edu.fragmentdemos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment4Boxes extends Fragment {


    private RelativeLayout layout;

    public Fragment4Boxes() {
        // Required empty public constructor
    }

    public static Fragment4Boxes newInstance() {

        Bundle args = new Bundle();

        Fragment4Boxes fragment = new Fragment4Boxes();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_red, container, false);
        layout = (RelativeLayout) v.findViewById(R.id.layout);

        return v;
    }

    public RelativeLayout getLayout() {
        return layout;
    }
}
