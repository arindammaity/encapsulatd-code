import java.util.*;
class Solution5
{
   public static void  main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
         Course[] cc=new Course[4];
      for(int i=0;i<cc.length;i++)
      {
       String a= sc.nextLine();
       String b = sc.nextLine();
       int c= sc.nextInt();
      sc.nextLine();
     boolean  d= sc.nextBoolean();
     String   e= sc.nextLine();
   cc[i]=new Course(a,b,c,d,e);
     }
   String  f= sc.nextLine();
   String  X = fun1(cc,f);
   if(X==null)
    {
       System.out.println("No match found");
    }
   else
   {
     System.out.println(X);
   }
  }
  public static  String     fun1(Course[] cc,String f)
  {
   String temp=" ";
   for(int i=0;i<4;i++)
    {
      if(cc[i].name.equalsIgnoreCase(f))
       {
          if(cc[i].sA>=1000 && cc[i].sA<1500)
          {
           temp =temp+"Diamond";
           return temp;
          }
          if(cc[i].sA>=500 && cc[i].sA<1000)
          {
           temp =temp+"Golden";
           return temp;
          }
          if(cc[i].sA<500)
          {
           temp =temp+"Silver";
           return temp;
         }
      }
   }
   return null;
}
            
}
class Course
{
   String name;
   String instructor;
   int sA;
   boolean present;
   String city;
public Course(String name,String instructor,int sA,boolean present,String city)
  {
     this.name=name;
     this.instructor=instructor;
     this.sA=sA;
     this.present=present;
     this.city=city;
}
}
