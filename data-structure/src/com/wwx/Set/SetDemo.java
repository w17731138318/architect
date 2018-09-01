package com.wwx.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set:注重独一无二的性质,该体系集合可以知道某物是否已近存在于集合中,不会存储重复的元素
 * HashSet存储元素的顺序并不是按照存入时的顺序（和List显然不同） 是按照哈希值来存的所以取数据也是按照哈希值取得。
 * HashSet不存入重复元素的规则.使用hashcode和equals
 * 由于Set集合是不能存入重复元素的集合。那么HashSet也是具备这一特性的。
 * HashSet如何检查重复？HashSet会通过元素的hashcode（）和equals方法进行判断元素师否重复。
 * 简单一句话，如果对象的hashCode值是不同的，那么HashSet会认为对象是不可能相等的。
 *
 * 因此我们自定义类的时候需要重写hashCode，来确保对象具有相同的hashCode值。
 * 如果元素(对象)的hashCode值相同,是不是就无法存入HashSet中了?
 * 当然不是,会继续使用equals 进行比较.如果 equals为true 那么HashSet认为新加入的对象重复了,所以加入失败。
 * 如果equals 为false那么HashSet 认为新加入的对象没有重复.新元素可以存入.
 * 元素的哈希值是通过元素的hashcode方法 来获取的, HashSet首先判断两个元素的哈希值，如果哈希值一样，接着会比较equals方法
 * 如果 equls结果为true ，HashSet就视为同一个元素。如果equals 为false就不是同一个元素。
 */
public class SetDemo {
    public static void main(String[] args) {
//        set1();
//        set2();
        set3();
    }

    public static void set2(){
        Set<Person> set = new HashSet<>();
        set.add(new Person("张三",20));
        set.add(new Person("李四",21));
        set.add(new Person("王五",22));
        set.add(new Person("张三",20));
        System.out.println(set.size());
        Iterator<Person> iterator = set.iterator();
        while (iterator.hasNext()){
            Person next = iterator.next();
            System.out.println(next);
        }
    }
    public static void set1(){
        Set<String> set = new HashSet<>();
        set.add("数据结构");
        set.add("常用算法");
        set.add("并发");
        set.add("操作系统");
        System.out.println(set);
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        boolean b=set.add("并发");
        System.out.println(b);
    }

    /**
     * 问题：现在有一批数据，要求不能重复存储元素，而且要排序。
     * ArrayList 、 LinkedList不能去除重复数据。HashSet可以去除重复，但是是无序。
     * 这时候就要使用TreeSet
     * 红-黑树的数据结构，默认对元素进行自然排序（String）。如果在比较的时候两个对象返回值为0，那么元素重复。
     * 红黑树是一种特定类型的二叉树:红黑树算法的规则: 左小右大。
     */
    public static void set3(){
        TreeSet ts = new TreeSet();
        ts.add("ccc");
        ts.add("aaa");
        ts.add("ddd");
        ts.add("bbb");

        System.out.println(ts); // [aaa, bbb, ccc, ddd]

    }
}
class Person {
    private String name;
    private int age;

    Person() {

    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode:" + this.name);
        return this.name.hashCode() + age * 37;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println(this + "---equals---" + obj);
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {

        return "Person@name:" + this.name + " age:" + this.age;
    }

}