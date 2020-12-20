package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int defaultPasswordLength = 10;
    private String email;
    private int mailBoxCapacity = 500;
    private String AlternateEmail;
    private  String companySuffix = "Plus.com";

    //Generate Constructor for last name and first name
    public Email(String firstName, String  lastName){
        this.firstName = firstName;  //this means the obj em1 created its name and lastname
        this.lastName = lastName;
        System.out.println("Email Created :" + firstName + " " + lastName);

        //Call a method to ask for department
        this.department = setDepartment();
        System.out.println("Department : " + department);

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password is : " + password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName  + "@" + department + "." + companySuffix;
        System.out.println("Your Email is :" + email);
    }

    //Ask for Department
    private String setDepartment(){
        System.out.println("Department Codes: \n 1. Sales \n 2. Development \n 3. Accounting \n 0. None\n Enter Department Code:");
        Scanner scan_de = new Scanner(System.in);
        int depChoice = scan_de.nextInt();
        if(depChoice == 1){
            return "Sales";
        }else if(depChoice == 2){
            return "Development";
        }else if(depChoice == 3){
                return "Accounting";
        } else
            return  "None.";

    }

    //Generate a Random Password
    private String randomPassword(int length){
        String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#$&%";
        char[] password = new char[length];  //char password[] is array of char and has space in memory as char[length]
        for(int i=0; i<length ;i++){
            int rand = (int) (Math.random() * passwordSet.length());  //from given range of number Math.random() selects random number and give in rand
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Set mail box Capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    //set the alternate Email
    public String getAlternateEmail() {
        AlternateEmail = lastName + firstName + "." + department + "." + companySuffix;
        return AlternateEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "Display Name: " + firstName + " " + lastName + "\n" +
                "Company Email: " + email + "\n" +
                "MailBox Capacity: " + mailBoxCapacity;
    }
}
