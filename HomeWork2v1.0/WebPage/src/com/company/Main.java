/*
 * Brandon Dalton
 * 4-9-19
 * This program creates a web page with name and description entered by user.
 */
package com.company;


import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main
{

    public static void main(String[] args) throws IOException

    {
        //******Two options available for use by developers. One uses Scanner the other uses JOptionPane******
        //******To switch just remove the // for the Scanner parts and put them in front of JOptionPane parts***+


        //Declaring variables
        String name, description, filename;
        //Creating new scanner for input
        //Scanner k = new Scanner(System.in);

        //Welcome message so user knows what the program is for(scanner)
        //System.out.println("Welcome to our web page creation program.");

        //JOptionpane Welcome message
        JOptionPane.showMessageDialog(null,"Welcome to our web page creation program.");



        //Getting name from user(Scanner)
        //System.out.print("Enter your name: ");
        //name = k.nextLine();

        //Getting name from user(JOptionPane)
        name = JOptionPane.showInputDialog("Enter your name: ");





        //**Input validation for user name**



        //Converts name to an array to validate its larger than two words
        String[] nameCheck = name.split(" ");
        while (nameCheck.length < 2)
        {
            //System.out.println("Please enter a first and last name.");
            //System.out.print("Enter your name: ");
            //name = k.nextLine();
            name = JOptionPane.showInputDialog("Please enter a first and last name.\nEnter your name: ");
            nameCheck = name.split(" ");
        }

        //Getting description of user(Scanner)
        //System.out.print("Enter a description of yourself: ");
        //description = k.nextLine();

        //Getting description of user(JOptionPane)
        description = JOptionPane.showInputDialog("Enter a description of yourself: ");




        //**Input validation for user description**


        //Converts description to an array to validate its larger than 3 words
        String[] descriptionChecker = description.split(" ");
        while (descriptionChecker.length < 4)
        {
            //System.out.println("Please enter a description with more than 3 words.");
            //System.out.print("Enter a description of yourself: ");
            //description = k.nextLine();
            description = JOptionPane.showInputDialog("Please enter a description with more than 3 words." +
                    "\nEnter a description of yourself: ");
            descriptionChecker = description.split(" ");
        }

        //Making filename based off the user name with removal of spaces and adding the file type
        filename = name.replaceAll("\\s","") + ".html";


        //Used to verify filename was written correctly
        //System.out.println(filename);


        //Creates the file
        PrintWriter outputfile = new PrintWriter(filename);



        //Output to html file

        //First option has a lot of lines but is easier to read
        outputfile.println("<html>");
        outputfile.println("<head>");
        outputfile.println("</head>");
        outputfile.println("<body>");
        outputfile.println("\t<center>");
        outputfile.println("\t\t<h1>"+name+"</h1>");
        outputfile.println("\t</center>");
        outputfile.println("\t<hr />");
        outputfile.println("\t"+description);
        outputfile.println("\t<hr />");
        outputfile.println("</body>");
        outputfile.println("</html>");


        //Second option is condensed to two lines but a little harder to read
        //outputfile.print("<html>\n<head>\n</head>\n<body>\n\t<center>\n\t\t<h1>"+name+"</h1>\n\t</center>\n\t<hr />\n\t"
                //+description+"\n\t<hr />\n</body>\n</html>");

        //Closes the file
        outputfile.close();

        //Output message letting the user know their web page is done(Scanner)
        //System.out.println("Your web page has been created.");

        //Output message letting the user know their web pag is done(JOptionPane)
        JOptionPane.showMessageDialog(null, "Your web page has been made.");
    }

}
