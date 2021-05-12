package capsulation;

import java.util.*;


// 1. 만약 ipAddress가 int로도 모잘라 long으로 받아야 한다면?
// 2. 만약 process를 담는 컬렉션이 ArrayList에서 LinekedList로 변경된다면?

class Server {
    public int ipAddress;
    public ArrayList<Integer> process;

    public Server(int ipAddress) {
        this.ipAddress = ipAddress;
        this.process = new ArrayList<>();
    }

    public void setIpAddress(int ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getIpAddress() {
        return ipAddress;
    }

    public ArrayList<Integer> getProcess() {
        return process;
    }

    public void request() {
        System.out.println("요청입니다...");
    }

    public void response() {
        System.out.println("응답입니다...");
    }
}


// 클라이언트 코드도 변경되어야함
public class Client {
    public static void main(String[] args) {
        Server server = new Server(127);
        server.ipAddress = 12;
        server.process.add(1);
        server.request();
        server.response();
    }
}
