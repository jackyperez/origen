package steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

public class MyStepdefs {




    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {
    }



//    Curso 4
    @And("^I enter the username as admin and password as admin$")
    public void iEnterTheUsernameAsAdminAndPasswordAsAdmin() {
    }

//curso 5

   /* @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        System.out.println("username is " + username + "and password is " + password );
    }*/

   //curso 6
   @And("^I enter the following for login$")
   public void iEnterTheFollowingForLogin(DataTable table) {
       //curso 7
               /*  List<List<String>> data = table.raw();
              System.out.println("The value is : " + data.get(0).get(0).toString());
                System.out.println("The value is : " + data.get(0).get(1).toString());*/

       //create an arraylist
       List<User> users = new ArrayList<User>();
       //store all table

       for (User user : users){
            System.out.println("the username is " + user.UserName);
            System.out.println("the password is " + user.Password);

       }

   }

    @And("^I click login button$")
    public void iClickLoginButton() {
    }

    @Then("^I should see the userfrom page$")
    public void iShouldSeeTheUserfromPage() {
    }

    //curso 7
    public class User {
        public String UserName;
        public String Password;

        public User(String userName, String password) {
            UserName = userName;
            Password = password;
        }
    }
}
