package org.example2;

public class Example {
    public static void main(String[] args) {
        Samosa samosa = Samosa.getSamosa();
        Samosa samosa1 =Samosa.getSamosa();

//        System.out.println(samosa.hashCode());
//        System.out.println(samosa1.hashCode());

        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());
    }
}
