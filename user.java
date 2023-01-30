import java.util.Scanner;
public class user{
    public static void main(String[] agrs){
        
        // String M="MALE";
        // String F= "FEMALE";

        Scanner scan = new Scanner(System.in);
        System.out.println("enter Name");
        String Name=scan.nextLine();
        System.out.println("User name:" +Name);
        System.out.println("enter Age");
        int Age= Integer.parseInt(scan.nextLine());
        System.out.println("User age:" +Age);
        System.out.println("Gender(MENTION ONLY M OR F) ");
        String Gender= scan.nextLine();
        System.out.println("enter state name");
        String State=scan.nextLine();
        System.out.println("enter company name");
        String company=scan.nextLine();
        if( Gender.compareToIgnoreCase("M")==0){
            System.out.println("MALE");
        }
        else if( Gender.compareToIgnoreCase("F")==0){
            System.out.println("FEMALE");
        }
        else
        {
            System.out.println("INVLID INPUT");
        }
        
        switch (State) {
            case "Chandigarh": {
                System.out.println("Region : North");
                break;
            }

            case "Delhi": {
                System.out.println("Region : North");
                break;
            }

            case "Haryana": {
                System.out.println("Region : North");
                break;
            }
            case "Jammu kashmir": {
                System.out.println("Region : North");
                break;
            }
            case "Karnataka": {
                System.out.println("Region : South");
                break;
            }
            case "Kerala": {
                System.out.println("Region : South");
                break;
            }
            case "Andhra Pradesh": {
                System.out.println("Region : South");
                break;
            }
            case "Telangana": {
                System.out.println("Region : South");
                break;
            }
            case "Arunachal Pradesh": {
                System.out.println("Region : East");
                break;
            }
            case "Mizoram": {
                System.out.println("Region : East");
                break;
            }
            case "Odisha": {
                System.out.println("Region : East");
                break;
            }
            case "Jharkhand": {
                System.out.println("Region : East ");
                break;
            }
            case "AndhraPradesh": {
                System.out.println("Region : East ");
                break;
            }
            case "Bihar": {
                System.out.println("Region : East ");
                break;

            }
            case "Nagaland": {
                System.out.println("Region : East ");
                break;

            }
            case "Assam": {
                System.out.println("Region : East ");
                break;
            }
        }
        if(company.compareToIgnoreCase("Facebook")==0||company.compareToIgnoreCase("Google")==0||company.compareToIgnoreCase(" Microsoft")==0||company.compareToIgnoreCase( "Samsung")==0||company.compareToIgnoreCase(" IBM")==0||company.compareToIgnoreCase(" Apple")==0){
            System.out.println("The employee is working in Top MNC Companies");
        }else{
            System.out.println("The employee is not working in Top MNC Companies ")
        }
        
    }
}
