package leetcode;

public class Regx1 {

    //"bbbba"
    //".*a*a"
    public static void main(String[] args) {
        System.out.println(match("", ".*"));
    }

    public static boolean match(String s, String p) {
        if (null == s && null == p) {
            return true;
        }
        if (s.equals("") && p.equals("")) {
            return true;
        }
        return matchCore(s, p, 0, 0);
    }

    private static boolean matchCore(String s, String p, int i, int j) {
        boolean sb = s.length() <= i;
        boolean pb = p.length() <= j;
        if (sb && pb) {
            return true;
        }

        if (pb) {
            return false;
        }

        char sc ='\0';
        if(!sb)    sc    = s.charAt(i);
        char pc = p.charAt(j);
        char pcn = '\0';
        if (j + 1 < p.length()) {
            pcn = p.charAt(j + 1);
        }
        char star = '*';
        char point = '.';

        if (pcn == star ) {
            if((pc==sc || (pc==point && !sb))) {
                return matchCore(s, p, i + 1, j + 2)
                        || matchCore(s, p, i + 1, j)
                        || matchCore(s, p, i, j + 2);
            }else if(pc==point && sb){
                return matchCore(s,p,i,j+2);
            }
            else return matchCore(s,p,i,j+2);
        }
        if ((pc==sc || (pc==point && !sb))) {
            return matchCore(s, p, i + 1, j + 1);
        }
        return false;
    }
}
