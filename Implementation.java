
package TheatreBooking;
import java.time.Duration;
import java.util.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
public class Implementation extends Theatre{
	String movieTime = "";
	Scanner scan = new Scanner(System.in);
	
	
	
	public void booking(List<String>a11,List<String>b11,List<String>c11,List<String>d11,List<String>e11,List<String>f11,List<String>g11,
			List<String>h11,List<String>j11  , List<String>a12,List<String>b12,List<String>c12,List<String>d12,List<String>e12,List<String>f12,List<String>g12,
			List<String>h12,List<String>j12  ,  List<String>a6,List<String>b6,List<String>c6,List<String>d6,List<String>e6,List<String>f6,List<String>g6,
			List<String>h6,List<String>j6  ,  List<String>a10,List<String>b10,List<String>c10,List<String>d10,List<String>e10,List<String>f10,List<String>g10,
			List<String>h10,List<String>j10) {
		
		
		LocalTime currentTime = LocalTime.now();
		//currentTime = LocalTime.of(11, 19);
		LocalTime timeWithHourAndMinute = currentTime.withSecond(0).withNano(0);
		LocalTime time1 = LocalTime.of(11, 30); 
		LocalTime time2 = LocalTime.of(14, 30); 
		LocalTime time3 = LocalTime.of(18, 30); 
		LocalTime time4 = LocalTime.of(22, 30); 
		//
		
		List<LocalTime> showTime = new ArrayList<>();
		showTime.add(time1);
		showTime.add(time2);
		showTime.add(time3);
		showTime.add(time4);
		//System.out.println(showTime);
		
		int res = 0;
		//for(int i =showTime.size()-1;i>=0; i--) {
		for(int i =0;i<showTime.size(); i++) {
			if(timeWithHourAndMinute.isBefore(showTime.get(i)))  {				 
					res = i;
					break;
			}
			
		}
		
		if(res==0) {
			
			if(timeWithHourAndMinute.isBefore(time1.minusMinutes(10))) {
			System.out.println("WELCOME TO PVR CINEMAS \n");
      		System.out.println("LEO - TAMIL (UA)");
      		System.out.println("------------     ------------     ------------     ------------");
              System.out.println("| 11:30 AM |     | 02:30 PM |     | 06:30 PM |     | 10:30 PM |");
              System.out.println("------------     ------------     ------------     ------------");
              System.out.println();
              /*
              System.out.println("KGF - TAMIL (UA)");
      		System.out.println("------------     ------------     ------------     ------------");
              System.out.println("| 11:30 AM |     | 02:30 PM |     | 06:30 PM |     | 10:30 PM |");
              System.out.println("------------     ------------     ------------     ------------");
              */
			}
			else {
				res = 1;
			}
			
		}
		 if(res==1) {
			
			 if(timeWithHourAndMinute.isBefore(time2.minusMinutes(10))) {
			System.out.println("WELCOME TO PVR CINEMAS \n");
      		System.out.println("LEO - TAMIL (UA)");
			System.out.println("------------     ------------     ------------");
            System.out.println("| 02:30 PM |     | 06:30 PM |     | 10:30 PM |");
            System.out.println("------------     ------------     ------------");
            System.out.println();
            /*
            System.out.println("KGF - TAMIL (UA)");
            System.out.println("------------     ------------     ------------");
            System.out.println("| 02:30 PM |     | 06:30 PM |     | 10:30 PM |");
            System.out.println("------------     ------------     ------------");
            */
			 }
			 else {
					res = 2;
				
				}
		}
		
		 if(res==2) {
			//System.out.println("1 2");
			if(timeWithHourAndMinute.isBefore(time3.minusMinutes(10))) {
			System.out.println("WELCOME TO PVR CINEMAS \n");
      		System.out.println("LEO - TAMIL (UA)");
			System.out.println("------------     ------------");
            System.out.println("| 06:30 PM |     | 10:30 PM |");
            System.out.println("------------     ------------");
            System.out.println();
            /*
            System.out.println("KGF - TAMIL (UA)");
            System.out.println("------------     ------------");
            System.out.println("| 06:30 PM |     | 10:30 PM |");
            System.out.println("------------     ------------");
            */
			}
			else {
				res = 3;
			}
		}
		else if(res==3) {
			 if(timeWithHourAndMinute.isBefore(time4.minusMinutes(10))) {
			//System.out.println("1");
			System.out.println("WELCOME TO PVR CINEMAS \n");
      		System.out.println("LEO - TAMIL (UA)");
			System.out.println("------------");
            System.out.println("| 10:30 PM |");
            System.out.println("----------unrestricted");
            /*
            System.out.println("KGF - TAMIL (UA)");
            System.out.println("------------");
            System.out.println("| 10:30 PM |");
            System.out.println("------------");
            */
			 }

		}
		
		System.out.println();
        System.out.print("ENTER MOVIE NAME :");
        String movieName = scan.next();
        if(movieName.equalsIgnoreCase("LEO") ||movieName.equalsIgnoreCase("KGF")) {
        System.out.print("\nENTER TIMING (HH:MM AM/PM):");
         movieTime = scan.next();
        movieTime+=scan.nextLine();
        movieTime = movieTime.replace(" ", "");
        
      if(movieTime.equalsIgnoreCase("11:30AM")||movieTime.equalsIgnoreCase("02:30PM")|| movieTime.equalsIgnoreCase("06:30PM")|| movieTime.equalsIgnoreCase("10:30PM") ) {
      //	System.out.println("Ok");
      }
      else {
      	System.out.println("THERE IS NO MOVIE ON THAT TIME");
      	System.exit(0);
      }
        }
        
          
        else {
        	System.out.println(movieName+" MOVIE NOT AVAILABLE !");
        	System.exit(0);
        }
        System.out.print("HOW MANY SEATS ? \n");
		int seatCount=  scan.nextInt();
		if(seatCount>10) {
			System.out.println("\nUSERS CAN ONLY SELECT MAXIMUM OF 10 TICKETS");
		}
		
		
		//
		
		System.out.println("----------------------------------------");
		//
		if(movieTime.equalsIgnoreCase("11:30am")) {
		//
		 Iterator <String>ita11 = a11.iterator();
	      int  count = 1;
	       while(ita11.hasNext()) {
	    	   if(count==1)
	    		   System.out.print("A   ");
	    	   if(count==6) {
	    		   System.out.print("");
	    	   }
	    	   count++;
	    	   String val = ita11.next();
	    	   System.out.print(val+" ");
	       }
		//
	       System.out.println();
	       Iterator <String>itb11 = b11.iterator();
	       count=1;
	       while(itb11.hasNext()) {
	    	   if(count==1)
	    		   System.out.print("B   ");
	    	   if(count==6) {
	    		   System.out.print("         ");
	    	   }
	    	   count++;
	    	  
	    	   String val = itb11.next();
	    	   System.out.print(val+" ");
	       }
	       System.out.println();
			
		//
	       Iterator <String>itc11 = c11.iterator();
	       count=1;
	       while(itc11.hasNext()) {
	    	   if(count==1)
	    		   System.out.print("C   ");
	    	   if(count==6) {
	    		   System.out.print("         ");
	    	   }
	    	   count++; 
	    	  
	    	   String val = itc11.next();
	    	   System.out.print(val+" ");
	       }
	       System.out.println();
		//
	       Iterator <String>itd11 = d11.iterator();
	       count=1;
	       while(itd11.hasNext()) {
	    	   if(count==1)
	    		   System.out.print("D   ");
	    	   if(count==6) {
	    		   System.out.print("         ");
	    	   }
	    	   count++;
	    	  
	    	   String val = itd11.next();
	    	   System.out.print(val+" ");
	       }
			System.out.println();
		//
			 Iterator <String>ite11 = e11.iterator();
		       count=1;
		       while(ite11.hasNext()) {
		    	   if(count==1)
		    		   System.out.print("E   ");
		    	   if(count==6) {
		    		   System.out.print("         ");
		    	   }
		    	   count++;
		    	  
		    	   String val = ite11.next();
		    	   System.out.print(val+" ");
		       }
		    
		       System.out.println();
		//
		       Iterator <String>itf11 = f11.iterator();
		       count=1;
		       while(itf11.hasNext()) {
		    	   if(count==1)
		    		   System.out.print("F   ");
		    	   if(count==6) {
		    		   System.out.print("         ");
		    	   }
		    	   count++;
		    	  
		    	   String val = itf11.next();
		    	   System.out.print(val+" ");
		       }
		       
		       System.out.println("\n");
		//
		       Iterator <String>itg11 = g11.iterator();
		       count=1;
		       while(itg11.hasNext()) {
		    	   if(count==1)
		    		   System.out.print("G   ");
		    	   if(count==6) {
		    		   System.out.print("         ");
		    	   }
		    	   count++;
		    	  
		    	   String val = itg11.next();
		    	   System.out.print(val+" ");
		       }
		       
		       System.out.println();

		//
		       Iterator <String>ith11 = h11.iterator();
		       count=1;
		       while(ith11.hasNext()) {
		    	   if(count==1)
		    		   System.out.print("H   ");
		    	   if(count==6) {
		    		   System.out.print("         ");
		    	   }
		    	   count++;
		    	  
		    	   String val = ith11.next();
		    	   System.out.print(val+" ");
		       }
		       System.out.println();
		//
		       Iterator <String>itj11 = j11.iterator();
		       count=1;
		       while(itj11.hasNext()) {
		    	   if(count==1)
		    		   System.out.print("J   ");
		    	   if(count==6) {
		    		   System.out.print("         ");
		    	   }
		    	   count++;
		    	  
		    	   String val = itj11.next();
		    	   System.out.print(val+" ");
		       }
		      
		}
		else if(movieTime.equals("02:30pm")) {
			
			Iterator <String>ita12 = a12.iterator();
		      int  count = 1;
		       while(ita12.hasNext()) {
		    	   if(count==1)
		    		   System.out.print("A   ");
		    	   if(count==6) {
		    		   System.out.print("");
		    	   }
		    	   count++;
		    	   String val = ita12.next();
		    	   System.out.print(val+" ");
		       }
		       //
		       System.out.println();
		       Iterator <String>itb12 = b12.iterator();
		       count=1;
		       while(itb12.hasNext()) {
		    	   if(count==1)
		    		   System.out.print("B   ");
		    	   if(count==6) {
		    		   System.out.print("         ");
		    	   }
		    	   count++;
		    	  
		    	   String val = itb12.next();
		    	   System.out.print(val+" ");
		       }
		       System.out.println();
		       //
		      // System.out.println();
		       Iterator <String>itc12 = c12.iterator();
		       count=1;
		       while(itc12.hasNext()) {
		    	   if(count==1)
		    		   System.out.print("C   ");
		    	   if(count==6) {
		    		   System.out.print("         ");
		    	   }
		    	   count++;
		    	  
		    	   String val = itc12.next();
		    	   System.out.print(val+" ");
		       }
		       System.out.println();
		       //
		       
		       Iterator <String>itd12 = d12.iterator();
		       count=1;
		       while(itd12.hasNext()) {
		    	   if(count==1)
		    		   System.out.print("D   ");
		    	   if(count==6) {
		    		   System.out.print("         ");
		    	   }
		    	   count++;
		    	  
		    	   String val = itd12.next();
		    	   System.out.print(val+" ");
		       }
				System.out.println();
		//
				
				Iterator <String>ite12 = e12.iterator();
			       count=1;
			       while(ite12.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("E   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++;
			    	  
			    	   String val = ite12.next();
			    	   System.out.print(val+" ");
			       }
			    
			       System.out.println();
			       //
			       Iterator <String>itf12 = f12.iterator();
			       count=1;
			       while(itf12.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("F   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++;
			    	  
			    	   String val = itf12.next();
			    	   System.out.print(val+" ");
			       }
			       
			       System.out.println("\n");
			       //
			       Iterator <String>itg12 = g12.iterator();
			       count=1;
			       while(itg12.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("G   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++;
			    	  
			    	   String val = itg12.next();
			    	   System.out.print(val+" ");
			       }
			       
			       System.out.println();
			       //
			       Iterator <String>ith12 = h12.iterator();
			       count=1;
			       while(ith12.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("H   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++;
			    	  
			    	   String val = ith12.next();
			    	   System.out.print(val+" ");
			       }
			       System.out.println();
			       //
			       Iterator <String>itj12 = j12.iterator();
			       count=1;
			       while(itj12.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("J   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++;
			    	  
			    	   String val = itj12.next();
			    	   System.out.print(val+" ");
			       }
			       
		}
		//
		
		else if(movieTime.equalsIgnoreCase("06:30pm")) {
			
			Iterator <String>ita6 = a6.iterator();
		      int  count = 1;
		       while(ita6.hasNext()) {
		    	   if(count==1)
		    		   System.out.print("A   ");
		    	   if(count==6) {
		    		   System.out.print("");
		    	   }
		    	   count++;
		    	   String val = ita6.next();
		    	   System.out.print(val+" ");
		       }
		       //
		       System.out.println();
		       Iterator <String>itb6 = b6.iterator();
		       count=1;
		       while(itb6.hasNext()) {
		    	   if(count==1)
		    		   System.out.print("B   ");
		    	   if(count==6) {
		    		   System.out.print("         ");
		    	   }
		    	   count++;
		    	  
		    	   String val = itb6.next();
		    	   System.out.print(val+" ");
		       }
		      // System.out.println();
		       //
		       System.out.println();
		       Iterator <String>itc6 = c6.iterator();
		       count=1;
		       while(itc6.hasNext()) {
		    	   if(count==1)
		    		   System.out.print("C   ");
		    	   if(count==6) {
		    		   System.out.print("         ");
		    	   }
		    	   count++;
		    	  
		    	   String val = itc6.next();
		    	   System.out.print(val+" ");
		       }
		       System.out.println();
		       //
		       
		       Iterator <String>itd6 = d6.iterator();
		       count=1;
		       while(itd6.hasNext()) {
		    	   if(count==1)
		    		   System.out.print("D   ");
		    	   if(count==6) {
		    		   System.out.print("         ");
		    	   }
		    	   count++;
		    	  
		    	   String val = itd6.next();
		    	   System.out.print(val+" ");
		       }
				System.out.println();
		//
				
				Iterator <String>ite6 = e6.iterator();
			       count=1;
			       while(ite6.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("E   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++;
			    	  
			    	   String val = ite6.next();
			    	   System.out.print(val+" ");
			       }
			    
			       System.out.println();
			       //
			       Iterator <String>itf6 = f6.iterator();
			       count=1;
			       while(itf6.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("F   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++;
			    	  
			    	   String val = itf6.next();
			    	   System.out.print(val+" ");
			       }
			       
			       System.out.println("\n");
			       //
			       Iterator <String>itg6 = g6.iterator();
			       count=1;
			       while(itg6.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("G   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++;
			    	  
			    	   String val = itg6.next();
			    	   System.out.print(val+" ");
			       }
			       
			       System.out.println();
			       //
			       Iterator <String>ith6 = h6.iterator();
			       count=1;
			       while(ith6.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("H   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++;
			    	  
			    	   String val = ith6.next();
			    	   System.out.print(val+" ");
			       }
			       System.out.println();
			       //
			       Iterator <String>itj6 = j6.iterator();
			       count=1;
			       while(itj6.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("J   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++;
			    	  
			    	   String val = itj6.next();
			    	   System.out.print(val+" ");
			       }
			      
		}
		
		//
		else if(movieTime.equalsIgnoreCase("10:30pm")) {
			 
			Iterator <String>ita10 = a10.iterator();
		      int  count = 1;
		       while(ita10.hasNext()) {
		    	   if(count==1)
		    		   System.out.print("A   ");
		    	   if(count==6) {
		    		   System.out.print("");
		    	   }
		    	   count++;
		    	   String val = ita10.next();
		    	   System.out.print(val+" ");
		       }
		       //
		       System.out.println();
		       Iterator <String>itb10 = b10.iterator();
		       count=1;
		       while(itb10.hasNext()) {
		    	   if(count==1)
		    		   System.out.print("B   ");
		    	   if(count==6) {
		    		   System.out.print("         ");
		    	   }
		    	   count++;
		    	  
		    	   String val = itb10.next();
		    	   System.out.print(val+" ");
		       }
		       System.out.println();
		       //
		      // System.out.println();
		       Iterator <String>itc10 = c10.iterator();
		       count=1;
		       while(itc10.hasNext()) {
		    	   if(count==1)
		    		   System.out.print("C   ");
		    	   if(count==6) {
		    		   System.out.print("         ");
		    	   }
		    	   count++;
		    	  
		    	   String val = itc10.next();
		    	   System.out.print(val+" ");
		       }
		       System.out.println();
		       //
		       
		       Iterator <String>itd10 = d10.iterator();
		       count=1;
		       while(itd10.hasNext()) {
		    	   if(count==1)
		    		   System.out.print("D   ");
		    	   if(count==6) {
		    		   System.out.print("         ");
		    	   }
		    	   count++;
		    	  
		    	   String val = itd10.next();
		    	   System.out.print(val+" ");
		       }
				System.out.println();
		//
				
				Iterator <String>ite10 = e10.iterator();
			       count=1;
			       while(ite10.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("E   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++;
			    	  
			    	   String val = ite10.next();
			    	   System.out.print(val+" ");
			       }
			    
			       System.out.println();
			       //
			       Iterator <String>itf10 = f10.iterator();
			       count=1;
			       while(itf10.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("F   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++;
			    	  
			    	   String val = itf10.next();
			    	   System.out.print(val+" ");
			       }
			       
			       System.out.println("\n");
			       //
			       Iterator <String>itg10 = g10.iterator();
			       count=1;
			       while(itg10.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("G   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++;
			    	  
			    	   String val = itg10.next();
			    	   System.out.print(val+" ");
			       }
			       
			       System.out.println();
			       //
			       Iterator <String>ith10 = h10.iterator();
			       count=1;
			       while(ith10.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("H   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++;
			    	  
			    	   String val = ith10.next();
			    	   System.out.print(val+" ");
			       }
			       System.out.println();
			       //
			       Iterator <String>itj10 = j10.iterator();
			       count=1;
			       while(itj10.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("J   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++;
			    	  
			    	   String val = itj10.next();
			    	   System.out.print(val+" ");
			       }
			      
		}
		 System.out.println("\n----------------------------------------");
		//
		
		//
		
		//
		
		//
		       System.out.println();
		System.out.print("\nSELECT YOUR SEAT (A-1 TO A-4)  ");
		String seat = scan.next();
		seat+=scan.nextLine();
			System.out.println();
			System.out.print("TOTAL COST IS :"+120*seatCount+"\n");
			System.out.print("SELECT PAYMENT METHOD \n");
			System.out.print("1. UPI          2. DEBIT CARD\n");
			int paymentMethod = scan.nextInt();
			if(paymentMethod==1||paymentMethod==2) {
				System.out.println("TICKET BOOKED SUCCESSFULLY");
				if(movieTime.equalsIgnoreCase("11:30am") ||movieTime.equalsIgnoreCase("06:30pm") ) {
					System.out.println("--------------------------");
					System.out.print("MOVIE NAME :"+movieName);
					
					System.out.print("\nMOVIE TIME :"+movieTime+"\n");
					System.out.println("SCREEN 2");
					System.out.println("--------------------------");
				}
				else {
					System.out.println("--------------------------");
					System.out.print("MOVIE NAME :"+movieName);
					
					System.out.print("\nMOVIE TIME :"+movieTime+"\n");
					System.out.println("SCREEN 1");
					System.out.println("--------------------------");
				}
			}
			else {
				System.out.println("INVALID PAYMENT METHOD");
			}
		if(seat.charAt(0)=='A' && movieTime.equalsIgnoreCase("11:30am")||seat.charAt(0)=='a' && movieTime.equalsIgnoreCase("11:30am")) {
			System.out.println("IT'S 11:30AM ");
			int one = 0;
	        int two = 0;
	       boolean flag = false;
	        for(int i = 0; i<seat.length(); i++) {
	        	
	        	char ch = seat.charAt(i);
	        	
	        	if(Character.isDigit(ch)) {
	        		if(flag==false) {
	        			one = Character.getNumericValue(ch);
	        			flag = true;
	        		}
	        		else
	        			two = Character.getNumericValue(ch);
	        	}
	        	
	        }
	        
	        //System.out.println("ONE "+one);
	        //System.out.println("TWO "+two);
	        for(int i = one-1; i<two; i++) {
	        	a11.set(i, "#");
	        }
	       // System.out.println(a11);
		}
		else if(seat.charAt(0)=='B' && movieTime.equalsIgnoreCase("11:30am")||seat.charAt(0)=='b' && movieTime.equalsIgnoreCase("11:30am")) {
			
			int one = 0;
	        int two = 0;
	       boolean flag = false;
	        for(int i = 0; i<seat.length(); i++) {
	        	
	        	char ch = seat.charAt(i);
	        	
	        	if(Character.isDigit(ch)) {
	        		if(flag==false) {
	        			one = Character.getNumericValue(ch);
	        			flag = true;
	        		}
	        		else
	        			two = Character.getNumericValue(ch);
	        	}
	        	
	        }
	        for(int i = one-1; i<two; i++) {
	        	b11.set(i, "#");
	        }
	       // System.out.println(b11);
		}
		
		else if(seat.charAt(0)=='C' && movieTime.equalsIgnoreCase("11:30am")||seat.charAt(0)=='c' && movieTime.equalsIgnoreCase("11:30am")) {
			
			int one = 0;
	        int two = 0;
	       boolean flag = false;
	        for(int i = 0; i<seat.length(); i++) {
	        	
	        	char ch = seat.charAt(i);
	        	
	        	if(Character.isDigit(ch)) {
	        		if(flag==false) {
	        			one = Character.getNumericValue(ch);
	        			flag = true;
	        		}
	        		else
	        			two = Character.getNumericValue(ch);
	        	}
	        	
	        }
	        for(int i = one-1; i<two; i++) {
	        	c11.set(i, "#");
	        }
	       // System.out.println(c11);
		}
		else if(seat.charAt(0)=='D' && movieTime.equalsIgnoreCase("11:30am")||seat.charAt(0)=='d' && movieTime.equalsIgnoreCase("11:30am")) {
			
			int one = 0;
	        int two = 0;
	       boolean flag = false;
	        for(int i = 0; i<seat.length(); i++) {
	        	
	        	char ch = seat.charAt(i);
	        	
	        	if(Character.isDigit(ch)) {
	        		if(flag==false) {
	        			one = Character.getNumericValue(ch);
	        			flag = true;
	        		}
	        		else
	        			two = Character.getNumericValue(ch);
	        	}
	        	
	        }
	        for(int i = one-1; i<two; i++) {
	        	d11.set(i, "#");
	        }
	       // System.out.println(d11);
		}
		else if(seat.charAt(0)=='E' && movieTime.equalsIgnoreCase("11:30am")||seat.charAt(0)=='e' && movieTime.equalsIgnoreCase("11:30am")) {
			
			int one = 0;
	        int two = 0;
	       boolean flag = false;
	        for(int i = 0; i<seat.length(); i++) {
	        	
	        	char ch = seat.charAt(i);
	        	
	        	if(Character.isDigit(ch)) {
	        		if(flag==false) {
	        			one = Character.getNumericValue(ch);
	        			flag = true;
	        		}
	        		else
	        			two = Character.getNumericValue(ch);
	        	}
	        	
	        }
	        for(int i = one-1; i<two; i++) {
	        	e11.set(i, "#");
	        }
	       // System.out.println(e11);
		}
		
		else if(seat.charAt(0)=='F' && movieTime.equalsIgnoreCase("11:30am")||seat.charAt(0)=='f' && movieTime.equalsIgnoreCase("11:30am")) {
			
			int one = 0;
	        int two = 0;
	       boolean flag = false;
	        for(int i = 0; i<seat.length(); i++) {
	        	
	        	char ch = seat.charAt(i);
	        	
	        	if(Character.isDigit(ch)) {
	        		if(flag==false) {
	        			one = Character.getNumericValue(ch);
	        			flag = true;
	        		}
	        		else
	        			two = Character.getNumericValue(ch);
	        	}
	        	
	        }
	        for(int i = one-1; i<two; i++) {
	        	f11.set(i, "#");
	        }
	       // System.out.println(f11);
		}
		else if(seat.charAt(0)=='G' && movieTime.equalsIgnoreCase("11:30am")||seat.charAt(0)=='g'&& movieTime.equalsIgnoreCase("11:30am")) {
			
			int one = 0;
	        int two = 0;
	       boolean flag = false;
	        for(int i = 0; i<seat.length(); i++) {
	        	
	        	char ch = seat.charAt(i);
	        	
	        	if(Character.isDigit(ch)) {
	        		if(flag==false) {
	        			one = Character.getNumericValue(ch);
	        			flag = true;
	        		}
	        		else
	        			two = Character.getNumericValue(ch);
	        	}
	        	
	        }
	        for(int i = one-1; i<two; i++) {
	        	g11.set(i, "#");
	        }
	       // System.out.println(g11);
		}
		
		else if(seat.charAt(0)=='H' && movieTime.equalsIgnoreCase("11:30am")||seat.charAt(0)=='h' && movieTime.equalsIgnoreCase("11:30am")) {
			
			int one = 0;
	        int two = 0;
	       boolean flag = false;
	        for(int i = 0; i<seat.length(); i++) {
	        	
	        	char ch = seat.charAt(i);
	        	
	        	if(Character.isDigit(ch)) {
	        		if(flag==false) {
	        			one = Character.getNumericValue(ch);
	        			flag = true;
	        		}
	        		else
	        			two = Character.getNumericValue(ch);
	        	}
	        	
	        }
	        for(int i = one-1; i<two; i++) {
	        	h11.set(i, "#");
	        }
	      //  System.out.println(h11);
		}
		
		else if(seat.charAt(0)=='J' && movieTime.equalsIgnoreCase("11:30am")||seat.charAt(0)=='j' && movieTime.equalsIgnoreCase("11:30am")) {
			
			int one = 0;
	        int two = 0;
	       boolean flag = false;
	        for(int i = 0; i<seat.length(); i++) {
	        	
	        	char ch = seat.charAt(i);
	        	
	        	if(Character.isDigit(ch)) {
	        		if(flag==false) {
	        			one = Character.getNumericValue(ch);
	        			flag = true;
	        		}
	        		else
	        			two = Character.getNumericValue(ch);
	        	}
	        	
	        }
	        for(int i = one-1; i<two; i++) {
	        	j11.set(i, "#");
	        }
	      //  System.out.println(j11);
		}
		System.out.println();
		
		//
		if(seat.charAt(0)=='A' && movieTime.equalsIgnoreCase("02:30pm")||seat.charAt(0)=='a' && movieTime.equalsIgnoreCase("02:30pm")) {
			System.out.println("IT'S 02:30PM ");
			int one = 0;
	        int two = 0;
	       boolean flag = false;
	        for(int i = 0; i<seat.length(); i++) {
	        	
	        	char ch = seat.charAt(i);
	        	
	        	if(Character.isDigit(ch)) {
	        		if(flag==false) {
	        			one = Character.getNumericValue(ch);
	        			flag = true;
	        		}
	        		else
	        			two = Character.getNumericValue(ch);
	        	}
	        	
	        }
	      //  System.out.println("ONE "+one);
	        //System.out.println("TWO "+two);
	        for(int i = one-1; i<two; i++) {
	        	a12.set(i, "#");
	        }
	        //System.out.println(a12);
		}
		//
else if(seat.charAt(0)=='B' && movieTime.equalsIgnoreCase("02:30pm")||seat.charAt(0)=='b' && movieTime.equalsIgnoreCase("02:30pm")) {
			
			int one = 0;
	        int two = 0;
	       boolean flag = false;
	        for(int i = 0; i<seat.length(); i++) {
	        	
	        	char ch = seat.charAt(i);
	        	
	        	if(Character.isDigit(ch)) {
	        		if(flag==false) {
	        			one = Character.getNumericValue(ch);
	        			flag = true;
	        		}
	        		else
	        			two = Character.getNumericValue(ch);
	        	}
	        	
	        }
	        for(int i = one-1; i<two; i++) {
	        	b12.set(i, "#");
	        }
	       // System.out.println(b12);
		}
		//
else if(seat.charAt(0)=='C' && movieTime.equalsIgnoreCase("02:30pm")||seat.charAt(0)=='c' && movieTime.equalsIgnoreCase("02:30pm")) {
	
	int one = 0;
    int two = 0;
   boolean flag = false;
    for(int i = 0; i<seat.length(); i++) {
    	
    	char ch = seat.charAt(i);
    	
    	if(Character.isDigit(ch)) {
    		if(flag==false) {
    			one = Character.getNumericValue(ch);
    			flag = true;
    		}
    		else
    			two = Character.getNumericValue(ch);
    	}
    	
    }
    for(int i = one-1; i<two; i++) {
    	c12.set(i, "#");
    }
   // System.out.println(c12);
}
		//
else if(seat.charAt(0)=='D' && movieTime.equalsIgnoreCase("02:30pm")||seat.charAt(0)=='d' && movieTime.equalsIgnoreCase("02:30pm")) {
	
	int one = 0;
    int two = 0;
   boolean flag = false;
    for(int i = 0; i<seat.length(); i++) {
    	
    	char ch = seat.charAt(i);
    	
    	if(Character.isDigit(ch)) {
    		if(flag==false) {
    			one = Character.getNumericValue(ch);
    			flag = true;
    		}
    		else
    			two = Character.getNumericValue(ch);
    	}
    	
    }
    for(int i = one-1; i<two; i++) {
    	d12.set(i, "#");
    }
   // System.out.println(d12);
}
		//
else if(seat.charAt(0)=='E' && movieTime.equalsIgnoreCase("02:30pm")||seat.charAt(0)=='e' && movieTime.equalsIgnoreCase("02:30pm")) {
	
	int one = 0;
    int two = 0;
   boolean flag = false;
    for(int i = 0; i<seat.length(); i++) {
    	
    	char ch = seat.charAt(i);
    	
    	if(Character.isDigit(ch)) {
    		if(flag==false) {
    			one = Character.getNumericValue(ch);
    			flag = true;
    		}
    		else
    			two = Character.getNumericValue(ch);
    	}
    	
    }
    for(int i = one-1; i<two; i++) {
    	e12.set(i, "#");
    }
   // System.out.println(e12);
}
		//
else if(seat.charAt(0)=='F' && movieTime.equalsIgnoreCase("02:30pm")||seat.charAt(0)=='f' && movieTime.equalsIgnoreCase("02:30pm")) {
	
	int one = 0;
    int two = 0;
   boolean flag = false;
    for(int i = 0; i<seat.length(); i++) {
    	
    	char ch = seat.charAt(i);
    	
    	if(Character.isDigit(ch)) {
    		if(flag==false) {
    			one = Character.getNumericValue(ch);
    			flag = true;
    		}
    		else
    			two = Character.getNumericValue(ch);
    	}
    	
    }
    for(int i = one-1; i<two; i++) {
    	f12.set(i, "#");
    }
   // System.out.println(f12);
}
//
else if(seat.charAt(0)=='G' && movieTime.equalsIgnoreCase("02:30pm")||seat.charAt(0)=='g'&& movieTime.equalsIgnoreCase("02:30pm")) {
	
	int one = 0;
    int two = 0;
   boolean flag = false;
    for(int i = 0; i<seat.length(); i++) {
    	
    	char ch = seat.charAt(i);
    	
    	if(Character.isDigit(ch)) {
    		if(flag==false) {
    			one = Character.getNumericValue(ch);
    			flag = true;
    		}
    		else
    			two = Character.getNumericValue(ch);
    	}
    	
    }
    for(int i = one-1; i<two; i++) {
    	g12.set(i, "#");
    }
   // System.out.println(g12);
}
		//
		
		
		else if(seat.charAt(0)=='H' && movieTime.equalsIgnoreCase("02:30pm")||seat.charAt(0)=='h' && movieTime.equalsIgnoreCase("02:30pm")) {
			
			int one = 0;
	        int two = 0;
	       boolean flag = false;
	        for(int i = 0; i<seat.length(); i++) {
	        	
	        	char ch = seat.charAt(i);
	        	
	        	if(Character.isDigit(ch)) {
	        		if(flag==false) {
	        			one = Character.getNumericValue(ch);
	        			flag = true;
	        		}
	        		else
	        			two = Character.getNumericValue(ch);
	        	}
	        	
	        }
	        for(int i = one-1; i<two; i++) {
	        	h12.set(i, "#");
	        }
	      //  System.out.println(h12);
		}
		// 
		else if(seat.charAt(0)=='J' && movieTime.equalsIgnoreCase("02:30pm")||seat.charAt(0)=='j' && movieTime.equalsIgnoreCase("02:30pm")) {
			
			int one = 0;
	        int two = 0;
	       boolean flag = false;
	        for(int i = 0; i<seat.length(); i++) {
	        	
	        	char ch = seat.charAt(i);
	        	
	        	if(Character.isDigit(ch)) {
	        		if(flag==false) {
	        			one = Character.getNumericValue(ch);
	        			flag = true;
	        		}
	        		else
	        			two = Character.getNumericValue(ch);
	        	}
	        	
	        }
	        for(int i = one-1; i<two; i++) {
	        	j12.set(i, "#");
	        }
	      //  System.out.println(j12);
		}
		System.out.println();
		
		// 06 : 30 PM
		 if(seat.charAt(0)=='A' && movieTime.equalsIgnoreCase("06:30pm")||seat.charAt(0)=='a' && movieTime.equalsIgnoreCase("06:30pm")) {
			
			int one = 0;
	        int two = 0;
	       boolean flag = false;
	        for(int i = 0; i<seat.length(); i++) {
	        	
	        	char ch = seat.charAt(i);
	        	
	        	if(Character.isDigit(ch)) {
	        		if(flag==false) {
	        			one = Character.getNumericValue(ch);
	        			flag = true;
	        		}
	        		else
	        			two = Character.getNumericValue(ch);
	        	}
	        	
	        }
	        for(int i = one-1; i<two; i++) {
	        	a6.set(i, "#");
	        }
	       // System.out.println(a6);
		}
		 //
		 
		 else if(seat.charAt(0)=='B' && movieTime.equalsIgnoreCase("06:30pm")||seat.charAt(0)=='b' && movieTime.equalsIgnoreCase("06:30pm")) {
				
				int one = 0;
		        int two = 0;
		       boolean flag = false;
		        for(int i = 0; i<seat.length(); i++) {
		        	
		        	char ch = seat.charAt(i);
		        	
		        	if(Character.isDigit(ch)) {
		        		if(flag==false) {
		        			one = Character.getNumericValue(ch);
		        			flag = true;
		        		}
		        		else
		        			two = Character.getNumericValue(ch);
		        	}
		        	
		        }
		        for(int i = one-1; i<two; i++) {
		        	b6.set(i, "#");
		        }
		     //   System.out.println(b6);
			}
		//
		 else if(seat.charAt(0)=='C' && movieTime.equalsIgnoreCase("06:30pm")||seat.charAt(0)=='c' && movieTime.equalsIgnoreCase("06:30pm")) {
				
				int one = 0;
		        int two = 0;
		       boolean flag = false;
		        for(int i = 0; i<seat.length(); i++) {
		        	
		        	char ch = seat.charAt(i);
		        	
		        	if(Character.isDigit(ch)) {
		        		if(flag==false) {
		        			one = Character.getNumericValue(ch);
		        			flag = true;
		        		}
		        		else
		        			two = Character.getNumericValue(ch);
		        	}
		        	
		        }
		        for(int i = one-1; i<two; i++) {
		        	c6.set(i, "#");
		        }
		      //  System.out.println(c6);
			}
		 //
		 else if(seat.charAt(0)=='D' && movieTime.equalsIgnoreCase("06:30pm")||seat.charAt(0)=='d' && movieTime.equalsIgnoreCase("06:30pm")) {
				
				int one = 0;
		        int two = 0;
		       boolean flag = false;
		        for(int i = 0; i<seat.length(); i++) {
		        	
		        	char ch = seat.charAt(i);
		        	
		        	if(Character.isDigit(ch)) {
		        		if(flag==false) {
		        			one = Character.getNumericValue(ch);
		        			flag = true;
		        		}
		        		else
		        			two = Character.getNumericValue(ch);
		        	}
		        	
		        }
		        for(int i = one-1; i<two; i++) {
		        	d6.set(i, "#");
		        }
		      //  System.out.println(d6);
			}
		 //
		 
		 else if(seat.charAt(0)=='E' && movieTime.equalsIgnoreCase("06:30pm")||seat.charAt(0)=='e' && movieTime.equalsIgnoreCase("06:30pm")) {
				
				int one = 0;
		        int two = 0;
		       boolean flag = false;
		        for(int i = 0; i<seat.length(); i++) {
		        	
		        	char ch = seat.charAt(i);
		        	
		        	if(Character.isDigit(ch)) {
		        		if(flag==false) {
		        			one = Character.getNumericValue(ch);
		        			flag = true;
		        		}
		        		else
		        			two = Character.getNumericValue(ch);
		        	}
		        	
		        }
		        for(int i = one-1; i<two; i++) {
		        	e6.set(i, "#");
		        }
		      //  System.out.println(e6);
			}
		 //
		 else if(seat.charAt(0)=='F' && movieTime.equalsIgnoreCase("06:30pm")||seat.charAt(0)=='f' && movieTime.equalsIgnoreCase("06:30pm")) {
				
				int one = 0;
		        int two = 0;
		       boolean flag = false;
		        for(int i = 0; i<seat.length(); i++) {
		        	
		        	char ch = seat.charAt(i);
		        	
		        	if(Character.isDigit(ch)) {
		        		if(flag==false) {
		        			one = Character.getNumericValue(ch);
		        			flag = true;
		        		}
		        		else
		        			two = Character.getNumericValue(ch);
		        	}
		        	
		        }
		        for(int i = one-1; i<two; i++) {
		        	f6.set(i, "#");
		        }
		       // System.out.println(f6);
			}
		 //
		 else if(seat.charAt(0)=='G' && movieTime.equalsIgnoreCase("06:30pm")||seat.charAt(0)=='g' && movieTime.equalsIgnoreCase("06:30pm")) {
				
				int one = 0;
		        int two = 0;
		       boolean flag = false;
		        for(int i = 0; i<seat.length(); i++) {
		        	
		        	char ch = seat.charAt(i);
		        	
		        	if(Character.isDigit(ch)) {
		        		if(flag==false) {
		        			one = Character.getNumericValue(ch);
		        			flag = true;
		        		}
		        		else
		        			two = Character.getNumericValue(ch);
		        	}
		        	
		        }
		        for(int i = one-1; i<two; i++) {
		        	g6.set(i, "#");
		        }
		       // System.out.println(g6);
			}
		 //
		 else if(seat.charAt(0)=='H' && movieTime.equalsIgnoreCase("06:30pm")||seat.charAt(0)=='h' && movieTime.equalsIgnoreCase("06:30pm")) {
				
				int one = 0;
		        int two = 0;
		       boolean flag = false;
		        for(int i = 0; i<seat.length(); i++) {
		        	
		        	char ch = seat.charAt(i);
		        	
		        	if(Character.isDigit(ch)) {
		        		if(flag==false) {
		        			one = Character.getNumericValue(ch);
		        			flag = true;
		        		}
		        		else
		        			two = Character.getNumericValue(ch);
		        	}
		        	
		        }
		        for(int i = one-1; i<two; i++) {
		        	h6.set(i, "#");
		        }
		      //  System.out.println(h6);
			}
		 //
		 else if(seat.charAt(0)=='J' && movieTime.equalsIgnoreCase("06:30pm")||seat.charAt(0)=='j' && movieTime.equalsIgnoreCase("06:30pm")) {
				
				int one = 0;
		        int two = 0;
		       boolean flag = false;
		        for(int i = 0; i<seat.length(); i++) {
		        	
		        	char ch = seat.charAt(i);
		        	
		        	if(Character.isDigit(ch)) {
		        		if(flag==false) {
		        			one = Character.getNumericValue(ch);
		        			flag = true;
		        		}
		        		else
		        			two = Character.getNumericValue(ch);
		        	}
		        	
		        }
		        for(int i = one-1; i<two; i++) {
		        	j6.set(i, "#");
		        }
		      //  System.out.println(j6);
			}
		 // 10:30
		  if(seat.charAt(0)=='A' && movieTime.equalsIgnoreCase("10:30pm")||seat.charAt(0)=='a' && movieTime.equalsIgnoreCase("10:30pm")) {
				
				int one = 0;
		        int two = 0;
		       boolean flag = false;
		        for(int i = 0; i<seat.length(); i++) {
		        	
		        	char ch = seat.charAt(i);
		        	
		        	if(Character.isDigit(ch)) {
		        		if(flag==false) {
		        			one = Character.getNumericValue(ch);
		        			flag = true;
		        		}
		        		else
		        			two = Character.getNumericValue(ch);
		        	}
		        	
		        }
		        for(int i = one-1; i<two; i++) {
		        	a10.set(i, "#");
		        }
		      //  System.out.println(a10);
			}
		  //
		  else  if(seat.charAt(0)=='B' && movieTime.equalsIgnoreCase("10:30pm")||seat.charAt(0)=='b' && movieTime.equalsIgnoreCase("10:30pm")) {
				
				int one = 0;
		        int two = 0;
		       boolean flag = false;
		        for(int i = 0; i<seat.length(); i++) {
		        	
		        	char ch = seat.charAt(i);
		        	
		        	if(Character.isDigit(ch)) {
		        		if(flag==false) {
		        			one = Character.getNumericValue(ch);
		        			flag = true;
		        		}
		        		else
		        			two = Character.getNumericValue(ch);
		        	}
		        	
		        }
		        for(int i = one-1; i<two; i++) {
		        	b10.set(i, "#");
		        }
		      ///  System.out.println(b10);
			}

		  //
		  else  if(seat.charAt(0)=='C' && movieTime.equalsIgnoreCase("10:30pm")||seat.charAt(0)=='c' && movieTime.equalsIgnoreCase("10:30pm")) {
				
				int one = 0;
		        int two = 0;
		       boolean flag = false;
		        for(int i = 0; i<seat.length(); i++) {
		        	
		        	char ch = seat.charAt(i);
		        	
		        	if(Character.isDigit(ch)) {
		        		if(flag==false) {
		        			one = Character.getNumericValue(ch);
		        			flag = true;
		        		}
		        		else
		        			two = Character.getNumericValue(ch);
		        	}
		        	
		        }
		        for(int i = one-1; i<two; i++) {
		        	c10.set(i, "#");
		        }
		       // System.out.println(c10);
			}
		  //
		  else  if(seat.charAt(0)=='D' && movieTime.equalsIgnoreCase("10:30pm")||seat.charAt(0)=='d' && movieTime.equalsIgnoreCase("10:30pm")) {
				
				int one = 0;
		        int two = 0;
		       boolean flag = false;
		        for(int i = 0; i<seat.length(); i++) {
		        	
		        	char ch = seat.charAt(i);
		        	
		        	if(Character.isDigit(ch)) {
		        		if(flag==false) {
		        			one = Character.getNumericValue(ch);
		        			flag = true;
		        		}
		        		else
		        			two = Character.getNumericValue(ch);
		        	}
		        	
		        }
		        for(int i = one-1; i<two; i++) {
		        	d10.set(i, "#");
		        }
		       // System.out.println(d10);
			}
		  //
		  else  if(seat.charAt(0)=='E' && movieTime.equalsIgnoreCase("10:30pm")||seat.charAt(0)=='e' && movieTime.equalsIgnoreCase("10:30pm")) {
				
				int one = 0;
		        int two = 0;
		       boolean flag = false;
		        for(int i = 0; i<seat.length(); i++) {
		        	
		        	char ch = seat.charAt(i);
		        	
		        	if(Character.isDigit(ch)) {
		        		if(flag==false) {
		        			one = Character.getNumericValue(ch);
		        			flag = true;
		        		}
		        		else
		        			two = Character.getNumericValue(ch);
		        	}
		        	
		        }
		        for(int i = one-1; i<two; i++) {
		        	e10.set(i, "#");
		        }
		      //  System.out.println(e10);
			}
		  //
		  else  if(seat.charAt(0)=='F' && movieTime.equalsIgnoreCase("10:30pm")||seat.charAt(0)=='f' && movieTime.equalsIgnoreCase("10:30pm")) {
				
				int one = 0;
		        int two = 0;
		       boolean flag = false;
		        for(int i = 0; i<seat.length(); i++) {
		        	
		        	char ch = seat.charAt(i);
		        	
		        	if(Character.isDigit(ch)) {
		        		if(flag==false) {
		        			one = Character.getNumericValue(ch);
		        			flag = true;
		        		}
		        		else
		        			two = Character.getNumericValue(ch);
		        	}
		        	
		        }
		        for(int i = one-1; i<two; i++) {
		        	f10.set(i, "#");
		        }
		      //  System.out.println(f10);
			}
		  //
		  else  if(seat.charAt(0)=='G' && movieTime.equalsIgnoreCase("10:30pm")||seat.charAt(0)=='g' && movieTime.equalsIgnoreCase("10:30pm")) {
				
				int one = 0;
		        int two = 0;
		       boolean flag = false;
		        for(int i = 0; i<seat.length(); i++) {
		        	
		        	char ch = seat.charAt(i);
		        	
		        	if(Character.isDigit(ch)) {
		        		if(flag==false) {
		        			one = Character.getNumericValue(ch);
		        			flag = true;
		        		}
		        		else
		        			two = Character.getNumericValue(ch);
		        	}
		        	
		        }
		        for(int i = one-1; i<two; i++) {
		        	g10.set(i, "#");
		        }
		       // System.out.println(g10);
			}
		  	//
		  else  if(seat.charAt(0)=='H' && movieTime.equalsIgnoreCase("10:30pm")||seat.charAt(0)=='h' && movieTime.equalsIgnoreCase("10:30pm")) {
				
				int one = 0;
		        int two = 0;
		       boolean flag = false;
		        for(int i = 0; i<seat.length(); i++) {
		        	
		        	char ch = seat.charAt(i);
		        	
		        	if(Character.isDigit(ch)) {
		        		if(flag==false) {
		        			one = Character.getNumericValue(ch);
		        			flag = true;
		        		}
		        		else
		        			two = Character.getNumericValue(ch);
		        	}
		        	
		        }
		        for(int i = one-1; i<two; i++) {
		        	h10.set(i, "#");
		        }
		       // System.out.println(h10);
			}
		  //
		  else  if(seat.charAt(0)=='J' && movieTime.equalsIgnoreCase("10:30pm")||seat.charAt(0)=='j' && movieTime.equalsIgnoreCase("10:30pm")) {
				
				int one = 0;
		        int two = 0; 
		       boolean flag = false;
		        for(int i = 0; i<seat.length(); i++) {
		        	
		        	char ch = seat.charAt(i);
		        	
		        	if(Character.isDigit(ch)) {
		        		if(flag==false) {
		        			one = Character.getNumericValue(ch);
		        			flag = true;
		        		}
		        		else
		        			two = Character.getNumericValue(ch);
		        	}
		        	
		        }
		        for(int i = one-1; i<two; i++) {
		        	j10.set(i, "#");
		        }
		       // System.out.println(j10);
			}



		//
       
		
		}   
	public void nextShow(List<String>a11,List<String>b11,List<String>c11,List<String>d11,List<String>e11,List<String>f11,List<String>g11,
			List<String>h11,List<String>j11  , List<String>a12,List<String>b12,List<String>c12,List<String>d12,List<String>e12,List<String>f12,List<String>g12,
			List<String>h12,List<String>j12  ,  List<String>a6,List<String>b6,List<String>c6,List<String>d6,List<String>e6,List<String>f6,List<String>g6,
			List<String>h6,List<String>j6  ,  List<String>a10,List<String>b10,List<String>c10,List<String>d10,List<String>e10,List<String>f10,List<String>g10,
			List<String>h10,List<String>j10) {
		
		LocalTime currentTime = LocalTime.now();
		currentTime = LocalTime.of(10, 30);
		LocalTime timeWithHourAndMinute = currentTime.withSecond(0).withNano(0);
		LocalTime time1 = LocalTime.of(11, 30); 
		LocalTime time2 = LocalTime.of(14, 30); 
		LocalTime time3 = LocalTime.of(18, 30); 
		LocalTime time4 = LocalTime.of(22, 30); 
		
		List<LocalTime> showTime = new ArrayList<>();
		showTime.add(time1);
		showTime.add(time2);
		showTime.add(time3);
		showTime.add(time4);
		
		int res = 0;
		//for(int i =showTime.size()-1;i>=0; i--) {
		for(int i =0;i<showTime.size(); i++) {
			if(timeWithHourAndMinute.isBefore(showTime.get(i)))  {				 
					res = i;
					break;
			}
			
		}
		
		if(res==0) {
			//System.out.println("1 2 3 4 ");
			System.out.println("WELCOME TO PVR CINEMAS \n");
      		System.out.println("LEO - TAMIL (UA)");
      		System.out.println("------------     ------------     ------------     ------------");
              System.out.println("| 11:30 AM |     | 02:30 PM |     | 06:30 PM |     | 10:30 PM |");
              System.out.println("------------     ------------     ------------     ------------");
              System.out.println();
              /*
              System.out.println("KGF - TAMIL (UA)");
      		System.out.println("------------     ------------     ------------     ------------");
              System.out.println("| 11:30 AM |     | 02:30 PM |     | 06:30 PM |     | 10:30 PM |");
              System.out.println("------------     ------------     ------------     ------------");
              */
			
		}
		else if(res==1) {
			//System.out.println("1 2 3");
			System.out.println("WELCOME TO PVR CINEMAS \n");
      		System.out.println("LEO - TAMIL (UA)");
			System.out.println("------------     ------------     ------------");
            System.out.println("| 02:30 PM |     | 06:30 PM |     | 10:30 PM |");
            System.out.println("------------     ------------     ------------");
            System.out.println();
            /*
            System.out.println("KGF - TAMIL (UA)");
            System.out.println("------------     ------------     ------------");
            System.out.println("| 02:30 PM |     | 06:30 PM |     | 10:30 PM |");
            System.out.println("------------     ------------     ------------");
            */
		}
		
		else if(res==2) {
			//System.out.println("1 2");
			System.out.println("WELCOME TO PVR CINEMAS \n");
      		System.out.println("LEO - TAMIL (UA)");
			System.out.println("------------     ------------");
            System.out.println("| 06:30 PM |     | 10:30 PM |");
            System.out.println("------------     ------------");
            System.out.println();
            /*
            System.out.println("KGF - TAMIL (UA)");
            System.out.println("------------     ------------");
            System.out.println("| 06:30 PM |     | 10:30 PM |");
            System.out.println("------------     ------------");
            */
		}
		else if(res==3) {
			//System.out.println("1");
			System.out.println("WELCOME TO PVR CINEMAS \n");
      		System.out.println("LEO - TAMIL (UA)");
			System.out.println("------------");
            System.out.println("| 10:30 PM |");
            System.out.println("------------");
            System.out.println();
            /*
            System.out.println("KGF - TAMIL (UA)");
            System.out.println("------------");
            System.out.println("| 10:30 PM |");
            System.out.println("------------");
            */

		}
		System.out.print("ENTER MOVIE NAME :  ");
		String movieName = scan.next();
		movieName+=scan.nextLine();
		if(movieName.equals("leo")||movieName.equals("LEO")) {
			
			System.out.print("\nENTER MOVIE TIMING :");
			String movieTime = scan.next();
			movieTime+=scan.nextLine();
			movieTime = movieTime.replace(" ", "");
			System.out.println("\n----------------------------------------");
			if(movieTime.equalsIgnoreCase("11:30am")) {
				
				Iterator <String>ita11 = a11.iterator();
			      int  count = 1;
			       while(ita11.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("A   ");
			    	   if(count==6) {
			    		   System.out.print("");
			    	   }
			    	   count++;
			    	   String val = ita11.next();
			    	   System.out.print(val+" ");
			       }
				//
			       System.out.println();
			       Iterator <String>itb11 = b11.iterator();
			       count=1;
			       while(itb11.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("B   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++;
			    	  
			    	   String val = itb11.next();
			    	   System.out.print(val+" ");
			       }
			       System.out.println();
					
				//
			       Iterator <String>itc11 = c11.iterator();
			       count=1;
			       while(itc11.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("C   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++; 
			    	  
			    	   String val = itc11.next();
			    	   System.out.print(val+" ");
			       }
			       System.out.println();
				//
			       Iterator <String>itd11 = d11.iterator();
			       count=1;
			       while(itd11.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("D   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++;
			    	  
			    	   String val = itd11.next();
			    	   System.out.print(val+" ");
			       }
					System.out.println();
				//
					 Iterator <String>ite11 = e11.iterator();
				       count=1;
				       while(ite11.hasNext()) {
				    	   if(count==1)
				    		   System.out.print("E   ");
				    	   if(count==6) {
				    		   System.out.print("         ");
				    	   }
				    	   count++;
				    	  
				    	   String val = ite11.next();
				    	   System.out.print(val+" ");
				       }
				    
				       System.out.println();
				//
				       Iterator <String>itf11 = f11.iterator();
				       count=1;
				       while(itf11.hasNext()) {
				    	   if(count==1)
				    		   System.out.print("F   ");
				    	   if(count==6) {
				    		   System.out.print("         ");
				    	   }
				    	   count++;
				    	  
				    	   String val = itf11.next();
				    	   System.out.print(val+" ");
				       }
				       
				       System.out.println("\n");
				//
				       Iterator <String>itg11 = g11.iterator();
				       count=1;
				       while(itg11.hasNext()) {
				    	   if(count==1)
				    		   System.out.print("G   ");
				    	   if(count==6) {
				    		   System.out.print("         ");
				    	   }
				    	   count++;
				    	  
				    	   String val = itg11.next();
				    	   System.out.print(val+" ");
				       }
				       
				       System.out.println();

				//
				       Iterator <String>ith11 = h11.iterator();
				       count=1;
				       while(ith11.hasNext()) {
				    	   if(count==1)
				    		   System.out.print("H   ");
				    	   if(count==6) {
				    		   System.out.print("         ");
				    	   }
				    	   count++;
				    	  
				    	   String val = ith11.next();
				    	   System.out.print(val+" ");
				       }
				       System.out.println();
				//
				       Iterator <String>itj11 = j11.iterator();
				       count=1;
				       while(itj11.hasNext()) {
				    	   if(count==1)
				    		   System.out.print("J   ");
				    	   if(count==6) {
				    		   System.out.print("         ");
				    	   }
				    	   count++;
				    	  
				    	   String val = itj11.next();
				    	   System.out.print(val+" ");
				       }
				       
			}
			else if(movieTime.equalsIgnoreCase("02:30pm")) {
				
				 
					Iterator <String>ita12 = a12.iterator();
				      int  count = 1;
				       while(ita12.hasNext()) {
				    	   if(count==1)
				    		   System.out.print("A   ");
				    	   if(count==6) {
				    		   System.out.print("");
				    	   }
				    	   count++;
				    	   String val = ita12.next();
				    	   System.out.print(val+" ");
				       }
				       //
				       System.out.println();
				       Iterator <String>itb12 = b12.iterator();
				       count=1;
				       while(itb12.hasNext()) {
				    	   if(count==1)
				    		   System.out.print("B   ");
				    	   if(count==6) {
				    		   System.out.print("         ");
				    	   }
				    	   count++;
				    	  
				    	   String val = itb12.next();
				    	   System.out.print(val+" ");
				       }
				       System.out.println();
				       //
				       //System.out.println();
				       Iterator <String>itc12 = c12.iterator();
				       count=1;
				       while(itc12.hasNext()) {
				    	   if(count==1)
				    		   System.out.print("C   ");
				    	   if(count==6) {
				    		   System.out.print("         ");
				    	   }
				    	   count++;
				    	  
				    	   String val = itc12.next();
				    	   System.out.print(val+" ");
				       }
				       System.out.println();
				       //
				       
				       Iterator <String>itd12 = d12.iterator();
				       count=1;
				       while(itd12.hasNext()) {
				    	   if(count==1)
				    		   System.out.print("D   ");
				    	   if(count==6) {
				    		   System.out.print("         ");
				    	   }
				    	   count++;
				    	  
				    	   String val = itd12.next();
				    	   System.out.print(val+" ");
				       }
						System.out.println();
				//
						
						Iterator <String>ite12 = e12.iterator();
					       count=1;
					       while(ite12.hasNext()) {
					    	   if(count==1)
					    		   System.out.print("E   ");
					    	   if(count==6) {
					    		   System.out.print("         ");
					    	   }
					    	   count++;
					    	  
					    	   String val = ite12.next();
					    	   System.out.print(val+" ");
					       }
					    
					       System.out.println();
					       //
					       Iterator <String>itf12 = f12.iterator();
					       count=1;
					       while(itf12.hasNext()) {
					    	   if(count==1)
					    		   System.out.print("F   ");
					    	   if(count==6) {
					    		   System.out.print("         ");
					    	   }
					    	   count++;
					    	  
					    	   String val = itf12.next();
					    	   System.out.print(val+" ");
					       }
					       
					       System.out.println("\n");
					       //
					       Iterator <String>itg12 = g12.iterator();
					       count=1;
					       while(itg12.hasNext()) {
					    	   if(count==1)
					    		   System.out.print("G   ");
					    	   if(count==6) {
					    		   System.out.print("         ");
					    	   }
					    	   count++;
					    	  
					    	   String val = itg12.next();
					    	   System.out.print(val+" ");
					       }
					       
					       System.out.println();
					       //
					       Iterator <String>ith12 = h12.iterator();
					       count=1;
					       while(ith12.hasNext()) {
					    	   if(count==1)
					    		   System.out.print("H   ");
					    	   if(count==6) {
					    		   System.out.print("         ");
					    	   }
					    	   count++;
					    	  
					    	   String val = ith12.next();
					    	   System.out.print(val+" ");
					       }
					       System.out.println();
					       //
					       Iterator <String>itj12 = j12.iterator();
					       count=1;
					       while(itj12.hasNext()) {
					    	   if(count==1)
					    		   System.out.print("J   ");
					    	   if(count==6) {
					    		   System.out.print("         ");
					    	   }
					    	   count++;
					    	  
					    	   String val = itj12.next();
					    	   System.out.print(val+" ");
					       }
					       
				
			}
			else if(movieTime.equalsIgnoreCase("06:30pm")) {
				
				
				Iterator <String>ita6 = a6.iterator();
			      int  count = 1;
			       while(ita6.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("A   ");
			    	   if(count==6) {
			    		   System.out.print("");
			    	   }
			    	   count++;
			    	   String val = ita6.next();
			    	   System.out.print(val+" ");
			       }
			       //
			       System.out.println();
			       Iterator <String>itb6 = b6.iterator();
			       count=1;
			       while(itb6.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("B   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++;
			    	  
			    	   String val = itb6.next();
			    	   System.out.print(val+" ");
			       }
			       System.out.println();
			       //
			      // System.out.println();
			       Iterator <String>itc6 = c6.iterator();
			       count=1;
			       while(itc6.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("C   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++;
			    	  
			    	   String val = itc6.next();
			    	   System.out.print(val+" ");
			       }
			       System.out.println();
			       //
			       
			       Iterator <String>itd6 = d6.iterator();
			       count=1;
			       while(itd6.hasNext()) {
			    	   if(count==1)
			    		   System.out.print("D   ");
			    	   if(count==6) {
			    		   System.out.print("         ");
			    	   }
			    	   count++;
			    	  
			    	   String val = itd6.next();
			    	   System.out.print(val+" ");
			       }
					System.out.println();
			//
					
					Iterator <String>ite6 = e6.iterator();
				       count=1;
				       while(ite6.hasNext()) {
				    	   if(count==1)
				    		   System.out.print("E   ");
				    	   if(count==6) {
				    		   System.out.print("         ");
				    	   }
				    	   count++;
				    	  
				    	   String val = ite6.next();
				    	   System.out.print(val+" ");
				       }
				    
				       System.out.println();
				       //
				       Iterator <String>itf6 = f6.iterator();
				       count=1;
				       while(itf6.hasNext()) {
				    	   if(count==1)
				    		   System.out.print("F   ");
				    	   if(count==6) {
				    		   System.out.print("         ");
				    	   }
				    	   count++;
				    	  
				    	   String val = itf6.next();
				    	   System.out.print(val+" ");
				       }
				       
				       System.out.println("\n");
				       //
				       Iterator <String>itg6 = g6.iterator();
				       count=1;
				       while(itg6.hasNext()) {
				    	   if(count==1)
				    		   System.out.print("G   ");
				    	   if(count==6) {
				    		   System.out.print("         ");
				    	   }
				    	   count++;
				    	  
				    	   String val = itg6.next();
				    	   System.out.print(val+" ");
				       }
				       
				       System.out.println();
				       //
				       Iterator <String>ith6 = h6.iterator();
				       count=1;
				       while(ith6.hasNext()) {
				    	   if(count==1)
				    		   System.out.print("H   ");
				    	   if(count==6) {
				    		   System.out.print("         ");
				    	   }
				    	   count++;
				    	  
				    	   String val = ith6.next();
				    	   System.out.print(val+" ");
				       }
				       System.out.println();
				       //
				       Iterator <String>itj6 = j6.iterator();
				       count=1;
				       while(itj6.hasNext()) {
				    	   if(count==1)
				    		   System.out.print("J   ");
				    	   if(count==6) {
				    		   System.out.print("         ");
				    	   }
				    	   count++;
				    	  
				    	   String val = itj6.next();
				    	   System.out.print(val+" ");
				       }
				       
				
			}
			else if(movieTime.equalsIgnoreCase("10:30pm")) {
				
				
					Iterator <String>ita10 = a10.iterator();
				      int  count = 1;
				       while(ita10.hasNext()) {
				    	   if(count==1)
				    		   System.out.print("A   ");
				    	   if(count==6) {
				    		   System.out.print("");
				    	   }
				    	   count++;
				    	   String val = ita10.next();
				    	   System.out.print(val+" ");
				       }
				       //
				       System.out.println();
				       Iterator <String>itb10 = b10.iterator();
				       count=1;
				       while(itb10.hasNext()) {
				    	   if(count==1)
				    		   System.out.print("B   ");
				    	   if(count==6) {
				    		   System.out.print("         ");
				    	   }
				    	   count++;
				    	  
				    	   String val = itb10.next();
				    	   System.out.print(val+" ");
				       }
				       System.out.println();
				       //
				       //System.out.println();
				       Iterator <String>itc10 = c10.iterator();
				       count=1;
				       while(itc10.hasNext()) {
				    	   if(count==1)
				    		   System.out.print("C   ");
				    	   if(count==6) {
				    		   System.out.print("         ");
				    	   }
				    	   count++;
				    	  
				    	   String val = itc10.next();
				    	   System.out.print(val+" ");
				       }
				       System.out.println();
				       //
				       
				       Iterator <String>itd10 = d10.iterator();
				       count=1;
				       while(itd10.hasNext()) {
				    	   if(count==1)
				    		   System.out.print("D   ");
				    	   if(count==6) {
				    		   System.out.print("         ");
				    	   }
				    	   count++;
				    	  
				    	   String val = itd10.next();
				    	   System.out.print(val+" ");
				       }
						System.out.println();
				//
						
						Iterator <String>ite10 = e10.iterator();
					       count=1;
					       while(ite10.hasNext()) {
					    	   if(count==1)
					    		   System.out.print("E   ");
					    	   if(count==6) {
					    		   System.out.print("         ");
					    	   }
					    	   count++;
					    	  
					    	   String val = ite10.next();
					    	   System.out.print(val+" ");
					       }
					    
					       System.out.println();
					       //
					       Iterator <String>itf10 = f10.iterator();
					       count=1;
					       while(itf10.hasNext()) {
					    	   if(count==1)
					    		   System.out.print("F   ");
					    	   if(count==6) {
					    		   System.out.print("         ");
					    	   }
					    	   count++;
					    	  
					    	   String val = itf10.next();
					    	   System.out.print(val+" ");
					       }
					       
					       System.out.println("\n");
					       //
					       Iterator <String>itg10 = g10.iterator();
					       count=1;
					       while(itg10.hasNext()) {
					    	   if(count==1)
					    		   System.out.print("G   ");
					    	   if(count==6) {
					    		   System.out.print("         ");
					    	   }
					    	   count++;
					    	  
					    	   String val = itg10.next();
					    	   System.out.print(val+" ");
					       }
					       
					       System.out.println();
					       //
					       Iterator <String>ith10 = h10.iterator();
					       count=1;
					       while(ith10.hasNext()) {
					    	   if(count==1)
					    		   System.out.print("H   ");
					    	   if(count==6) {
					    		   System.out.print("         ");
					    	   }
					    	   count++;
					    	  
					    	   String val = ith10.next();
					    	   System.out.print(val+" ");
					       }
					       System.out.println();
					       //
					       Iterator <String>itj10 = j10.iterator();
					       count=1;
					       while(itj10.hasNext()) {
					    	   if(count==1)
					    		   System.out.print("J   ");
					    	   if(count==6) {
					    		   System.out.print("         ");
					    	   }
					    	   count++;
					    	  
					    	   String val = itj10.next();
					    	   System.out.print(val+" ");
					       }
					       
				
			}
			System.out.println("\n----------------------------------------");
		}
		else {
			System.out.println("NO SHOWS ARE AVAILABLE IN "+movieName);
		}
	}

}
