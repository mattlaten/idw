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
public class MainFragment extends Fragment {
	/**
	 * The fragment argument representing the section number for this
	 * fragment.
	 */
	public static final String ARG_SECTION_NUMBER = "section_number";
	public static final String ARG_TITLE = "title";

	public MainFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main,
				container, false);
		TextView title = (TextView) rootView
				.findViewById(R.id.section_label);
		//dummyTextView.setText(Integer.toString(getArguments().getInt(ARG_SECTION_NUMBER)));
		title.setText(getArguments().getString(ARG_TITLE));
		title.setTextSize(36);
		return rootView;
	}
	
	public void setTitle(View rootView) {
		TextView title = (TextView) rootView.findViewById(R.id.section_label);
		//dummyTextView.setText(Integer.toString(getArguments().getInt(ARG_SECTION_NUMBER)));
		title.setText(getArguments().getString(ARG_TITLE));
		title.setTextSize(36);
	}
}

class LibraryFragment extends MainFragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_library,container, false);
		setTitle(rootView);
		//View rootView = super.onCreateView(inflater, container, savedInstanceState);
		//ViewGroup body = (ViewGroup) inflater.inflate(R.id.body, container);
		//body.addView(inflater.inflate(R.layout.fragment_library, container, false));
		return rootView;
	}
}

class FriendsFragment extends MainFragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_friends,container, false);
		setTitle(rootView);
		return rootView;
	}
}

class SearchFragment extends MainFragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {		
		View rootView = inflater.inflate(R.layout.fragment_search,container, false);
		setTitle(rootView);
		return rootView;
	}
}

class StoreFragment extends MainFragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_store,container, false);
		setTitle(rootView);
		return rootView;
	}
}

class NotesFragment extends MainFragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_notes,container, false);
		setTitle(rootView);
		return rootView;
	}
}

class ClippingsFragment extends MainFragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_clippings,container, false);
		setTitle(rootView);
		return rootView;
	}
}