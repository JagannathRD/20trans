class CountNoOfDigits{
	public static void main(String[] args){
	System.out.println("MMS");
	int n=1234567, count=0;
	do{
	n=n/10;
	count++;
	}while(n>0);

	System.out.println(count);
	
	System.out.println("MME");
}


}