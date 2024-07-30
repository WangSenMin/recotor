package ClassTest.collection;

import java.util.ArrayList;
import java.util.Iterator;
@SuppressWarnings("all")
public class test {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
         arrayList.add(new Dog("BigYellow",3));
        arrayList.add(new Dog("BigHua",5));
        arrayList.add(new Dog("LittlePoint",1));

        arrayList.set(2,"已被替换");
        arrayList.add("friends");
        System.out.println(arrayList.subList(1,4));
        //其范围：[1,4);即[1,3]
        //会返回已被删除的元素


    }
}
class Dog{
    private  String  name;
    private     int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
