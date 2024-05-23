package UF4.pr63;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        ArrayList<esport> esports = new ArrayList<esport>();
        esports.add(new futbol());
        esports.add(new hoquei());
        esports.add(new tenis());

        for (int i = 0; i < esports.size(); i++) {
            System.out.println(esports.get(i).getClass());
            System.out.println(esports.get(i).getNumjugadors());
        }
    }
}
