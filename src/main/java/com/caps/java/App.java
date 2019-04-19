package com.caps.java;

public class App 
{
    public static void main( String[] args )
    {
        Person p = new Person();
        p.setName("Bhargava");
        p.setEmail("bhargava@gmail.com");
        
        SoftwareTester job1 = new SoftwareTester();
        p.setJob(job1);
        p.getJob().doJob();
    }
}
