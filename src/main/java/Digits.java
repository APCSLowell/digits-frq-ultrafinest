import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
	    digitList = new ArrayList<Integer>();
	    int number = num;
        if (num == 0) {
            digitList.add(0);
        }
        else{
    	    while(number > 0){  
                digitList.add(0, number % 10);
                number = number / 10;
            }
        }
	}

	public boolean isStrictlyIncreasing()
	{ 
	     if(digitList.size() < 2){
		     return true;
	     }
		for(int i = 1; i < digitList.size(); i++){
			if(digitList.get(i) <= digitList.get(i - 1)){
			return false;
			}
		}
		return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
