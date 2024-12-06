import java.lang.reflect.Field;

public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup ;
    private String phoneNumber ;
    public Patient(int id,String name, int birthYear, double height, double weight,String bloodGroup,String phoneNumber){
        this.id = id;
        this.name = name;
        if(birthYear <= 2024){
            this.birthYear = birthYear;
        }else {
            this.birthYear = 2000;
            System.out.println("Default your birtYear 2000");
        }
        if(height >= 0){
            this.height = height;
        }else {
            this.height = 0;
            System.out.println("Invalid height");
        }
        if(weight >= 0){
            this.weight = weight;
        }else {
            this.weight = 0;
            System.out.println("Invalid weight");
        }
        if (bloodGroup.equals("A") || bloodGroup.equals("B") || bloodGroup.equals("AB") || bloodGroup.equals("O")){
            this.bloodGroup = bloodGroup;
        } else {
            System.out.println("Invalid BloodGroup");
            this.bloodGroup = "null";
        }
        if (phoneNumber.length() == 10){
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid PhoneNumber");
            this.phoneNumber = "null";
        }
    }
    public double getBMI(){
        if (height <= 0 || weight <= 0){
            return 0.0;
        }
        else {
            double heightInM = height / 100.0;
            return weight / (heightInM * heightInM);
        }
    }

    public int getAge(int currentYear){
        return currentYear - birthYear;
    }
    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient BloodGroup: " + bloodGroup);
        System.out.println("Patient PhoneNumber: " + phoneNumber);
        System.out.println("Patient BMI: " + getBMI());
    }

}


