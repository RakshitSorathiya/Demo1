package demo.android.lifecycledemo;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * Created by ln-149 on 18/1/17.
 */

public class Fragment1 extends Fragment {

    private static final String TAG = Fragment1.class.getSimpleName();
    Button btn_act1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView() called with: inflater = [" + inflater + "], container = [" + container + "], savedInstanceState = [" + savedInstanceState + "]");
        return inflater.inflate(R.layout.fragment1, container, false);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "onViewCreated() called with: view = [" + view + "], savedInstanceState = [" + savedInstanceState + "]");
        btn_act1 = (Button) view.findViewById(R.id.btn_act1);

        btn_act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), MainActivity.class));
            }
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach() called with: context = [" + context + "]");
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate() called with: savedInstanceState = [" + savedInstanceState + "]");
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated() called with: savedInstanceState = [" + savedInstanceState + "]");
    }

    /*@Override
    public void onSaveInstanceState(Bundle outState) {
    }*/

    @Override
    public void onStart()
    {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }

    @Override
    public void onResume()
    {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }

    @Override
    public void onPause()
    {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }

    @Override
    public void onStop()
    {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView() called");
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }

    @Override
    public void onDetach()
    {
        super.onDetach();
        Log.d(TAG, "onDetach() called");
    }


}
