package com.javaintro;
	import java.util.*;

		
		class CD implements Comparable<CD> {
		    String title;
		    String singer;

		    
		    CD(String title, String singer) {
		        this.title = title;
		        this.singer = singer;
		    }

		    
		    @Override
		    public int compareTo(CD other) {
		        return this.singer.compareToIgnoreCase(other.singer);
		    }

		    
		    public void display() {
		        System.out.println("Title: " + title + ", Singer: " + singer);
		    }
		}

		
		public class CDTest {
		    public static void main(String[] args) {
		        
		        List<CD> cds = new ArrayList<>();

		        cds.add(new CD("Melodies", "Sonu Nigam"));
		        cds.add(new CD("Hits", "Arijit Singh"));
		        cds.add(new CD("Love Songs", "Shreya Ghoshal"));
		        cds.add(new CD("Rock Vibes", "KK"));

		        
		        Collections.sort(cds);

		        System.out.println("CDs sorted by singer name:");
		        for (CD cd : cds) {
		            cd.display();
		        }
		    }
		
		}

/*
 CDs sorted by singer name:
Title: Hits, Singer: Arijit Singh
Title: Rock Vibes, Singer: KK
Title: Love Songs, Singer: Shreya Ghoshal
Title: Melodies, Singer: Sonu Nigam
 */
