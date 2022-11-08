public class DrivingLicense {
    private String Name;
    private String Surname;
    private String Adress;
    private String PostalCode;
    private String City;
    private int dlNumber;
    private int yearIssue;
    private String dlCat;
    
    public String toString(){
        String details="";
        details += Name + "," + Surname + "\n"
        details += Adress + "," + PostalCode + "," + City
        details += dlNumber + "," + dlCat + "," + yearIssue
    }

    public String getFirstName(){
       return Name; 
    }

    public void String void setFirstName(){
        this.Name = Name; 
     }
     
     public String getSurname(){
        return Surname; 
     }
 
     public void String setSurname(){
         this.Surname = Surname; 
      }
       
     public String getAdress(){
        return Adress; 
     }
 
     public void String setAdress(){
         this.Adress = Adress; 
      }
      
      public String getPostalCode(){
        return PostalCode; 
     }
 
     public void String setPostalCode(){
         this.PostalCode = PostalCode; 
        }

      public String getCity(){
        return City; 
     }
 
     public void String setCity(){
         this.City = City; 
      }
}
public int getYearOfIssue(){
    return this.yearOfIssue
}

public void setYearOfIssue(int yearOfIssue){
    
}