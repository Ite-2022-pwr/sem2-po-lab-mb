package org.example;

import java.util.ArrayList;
import java.util.List;

public class RootsCalculator {

    public static List<Double> calculate_roots(double a, double b, double c){
        List<Double> roots = new ArrayList<Double>();
        if(a!=0){
            double delta = (b*b)-(4*a*c);
            if (delta>0){
                double deltaSqrt = Math.sqrt(delta);
                roots.add((-b-deltaSqrt)/(2*a));
                roots.add((-b+deltaSqrt)/(2*a));
            } else if(delta == 0) {
                roots.add((-b)/(2*a));
            }
        }else{
            if(b!=0){
                roots.add((-c)/b);
            } else {
                if (c==0){
                    roots.add(Double.POSITIVE_INFINITY);
                }
            }
        }
        return roots;
    }

    public static void main(String[] args){
        System.out.println(calculate_roots(1,0,0));;
    }

}
