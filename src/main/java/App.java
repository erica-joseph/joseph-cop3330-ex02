import java.util.Scanner;
/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        int count = 0;
        System.out.print( "What is the input string? " );
        String str= sc.nextLine();
        System.out.print( " " +str);
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ')
                count++;
        }
        System.out.print(" has "+count);
        System.out.print(" characters.");
    }
}