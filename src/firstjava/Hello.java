package firstjava;

public  class Hello {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//boolean flag = true;
		  String str = "one";
		  switch(str){
			case "one":
				System.out.println("this is one");
				break;
			case "two":
				System.out.println("this is two");
				break;
			default:
			    System.out.println("Not find !!");
				break;
				}
		  // int sum = 0;
		   int x = 0, y = 0;
		   for(x = 1;x <= 9;x++){
			 for(y = 1;y <= x; y++){
				System.out.print(x+"*"+y + "=" +x*y+"\t");
			 }
			System.out.println();
			
		}
		printInfo (3);
		printInfo (5);
		printInfo (7);
		printInfo (9);

	}
	public static void printInfo(int line){
		int i,j; 
		for(i = 1;i<=line;i++)
		{
			for (j = line - i;j>=1;j--){
				System.out.print(" ");
			}
			for (j = 1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	    

}
