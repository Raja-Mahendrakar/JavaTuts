package Javaps;

public class RajaV {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String str="Enter  the    string";
		String arr[]=str.split(" ");
		String space=new String(" ");
		System.out.println(arr.length);
		//System.out.println(arr[2].length());
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals("")){
				continue;
				//System.out.print(arr[i]+"R ");
			}
			else
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		
		 

	}

}

