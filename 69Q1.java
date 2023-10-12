public class Main {
    public static void main(String[] args){
        Transferable[] parts = {new Switch(), new Router()};

        for (Transferable work : parts) {
            work.transfer();
        }
    }

public interface Transferable {
    public void transfer();
}

public class Switch implements Transferable{
    @Override
    public void transfer(){
        System.out.println("MAC");
    }
}

public class Router implements Transferable{
    public void transfer(){
        System.out.println("IP");
    }
}
}
