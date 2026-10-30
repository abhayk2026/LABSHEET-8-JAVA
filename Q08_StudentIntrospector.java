import java.beans.*;
import java.util.Arrays;

/** Q08: Use JavaBeans Introspector on StudentBean. */
public class Q08_StudentIntrospector {
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo info = Introspector.getBeanInfo(StudentBean.class, Object.class);
        System.out.println("PROPERTIES:");
        for (PropertyDescriptor property : info.getPropertyDescriptors()) {
            System.out.println("- " + property.getName());
        }
        System.out.println("METHODS:");
        Arrays.stream(info.getMethodDescriptors())
            .map(method -> method.getMethod().getName())
            .distinct().sorted().forEach(System.out::println);
    }
}
