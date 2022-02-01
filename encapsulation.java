public class Encapsulation
{
  //Declaring the variables as private
  private String techVidvanName;
  private String techvidvanProfile;
  private int techVidvanAge;
  //declaring 'public' Setter and Getter Methods
  public void setName(String techVidvanName)
  {
    this.techVidvanName = techVidvanName;
  }
  public String getName()
  {
    return techVidvanName;
  }
  public void setProfile(String techVidvanProfile)
  {
    this.techvidvanProfile = techVidvanProfile;
  }
  public String getProfile()
  {
    return techvidvanProfile;
  }
  public void setAge(int techVidvanAge)
  {
    this.techVidvanAge = techVidvanAge;
  }
  public int getAge()
  {
    return techVidvanAge;
  }
  public static void main (String[] args)
  {
    Encapsulation obj = new Encapsulation();
    // setting values of the variables through setter methods
    obj.setName("Avina Garg");
    obj.setAge(22);
    obj.setProfile("Research Analyst Intern");
    // Displaying values of the variables through Getter methods
    System.out.println("Name of the employee: " + obj.getName());
    System.out.println("Age of the employee: " + obj.getAge());
    System.out.println("Profile of the employee: " + obj.getProfile());
  }
}