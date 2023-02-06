import java.util.Scanner;

class lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[1024];
        Boolean flag = false;
        int ii = 0;
        do {

            flag = true;
            System.out.println("| MENU                         |");
            System.out.println("|1. Enter the name:            |");
            System.out.println("|2. Search for a name:         |");
            System.out.println("|3. Remove a name:             |");
            System.out.println("|4. want to see the name list  |");
            System.out.println("|5. Quit                       |");
            System.out.println("Enter your choice: ");
            int inp = Integer.parseInt(sc.nextLine());

            switch (inp) {
                case 1: {
                    int j;
                    System.out.print("Enter your name: ");
                    String temp=sc.nextLine();
                    for ( j=0; j < names.length; j++) {
                        if (temp.equals(names[j])){
                            System.out.println("Name is already exist. ");
                            break;
                        }
                        else{
                            names[ii] = temp;
                            ii++;
                            break;
                        }
                        
                    }
                    
                    
                    break;

                }
                case 2:{
                    int j;
                    System.out.println("Which name your are searching?.");
                    String sch = sc.nextLine();
                    for ( j=0; j < names.length; j++) {
                        if (sch.equals(names[j])){
                            System.out.println("Name is found at position "+(j+1));
                            break;

                        }
                    }
                    break;
                }
                case 3:{
                    int j;
                    System.out.println("Which name you want to delete. :");
                    String ntemp = sc.nextLine();
                    for ( j=0; j < names.length; j++) {
                        if (ntemp.equals(names[j])){
                            for (; j < names.length-1; j++) {
                                names[j]=names[j+1];
                                
                            }

                        }
                        
                    }
                    break;


                }
                case 4:{
                    System.out.println("Your list are: ");
                    for (String a:names){
                        if(a!=null){
                            System.out.print(a+",");
                        }
                       
                    }
                    System.out.println();
                    break;
                }
                case 5:{
                    System.out.println("Program will now wxit in 3.2.1..");
                    flag=false;
                    break;
                }


            }

        } while (flag);

  }
}
