package House;

public class Kitchen {
	
	    public void showAppliances() {
	        String[] appliances = {"Refrigerator", "Microwave", "Oven", "Mixer"};
	        
	        System.out.println("Original appliances array:");
	        for (String app : appliances) {
	            System.out.println(app);
	        }

	        String[] copy = new String[appliances.length];
	        System.arraycopy(appliances, 0, copy, 0, appliances.length);

	        System.out.println("\nCopied appliances array:");
	        for (String app : copy) {
	            System.out.println(app);
	        }
	    }
	}


