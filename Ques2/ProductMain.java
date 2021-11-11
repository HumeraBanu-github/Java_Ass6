package Ass6.ques2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class ProductMain {
    public static void main(String[] args) {
        Product p1= new Product("hi");
        Product p2= new Product("helo");
        Product p3 = new Product("bye");
        Product p4 = new Product("mno");
        Product p5 = new Product("kjh");
        Product p6= new Product("hii");
        Product p7= new Product("hello");
        Product p8 = new Product("byee");
        Product p9 = new Product("mno0");
        Product p10 = new Product("kjhe");
        HashSet<Product> hashSet= new HashSet<>();
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        hashSet.add(p4);
        hashSet.add(p5);
        hashSet.add(p6);
        hashSet.add(p7);
        hashSet.add(p8);
        hashSet.add(p9);
        hashSet.add(p10);
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        System.out.println(hashSet);
      System.out.println(hashSet.size());
        }


}
