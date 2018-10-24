package serie4;

public class Dechiffre {

    private static StringBuilder str = new StringBuilder(Chiffre.getText());

    /*


4. Quadrierung aller Zahlenwerte, z.B. aus sTf4h wird sTf16h.
5. Einfügen von Leerzeichen vor jedem ’k’ und Zeilenumbrüchen nach jedem ’l’ (kleines L), dem
ein ’o’ folgt.
6. Reversierung aller Zeichenketten, die mittels Leerzeichen oder Zeilenumbruch getrennt sind.
*/

    public Dechiffre (StringBuilder str){
        Dechiffre.str = str;
    }

    public static String replace1() {
        //1. Ersetzen aller Zeilenumbrüche durch ’:’ und aller Leerzeichen durch ’#’.
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '\n'){
                str.replace(i, i+1,":");
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                str.replace(i, i+1,"#");
            }
        }
        //2. Verschiebung aller Zeichen um -3 Positionen mit Hilfe der ASCII-Tabelle.
        for (int i = 0; i < str.length(); i++) {
            int c = (int) str.charAt(i) - 3;
            char d = (char) c;
            String s;
            s = String.valueOf(d);
            str.replace(i, i + 1, s);
        }
        //3. Ersetzen aller ’f’ durch ’q’ sowie aller ’q’ durch ’f’.
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'f' || str.charAt(i) == 'q') {
            }
        }

        return str.toString();
    }
}
