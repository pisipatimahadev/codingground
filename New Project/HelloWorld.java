//non-repeating characters in the string

public class HelloWorld{
    public static boolean UniqueString(String val )
    {
        String uniqueStr = val;
        System.out.println(uniqueStr + " length:" + uniqueStr.length());
        boolean[] b = new boolean[256];
        for(int i=0; i < uniqueStr.length() ; i++)
        {
          System.out.println(uniqueStr.charAt(i));
          int charval = uniqueStr.charAt(i);  //generally we forget implicit conversion not available, along with charAt returns int value
          if(b[charval] == false)
             b[charval] = true;
          else
          {
              System.out.println("'" + uniqueStr.charAt(i) + "' is repeated at " + i);
              return false;
          }      
        }
        return true;
    }
     public static void main(String []args){
        System.out.println("Hello World");
        String uniqueStr = new String("$Pasword%^&Q1234567dzxcvbn");
        UniqueString(uniqueStr);
     }
}