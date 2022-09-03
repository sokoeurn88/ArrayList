package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {
	public static void main(String[] args) {
		
		ArrayList<String> tvSeries =  new ArrayList<String>();
		tvSeries.add("Game of Throne");
		tvSeries.add("Breaking bad");
		tvSeries.add("The Big Bang Theory");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Prison Break");
		
		//for each loop and lambda expression
		tvSeries.forEach(shows -> {
			System.out.println(shows);
		});
		System.out.println("-----------");
		
		//iterator
		Iterator<String> it = tvSeries.iterator();
		while(it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}
		System.out.println("-----------");
		
		//using iterator, lambda and forEachRemaining() method
		it = tvSeries.iterator();
		it.forEachRemaining(show -> {
			System.out.println(show);
		});
		System.out.println("-------------");
		
		//for each loop
		for(String show: tvSeries) {
			System.out.println(show);
		}
		
		System.out.println("-------------");
		//for loop with order/index
		for(int i=0;i<tvSeries.size();i++) {
			System.out.println(tvSeries.get(i));
		}
		
		System.out.println("-------------");
		//using a list iterator() to traverse in both direction
		ListIterator<String> tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());
		while(tvSeriesListIterator.hasPrevious()) {
		String show = tvSeriesListIterator.previous();
		System.out.println(show);
		}
	}

}
