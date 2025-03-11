package ENUM;

public class urls {
    public static void main(String[] args) {
        System.out.println(url.google);
        if(url.kathalon.equals("kathalon")){
            System.out.println("this is kathalon url");
        }
    }
}

enum url{
    google, restassured, kathalon, vmo;
//    https://google.com,
//    https://vmo.login,https://restassured.com;
}
