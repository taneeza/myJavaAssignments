package com.IzaanSchool.DataType;

public class BlogAuthor {
    public static void main(String[] args) {
        String name= "Oprah Winfrey";
        String bio=" Oprah Winfrey is a famous American talk show host, producer, author.";
        String articles=" Black lives matters";
        System.out.println("Blogger's name : "+ name + "\n"+
                "Biography : "+ bio +"\n"+
                "Article Name: "+ articles);

        boolean hasPublished= true;
        boolean isCoAuthor= false;
        System.out.println( "Status :"+"\n"+
                            "The article has published  :" +hasPublished +"\n"
                            +"there is a co author:" + isCoAuthor);

    }
}
