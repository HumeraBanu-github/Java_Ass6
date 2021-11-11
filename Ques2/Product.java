package Ass6.ques2;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Product<T>{
    private T productName;
    Product(T productName)
    {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return
                "productName=" + productName ;
    }
}
