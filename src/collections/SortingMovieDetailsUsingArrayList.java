package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie{
	int mYear, mPrice;
	String mName;
	public Movie(int mYear, int mPrice, String mName) {
		super();
		this.mYear = mYear;
		this.mPrice = mPrice;
		this.mName = mName;
	}
	@Override
	public String toString() {
		return "Movie [Released Year=" + mYear + ", Ticket Price=" + mPrice + ", Movie Name=" + mName + "]";
	}
}

class SortByMovieName implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.mName.compareTo(o2.mName);
	}
	
}

class SortByMovieYear implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.mYear - o2.mYear;
	}
	
}
class SortByMoviePrice implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.mPrice - o2.mPrice;
	}
	
}
public class SortingMovieDetailsUsingArrayList {

	public static void main(String[] args) {
		ArrayList<Movie> m = new ArrayList<Movie>();
		m.add(new Movie(2018, 80, "Dj"));
		m.add(new Movie(2005, 100, "Dev"));
		m.add(new Movie(2015, 80, "ABCD"));
		m.add(new Movie(1998, 120, "Idiot"));
		m.add(new Movie(2020, 150, "Mehbooba"));
		m.add(new Movie(2019, 100, "Kabhir singh"));

		Collections.sort(m, new SortByMovieName());
		System.out.println("Sort by movie Name");
		
//		Collections.sort(m, new SortByMovieYear());
//		System.out.println("Sort by movie Year");
		
//		Collections.sort(m, new SortByMoviePrice());
//		System.out.println("Sort by movie Price");
		
		for(int i=0; i<m.size(); i++) {
			System.out.println(m.get(i));
		}
	}

}
