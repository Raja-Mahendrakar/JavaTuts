package Javaps;

public class MultipleSpaces {
public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String str="Enter  the    string";
		String NULL="";
		
		String arr[]=(str.split(" "));
		
		//System.out.println(NULL.hashCode());
		//System.out.println(arr[2].length());
		for(int i=0;i<arr.length;i++)
		{
			//if(arr[i].contains(""))
			//{System.out.print("r");}
			if(arr[i].hashCode()!=NULL.hashCode()){
				System.out.print(arr[i]+" ");
				
			 
			}
			
		}
		
		
		 

	}


}
