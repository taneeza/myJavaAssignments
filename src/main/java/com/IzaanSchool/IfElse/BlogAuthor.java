package com.IzaanSchool.IfElse;

public class BlogAuthor {
    public static void main(String[] args){
            String name= "Jahidul";
            String bio=" he is an  author.";
            String articles=" how to be successful in career";
            System.out.println("Blogger's name : "+ name + "\n"+
                    "Biography : "+ bio +"\n"+
                    "Article Name: "+ articles);
            if(name=="Jahidul"){
                System.out.println("Jahidul is author");
            }
            else{
                System.out.println(name+ " is an author");
            }
    }
}
