package com.company;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.*;
import java.util.Random;
import java.time.temporal.ChronoUnit;
public class Main {

    public static void main(String[] args) {
        // write your code here
        // gets current date
        Scanner input = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        System.out.println("Today date: "+date);
        // gets birthdate
        System.out.println("year of birth: ");
        int BirthYear = input.nextInt();
        System.out.println("month of birth: ");
        int BirthMonth = input.nextInt();
        System.out.println("day of birth: ");
        int BirthDay = input.nextInt();
        // makes birthdate
        LocalDate BirthDate = LocalDate.of(BirthYear, BirthMonth, BirthDay);
        System.out.println("date of birth: "+BirthDate);
        // gets time of birth
        System.out.println("hour of birth: ");
        int BirthHour = input.nextInt();
        System.out.println("minute of birth: ");
        int BirthMinute = input.nextInt();
        System.out.println("second of birth: ");
        int BirthSecond = input.nextInt();
        LocalDateTime BirthTime = BirthDate.atTime(BirthHour,BirthMinute,BirthSecond);
        System.out.println("date of birth: "+BirthTime);

        // gets time of day
        LocalDateTime dateTime = date.atTime(LocalTime.now());
        System.out.println("date and time now: "+dateTime);

        // gets current  age
        Duration  UserAge =  Duration.between(BirthTime,dateTime);
        System.out.println("user age: "+UserAge);

        // makes life expenctancy
        LocalDate lifeExpectancy = LocalDate.of(74, randNum(1,13), randNum(1,29));

        String Answer = "A";

        System.out.println("do you smoke Y/n");
        Answer = input.next();
        if (Answer.equals("y")){
            lifeExpectancy.minusYears(11);
        }else{
            lifeExpectancy.plusMonths(4);
        }
        System.out.println("exact life Expectancy: "+lifeExpectancy);

        System.out.println("do you eat fatty foods y/n");
        Answer = input.next();
        if (Answer.equals("y")){
            lifeExpectancy.minusYears(3);
        }else{
            lifeExpectancy.plusMonths(6);
        }
        System.out.println("exact life Expectancy: "+lifeExpectancy);





        LocalDateTime exactLifeExpectancy = lifeExpectancy.atTime(randNum(1,24),randNum(1,60),randNum(1,60));
        System.out.println("exact life Expectancy: "+exactLifeExpectancy);




        // dif in life expectancy and age
        LocalDate time = LocalDate.of(1,1,1);
        LocalDateTime startTime = time.atTime(1,1,1);
        Duration  lenLife =  Duration.between(startTime,exactLifeExpectancy);
        UserAge.toSeconds();

        lenLife.toSeconds();

        UserAge.minus(lenLife);

        // gives time left
        System.out.println("time left is:"+lenLife.toDays()+" days:");
        System.out.println("Hour :"+randNum(0,23));
        System.out.println("minetes :"+randNum(0,59));
        System.out.println("seconds :"+randNum(0,59));


    }
    public static int randNum(int min , int max)
    {Random randNum = new Random();

        return randNum.nextInt(max - min )+min ;

    }

}