package hw;


public class driver {

	public static void main(String[] args) {
		String s = "Hey, you. You're finally awake. You were trying to cross the border, right? "
	    			  + "Walked right into that Imperial ambush, same as us, and that thief over there. "
				      + "Oh Yea! And also the gospel of Luke. I don't want to delete the lines above. HA!";
		int x = 0;
	    
	    for (int i = 0; i < s.length(); ++i) {
	    	char y = s.charAt(i);

	      
	    	if (y == 'a' || 
	    		y == 'e' || 
	    		y == 'i' || 
	    		y == 'o' || 
	    		y == 'u') 
	           {++x;}

	     
	      }
	    System.out.println("There are " + x + " vowels in the first lines of Skyrim plus the last line "
	    		          +"that has the New Testament book.");  
	  }
}
