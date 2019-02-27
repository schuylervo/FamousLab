package co.grandcircus.famouslab.model;

import java.util.Comparator;

public class CompleteInventorComparator implements Comparator<CompleteInventor>{
	

	@Override
	public int compare(CompleteInventor a, CompleteInventor b) {
		return a.getFirstName().compareTo(b.getFirstName());
	}
}