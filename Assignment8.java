package com.company.JavaAssignment8;
import java.util.logging.Logger;
//creating three user exceptional classes
class MyException1 extends Exception{
    int a;
    MyException1(int b) {
        a = b;
    }
    public String toString(){
        return ("Exception Number =  " + a) ;
    }
}
class MyException2 extends Exception{
    int a;
    MyException2(int b) {
        a = b;
    }
    public String toString(){
        return ("Exception Number =  " + a) ;
    }
}
class MyException3 extends Exception{
    int a;
    MyException3(int b) {
        a = b;
    }
    public String toString(){
        return ("Exception Number =  " + a) ;
    }
}

class UserException {
    public static void throwAllExceptions(int a) throws MyException1, MyException2, MyException3 {
        try {
            //if a is 1, it moves to user exception 1. if a is 2, it moves to user exception 2. Similarly, third one
            if (a == 1)
                throw new MyException1(1);
            else if (a == 2)
                throw new MyException2(2);
            else if (a == 3)
                throw new MyException3(3);
        }
        catch (Exception e) {
            throw e;
        }
    }
    public static void main(String args[]) {
        Logger LOGGER = Logger.getAnonymousLogger();
        try{
            throwAllExceptions(3); // using one throw handling all exceptions
        }
        catch(MyException1 | MyException2 | MyException3 e ) { // it catches any exception
            LOGGER.info("Exception: " + e);
        }
        finally {
            LOGGER.info("Finally block is getting executed...");
        }
    }
}
