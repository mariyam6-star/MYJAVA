public  class cunst
{
    String name;
    int age;
     cunst(String m,int a)
    {
        name=m;
        age=a;
    }
     void myfun()
    {
        System.out.println("my name is"+name);
         System.out.println("my age is"+age);
    }
}

    public static void main(String[]args)
    {
          cunst p1=new cunst("maryam",19);
          p1.myfun();
    }
