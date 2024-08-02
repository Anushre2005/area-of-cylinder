import cylinder.*; import java.util.*; 
class Exp11b 
{ 
public static void main(String [] args) { int x,y; 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter radius and height of cylinder"); x=sc.nextInt(); y=sc.nextInt(); cylinder vo=new cylinder(); vo.volume(x,y); 
} 
} 
