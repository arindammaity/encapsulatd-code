import java.util.*;
class Solution2
  {
     public static void  main(String[] args)
      {
        Scanner sc = new Scanner(System.in);
         Student[] ss=new Student[4];
          
        for(int i=0;i<4;i++)
         {
           int a = sc.nextInt();
           sc.nextLine();
           String b = sc.nextLine();
           int  c= sc.nextInt();
           sc.nextLine();
           int  d= sc.nextInt();
           sc.nextLine();
          ss[i]=new Student(a,b,c,d);
        }
       int  e= sc.nextInt();
   
       Student H= fun1(ss);
       System.out.println("id-"+H.id);
       System.out.println("name-"+H.name);
       System.out.println("marks-"+H.marks);
       System.out.println("age-"+H.age);

     Student M =  fun2(ss,e);
     if(M!=null)
      {
       System.out.println("id-"+M.id);
       System.out.println("name-"+M.name);
       System.out.println("marks-"+M.marks);
       System.out.println("age-"+M.age);

      }
      else
       {

       System.out.println("No Student found with mentioned attribute");
       }

     }
      
   public static  Student    fun1(Student[] ss)
     {
      int targetage= ss[0].age;       
      for(int i=1;i<ss.length;i++)
        {
       if(ss[i].age  >targetage)
         {
           targetage= ss[i].age;
        }
      }
     for(int i=0;i<ss.length;i++) 
     {
       if(ss[i].age==targetage)
         {
            return  ss[i];
         }
    }
     return null;  
      
     } 


   public    static  Student   fun2(Student[] ss,int e)
   {
     for(int i=0;i<ss.length;i++)
      {
        if(ss[i].id==e)
         {
            return  ss[i];
          }
     }
      return null;
   }

  }
class Student
  {
     int id;
     String name;
     int marks;
     int age;
  public  Student(int id,String name,int marks,int age)
   {
     this.id=id;
      this.name=name;
      this.marks=marks;
      this.age=age;
    }
}

     