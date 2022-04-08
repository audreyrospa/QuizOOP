/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Registration;
import java.util.Scanner;
/**
 *
 * @author audrey
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int inputMenu;
        int choose;
        boolean y = false;
        
        System.out.println("Registration Form PT.ARP");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Choose : ");
        inputMenu = input.nextInt();
        
        switch(inputMenu) {
            case 1: {
                String nik;
                String name;
                double WritingScore;
                double CodingScore;
                double InterviewScore;
                
                System.out.println(" ");
                Scanner data = new Scanner(System.in);
                System.out.println("Registration Form\n");
                System.out.print("Student Number : ");
                nik = data.nextLine();
                System.out.print("Input Name : ");
                name = data.nextLine();
                System.out.print("Writing Exam Score : ");
                WritingScore = data.nextDouble();
                System.out.print("Coding Test Score : ");
                CodingScore = data.nextDouble();
                System.out.print("Interview Test Score : ");
                InterviewScore = data.nextDouble();
                Android Android;
                Android = new Android(nik, name, WritingScore, CodingScore, InterviewScore);
                
                do {
                    System.out.println(" ");
                    System.out.println("Menu");
                    System.out.println("1. Edit");
                    System.out.println("2. Output");
                    System.out.println("3. Exit");
                    System.out.print("Choose : ");
                    choose = input.nextInt();
                  
                    switch(choose) {
                        case 1:{
                            Scanner NewInput = new Scanner(System.in);
                            System.out.println(" ");
                            System.out.println("FORM EDIT");
                            System.out.print("Writing Exam Score : "); Android.WritingScore = NewInput.nextDouble();
                            System.out.print("Coding Test Score : "); Android.CodingScore = NewInput.nextDouble();
                            System.out.print("Interview Test Score : "); Android.InterviewScore = NewInput.nextInt();
                        }
                        case 2: {
                            double Result;
                            String UserName;
                            System.out.println(" ");
                            
                            Result = Android.WritingScore() + Android.CodingScore() + Android.InterviewScore();
                            UserName = Android.getName();
                          
                            System.out.println("Result : " + Result);
                            if (Result < 85) {
                                System.out.println("INFORMATION : FAILED!");
                                System.out.println("Very Sorry to " + UserName + " , you are not accepted in Android Developer");
                            } else {
                                System.out.println("INFORMATION : SUCCESS!");
                                System.out.println("Congratulation " + UserName + " , you are accepted in Android Developer");
                            }
                        }
                        case 3: y = true;
                    }
                } while(!y);
            }

                
            case 2: {
                String nikW;
                String nameW;
                double WritingScoreW;
                double CodingScoreW;
                double InterviewScoreW;
                
                System.out.println(" ");
                Scanner data = new Scanner(System.in);
                System.out.println("Registration Form\n");
                System.out.print("Student Number : ");
                nikW = data.nextLine();
                System.out.print("Input Name : ");
                nameW = data.nextLine();
                System.out.print("Writing Exam Score : ");
                WritingScoreW = data.nextDouble();
                System.out.print("Coding Test Score : ");
                CodingScoreW = data.nextDouble();
                System.out.print("Interview Test Score : ");
                InterviewScoreW = data.nextDouble();
                Web Web;
                Web = new Web(nikW, nameW, WritingScoreW, CodingScoreW, InterviewScoreW);
                
                do {
                    System.out.println(" ");
                    System.out.println("Menu");
                    System.out.println("1. Edit");
                    System.out.println("2. Output");
                    System.out.println("3. Exit");
                    System.out.print("Choose : ");
                    choose = input.nextInt();
                  
                    switch(choose) {
                        case 1: {
                            Scanner NewInput = new Scanner(System.in);
                            System.out.println(" ");
                            System.out.println("FORM EDIT");
                            System.out.print("Writing Exam Score : "); Web.WritingScore = NewInput.nextDouble();
                            System.out.print("Coding Test Score : "); Web.CodingScore = NewInput.nextDouble();
                            System.out.print("Interview Test Score : "); Web.InterviewScore = NewInput.nextInt();
                        }
                        case 2: {
                            double Result;
                            String UserName;
                            System.out.println(" ");
                            
                            Result = Web.WritingScore() + Web.CodingScore() + Web.InterviewScore();
                            UserName = Web.getName();
                          
                            System.out.println("Result : " + Result);
                            if (Result < 85) {
                                System.out.println("INFORMATION : FAILED!");
                                System.out.println("Very Sorry to " + UserName + " , you are not accepted in Web Development");
                            } else {
                                System.out.println("INFORMATION : SUCCESS!");
                                System.out.println("Congratulation " + UserName + " , you are accepted in Web Development");
                            }
                        }
                        case 3: y = true;
                    }
                } while(!y);
            }

                
            default: {
            }
        }
    }
}
