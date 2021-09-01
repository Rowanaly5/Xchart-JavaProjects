package org.example.jupai6;

public class Main {

    public static void main(String [] args)  {
        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test() throws Exception {
        IO Jobs = new IO("Wuzzuf_Jobs.csv");
        Jobs.PrintListOfJobs();
        System.out.println("******************************");
        JobsDataService Servies = new JobsDataService();
        System.out.println("Jobs By Country");
        Servies.FilterJobsByCountry(Jobs.jobs);
        System.out.println("**********************************");
        System.out.println("Jobs By Level");
        Servies.FilterJobsByLevel(Jobs.jobs);
        System.out.println("********************************************");
        System.out.println("Jobs By Title");
        Servies.FilterJobsByTitle(Jobs.jobs);
        System.out.println("***********************************");
        System.out.println("Jobs By Years");
        Servies.FilterJobsByYearsExp(Jobs.jobs);
    }

}

