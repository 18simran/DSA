public class test11
{
    public static void main(String[] args)
    {
        StringBuilder str = new StringBuilder() ;
        str.append("hello") ;
//        System.out.println(str);
//        System.out.println(  str.charAt(0));
//        str.setCharAt(0,'y');
//
//        str.insert(2,4) ;
//        System.out.println(str);
//        str.delete(0,2);
//        System.out.println(str);
//        str.append(5);
//        System.out.println(str);

        for(int i =0 ; i< str.length()/2;i++)
        {
            int front = i ;
            int back = str.length() - 1-i;

                char frontchar = str.charAt(front);
                char backchar = str.charAt(back);
                str.setCharAt(front,backchar);
                str.setCharAt(back,frontchar);
        }
        System.out.println(str);
    }
}