package com.sdajava.jsoncolec;

import com.google.gson.Gson;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Employee> employeeList =
                Arrays.asList(new Employee("adam", "Warzecha", 1, 2222.0),
                        new Employee("adam2", "Waecha2", 2, 233222.0),
                        new Employee("adam3", "Waecha3", 3, 222222.0),
                        new Employee("adam4", "Warzecha4", 4, 233222.0));

        Gson gson = new Gson();
        //System.out.println(gson.toJson(employeeList));

       // Boss boss1 =
            //    new Boss(1, "Artur", "Rozgowski", employeeList);

        //System.out.println(gson.toJson(boss1));

        Map<Integer, List<Employee>> employeeMap = new HashMap<Integer, List<Employee>>();

        employeeMap.put(1, employeeList);
        employeeMap.put(2, employeeList);
        employeeMap.put(3, employeeList);

        Boss boss =
                new Boss(1, "Artur", "Rozgowski", employeeMap);
        //System.out.println(gson.toJson(boss));

        Boss boss2 =
                new Boss(2, "Artur", "Rozgowski", employeeMap);
        Boss boss3 =
                new Boss(3, "Artur", "Rozgowski", employeeMap);

        List<Boss> bossesList =
                Arrays.asList(boss, boss2, boss3);

        Master master =
                new Master(1, "Mikołaj", "Kopernik", bossesList);

        System.out.println(gson.toJson(master));

    }
}
