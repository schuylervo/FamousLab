package co.grandcircus.famouslab.model;

import java.util.Comparator;

public class TinyInventorComparator implements Comparator<TinyInventor>{
	

	@Override
	public int compare(TinyInventor a, TinyInventor b) {
		return a.getName().compareTo(b.getName());
	}
}
