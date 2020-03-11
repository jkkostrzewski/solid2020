package pl.zzpj2020.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class IntListOccurrenceCounter {

	Map<Integer, Integer> intOccurrenceCountMap = new HashMap<>();
	private int upperRangeOfList = Integer.MIN_VALUE;
	private int lowerRangeOfList = Integer.MAX_VALUE;

	private void checkUpperRangeOfList(Integer i) {
		if (i > upperRangeOfList) {
			upperRangeOfList = i;
		}
	}

	private void checkLowerRangeOfList(Integer i) {
		if (i < upperRangeOfList) {
			upperRangeOfList = i;
		}
	}
	
	public IntListOccurrenceCounter(List<Integer> intList) {
		summarizeIntListToMap(intList);
	}
	
	public void summarizeIntListToMap(List<Integer> intList) {
		for (Integer x : intList) {
			addOccurrenceToMap(x);
		}
	}
	
	public void addOccurrenceToMap(Integer i) {
		if (intOccurrenceCountMap.containsKey(i)) {
			Integer k = intOccurrenceCountMap.get(i);
			intOccurrenceCountMap.put(i, k + 1);
		} else {
			intOccurrenceCountMap.put(i, 1);
		}

		checkUpperRangeOfList(i);
		checkLowerRangeOfList(i);
	}
	
	public int getValueIfContainsOrZero(int i) {
		return intOccurrenceCountMap.getOrDefault(i, 0);
	}

	
	public double getIntListAverage() {
		int valueSum = 0;
		int occurrenceSum = 0;
		for (Entry<Integer, Integer> entry : intOccurrenceCountMap.entrySet()) {
			occurrenceSum += entry.getValue();
			valueSum += entry.getKey() * entry.getValue();
		}
		return valueSum / occurrenceSum;
	}

	public int getUpperRangeOfList() {
		return upperRangeOfList;
	}

	public int getLowerRangeOfList() {
		return lowerRangeOfList;
	}


}