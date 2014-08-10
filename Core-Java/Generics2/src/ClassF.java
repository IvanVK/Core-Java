
@ClassInfo(author = "Ivan", relatedClasses = {})
public class ClassF {

    public ClassF() {

    }

    public static void main(String[] args) {
        ClassF testClass = new ClassF();

        System.out.println(testClass.getClass().getAnnotations());

        System.out.println(testClass.getClass().getAnnotation(ClassInfo.class));

        ClassInfo info = testClass.getClass().getAnnotation(ClassInfo.class);
        System.out.println("Author: " + info.author());
        System.out.println("Revision: " + info.revision());
        System.out.println("Number of related classes: " + info.relatedClasses().length);
    }
}