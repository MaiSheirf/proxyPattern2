import java.rmi.*;
public class clientRemote {
    public static void main (String[] args) {
        new clientRemote().go();
    }
    public void go() {
        try {
            myRemote service = (myRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = service.sayHello();
System.out.println(s);
} catch(Exception ex) {
        ex.printStackTrace();
        }
}}
