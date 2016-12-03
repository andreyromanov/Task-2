package tasktwo;
public class TaskTwo {

    public static void main(String[] args) {
        
        System.out.println("Hello, World!!!");
    
    //Пример объединения строковых переменных
    String s1="Go go ";
    String s2="City!";
    String s3=s1+s2;
        System.out.println(s3);
        
    //Пример конкатенации
    int number = 1000;
    String s = "I have "+number+" dollars";
        System.out.println(s);
        
    //Пример логических опреаций
    boolean b = false;
    b = true;
    boolean toBe = false;
    b = toBe || !toBe;
	if (b) {
	 System.out.println(toBe); }

    //Логическое выражение    
    int a = 4;
    boolean d = a == 4;
    if (d) {
        System.out.println("It's true!");
}

    //Короткая запись логического выражения
    int с = 4;
    if (с == 4) {
	 System.out.println("Ohhh! So a is 4!");}
    
    //Работа логических выражений и метода equals
    String q = new String("Wow");
    String w = new String("Wow");
    String sameQ = q;
    boolean r1 = q == w;      
    boolean r2 = q.equals(w);
    boolean r3 = q == sameQ;  
	System.out.println("arg1: "+ r1);
	System.out.println("arg2: "+ r2);
	System.out.println("arg3: "+ r3);
        
        
    //Варианты использования оператора if, else    
    int e =4;
    int r =5;
	if (e != r) System.out.println("Yeah!");
	else System.out.println("Ohhh...");
	if (e != r)
	  System.out.println("Another line Wow!");
	else
	  System.out.println("Double rainbow!");
    }

  
    public static class Formula{
	public static void vivod() {System.out.println("Максим Р.И");}
	
	public static double formula(int a,int b,int c) {
		double  S=1;
		if(a>5)
		     S = a/b - c*5;
		if(a<5)
			 S = Math.cos(b)+ Math.exp(c);
		if(a==5)
			 S = 12 - a;	
		return S;
	}
	
	public static void convert()
	{
		char number='1';
		int inT=(int) number;
		System.out.println("char convert in int " + inT);
		
		double d = (double) inT;
		System.out.println("int convert in double " + d);
	}
	
}

}  
 
