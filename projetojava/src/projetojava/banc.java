package projetojava;

public class banc {
    private static String[][] banco = new String[20][2];
    private static int count = 0;
    public static void addUser(String a) {
        banco[count][0] = a;
    }
    public static void addSenha(String b) {
        banco[count][1] = b;
    }
    public static void userAdded() {
        count = count + 1;
    }
    public static String print(int a, int b) {
        return banco[a][b];
    }
    public static int val() {
        return count;
    }
    public boolean existe(String a) {
        int b = 0;
        for (int i = 0; i < 20; i++) {
            if (a.equals(banco[i][0])) {
                b++;
            }
        }
        if (b > 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean logg(String login, String senha) {
        int a = 0;
        for (int i = 0; i < count; i++) {
            if (banco[i][0].equals(login) && banco[i][1].equals(senha)) {
                a++;
            } else {}

        }
        if (a > 0) {
            return true;
        } else {
            return false;
        }
    }

}