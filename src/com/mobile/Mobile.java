package com.mobile;

interface SimCard
{
  public void call();
  public void sms();
}
abstract class Service implements SimCard
{
  public void call()
 {
   System.out.println("unlimited call services is provided");
 }
  public void sms()
 {
   System.out.println("Sms provided with calls");
 }
}
class Airtel extends Service
{
  public void feature()
 {
   System.out.println("We will keep you inform about all technical issues and solve your all issues");
 }
}
class Jio extends Service
{
  public void mms()
 {
   System.out.println("Along with sms we also provide Mms Feature");
 }
  public void data()
 {
   System.out.println("we also give you 1 GB data per day");
 }
}
public class Mobile
{
  public static void main(String args[])
 {
   SimCard s1=new Airtel();
   s1.call();
   s1.sms();
   ((Airtel) s1).feature();
  System.out.println("--------------------------------------------------------");
   s1=new Jio();
   s1.call();
   s1.sms();
   ((Jio) s1).mms();
   ((Jio) s1).data();
  }
}