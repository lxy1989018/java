public class TestClassLoader{
    
    public static void main(String[] args){
        Hello instance1 = new Hello();
        Hello instance2 = new Hello();
        ClassLoader c1 = instance1.getClass().getClassLoader(); 
        ClassLoader c2 = instance2.getClass().getClassLoader(); 
        ClassLoader c3 = Hello.class.getClassLoader(); 
        ClassLoader c4 = String.class.getClassLoader(); 
        ClassLoader c5 = c1.getParent(); 
              	System.out.println (c1 == c2);
        	System.out.println ("class loader c1:"+c1);
        	System.out.println ("class loader c2:"+c2);
        	System.out.println ("class loader c3:"+c3);
        	System.out.println ("class loader c4:"+c4);
        	System.out.println ("c1 parent:"+c5);
    }
}