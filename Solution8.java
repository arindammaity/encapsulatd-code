import java.util.*;
class Solution8
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     Player[] m= new Player[4];
     for(int i=0;i<4;i++)
    {
      int a= sc.nextInt();
      sc.nextLine();
      String b= sc.nextLine();
      int c= sc.nextInt();
      sc.nextLine();
      int d= sc.nextInt();
       sc.nextLine();
      int  e= sc.nextInt();
      sc.nextLine();
     m[i]= new Player(a,b,c,d,e);
   }
    int f= sc.nextInt();
    double[] m1 =  fun1( m, f);
    for(int i=0;i<m1.length;i++)
    {
      if(m1[i]>80)
      {
        System.out.println("Grade A Player");
      }
      else if(m1[i]>50 && m1[i]<79)
      {
       System.out.println("Grade B Player");
      }
      else
       {
        System.out.println("Grade C Player");
       }
  }
}
  public static  double[]  fun1(Player[] m,int f)
  {
     double[] m1=new double[0];
     for(int i=0;i<m.length;i++)
     {
       if(m[i].noofmatches>=f)
       {
          int x= m[i].totalrunscored;
          int y=m[i].noofmatches;
           double avg = (x+y)/2;
        m1= Arrays.copyOf(m1,m1.length+1);
        m1[m1.length-1]=avg;
       }
     }
     return m1;
   }   
}
 class Player
  { 
    int id;
    String name;
    int rank;
    int noofmatches;
    int totalrunscored;
   public Player(int id,String name,int rank,int noofmatches,int totalrunscored)
    {
      this.id=id;
      this.name=name;
      this.rank=rank;
      this.noofmatches=noofmatches;
      this.totalrunscored=totalrunscored;
}
}
    