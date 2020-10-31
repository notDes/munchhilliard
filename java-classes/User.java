import java.util.Random;

/**
  describe this class
*/
public class User
{
    // declare private instance vars
    private Restaurant favRestaurant;
    private FoodReview lastReview;
    private int reviewCount;
    private double reviewScoreTotal;
    private int totalLikes;
    private String recentLoginDay;
    private int userAge;
    private String userName;
    private String name;
    private String birthday;
    private String accountCreationDay;
    // add more

    /**
      describe this constructor
    */
    public User()
    {
        // assign default values
        reviewCount = 0;
        reviewScoreTotal = 0;
        name = "none";
        birthday = "Unknown";
        totalLikes = 0;
        this.recentLoginDay = "";
        userAge = 0;
        this.accountCreationDay = "";

    }

    // accessors and mutators here

    /**
      describe each method
    */
     
    //returns the total number of likes
    public int getTotalLikes(){
      return totalLikes;
    }

  
    //sets the number of total likes
    //@param int _totalLikes
    public setTotalLikes(_totalLikes){

      totalLikes = _totalLikes;
    }
  
    /**
    return the users age
    @return userAge which is the users age
    */
    public int getUserAge(){
      return userAge;
    }
  
    /**
    set the users age
    @param int _userAge
    */ 
    public void setUserAge(int _userAge){
      userAge = _userAge;
    }
  
    public double getAverageReview()
    {
      // needs completed
      return 0.0;
    }
  
    /**
      Returns the user name
      @return userName which is the user's name
    */
    public String getUserName()
    {
      return userName;
    }
  
     /**
      Returns the age of the user
      @return userAge which is the user's age
    */
    public String getUserAge();
    {
      return userAge;
    }

    /**
      describe each method
    */
    public void setFavRestaurant(Restaurant _restaurant)
    {
      favRestaurant = _restaurant;
    }
  
    /**
      Sets the user's name
      @param String _userName
    */
    public void setUserName(String _userName)
    {
      userName = _userName;
    }
  
  
    /**
      Sets the age of the user
      @param int _age
    */
    public void setUserAge(int _age)
    {
      userAge = _age;
    }
  

    /**
      setName(String _name)
      Sets the user's name to a string.
      @param _name the name of the user
    */
    public void setName(String _name)
    {
      name = _name;
    }
    
    /**
      getName()
      Accesses the name of the user.
      @return the name of the user
    */
    public String getName()
    {
      return name;
    }
  
    /**
      getrecentLoginDay()
      Accesses the last login day of the user.
      @return the last login day of the user.
    */
    public String getrecentLoginDay()
    {
      return recentLoginDay;
    }
      /**
      getAccountCreationDay()
      Accesses the account creation day of the user.
      @return the day when the account was created.
    */
    public String getAccountCreationDay()
    {
      return accountCreationDay;
    }
  
    /**
      setAccountCreationDay()
      Sets the day the account was created of the user.
      @param _accountCreationDay day of account creation.
    */
    public void setAccountCreationDay(String _accountCreationDay){
      this.accountCreationDay = _accountCreationDay;
    }
  
  
  
    /**
      setRecentLoginDay()
      Sets the last login day of the user.
      @param _recentLoginDay last login day of the user.
    */
    public void setRecentLoginDay(String _recentLoginDay){
      this.recentLoginDay = _recentLoginDay;
    }
  
    /**
      setBirthday(String _birthday)
      Sets the user's birthday
    */
    public void setBirthday(String _birthday){
      bithday =  _birthday;
    }
  
    /**
    getBirthday()
    Accesses the user's birthday
    @return the user's birthday
    */
    public String getBirthday(){
      return birthday;
    }
  


}
