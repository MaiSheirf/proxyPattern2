
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class myRemoteImp extends UnicastRemoteObject implements myRemote {
    public myRemoteImp() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hey";
    }
    public static void main(String [] args)
    {
        try {
            myRemote service = new myRemoteImp();
            Naming.rebind("RemoteHello", service);
        } catch (MalformedURLException | RemoteException malformedURLException) {
            malformedURLException.printStackTrace();
        }
    }
}
