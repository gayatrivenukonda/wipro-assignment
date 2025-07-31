package com.javaintro;
import java.util.HashMap;
import java.util.Map;
public class Question15 {
	

	public class ElementFrequencyCounter {
	    public static void main(String[] args) {
	        
	        int[] arr = {3, 5, 3, 7, 8, 5, 3, 7, 9, 5};
	        
	        
	        Map<Integer, Integer> frequencyMap = new HashMap<>();
	        
	        
	        for (int num : arr) {
	            if (frequencyMap.containsKey(num)) {
	                
	                frequencyMap.put(num, frequencyMap.get(num) + 1);
	            } else {
	                
	                frequencyMap.put(num, 1);
	            }
	        }
	        
	        
	        System.out.println("Element : Count");
	        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }
	}
}
	    
	
	


