package com.uct.cs.idw;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * A dummy fragment representing a section of the app, but that simply
 * displays dummy text.
 */
public class TitledFragment extends Fragment {
	/**
	 * The fragment argument representing the section number for this
	 * fragment.
	 */
	public static final String ARG_SECTION_NUMBER = "section_number";
	public static final String ARG_TITLE = "title";

	public TitledFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main_dummy,
				container, false);
		TextView title = (TextView) rootView
				.findViewById(R.id.section_label);
		//dummyTextView.setText(Integer.toString(getArguments().getInt(ARG_SECTION_NUMBER)));
		title.setText(getArguments().getString(ARG_TITLE));
		title.setTextSize(36);
		return rootView;
	}
}

class LibraryFragment extends TitledFragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		LinearLayout layout = new LinearLayout(getActivity());
		View rootView = super.onCreateView(inflater, container, savedInstanceState);
		//View childView = inflater.inflate(R.layout.fragment_library, container, false);
		
		layout.addView(rootView);
		//layout.addView(childView);
		return layout;
	}
}