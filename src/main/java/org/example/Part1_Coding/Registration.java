package org.example.Part1_Coding;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email){
        if (email.endsWith("@yahoo.com")){
            this.email=email;
            System.out.println(email);
        }else {
            System.out.println("Enter valid Email");
        }
    }

    public void setUserName(String userName){
        if (userName!=null && !userName.isEmpty() && userName.length()>6) {
            this.userName=userName;
            System.out.println(userName);

        }else {
            System.out.println("Invalid userName, please Enter Invalid UserName");
        }
    }
    public void setPassword(String password){
        if (password!=userName && !password.isEmpty() && password.length()>6){
            this.password= password;
            System.out.println("password is good");
        }else{
            System.out.println("Invalid password");
        }
    }
    public String getEmail(){
        return email;
    }
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }


    public static void main(String[] args) {
        Registration user = new Registration();

        user.setEmail("Silvia@yahoo.com");
        user.setUserName("SilviaBeshay");
        user.setPassword("1212gugll");

        // Getting and printing user's information
        System.out.println("User's Email: " + user.getEmail());
        System.out.println("User's Username: " + user.getUserName());
        System.out.println("User's Password: " + user.getPassword());
    }
}
