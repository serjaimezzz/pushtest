package day11_Reflect;

public class ReflectDemo {
	public static void main(String[] args) {
		String str ="1";
		str.equals("");
	}	
}

/*
public final class Class<T>{
   getField();
    @CallerSensitive
    public static Class<?> forName(String className)
                throws ClassNotFoundException {
        Class<?> caller = Reflection.getCallerClass();
        return forName0(className, true, ClassLoader.getClassLoader(caller), caller);
    }
    
     @CallerSensitive
    public Field[] getFields() throws SecurityException {
        checkMemberAccess(Member.PUBLIC, Reflection.getCallerClass(), true);
        return copyFields(privateGetPublicFields(null));
    }
    
    
}
 */