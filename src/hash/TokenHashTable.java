/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*package hash;

/**
 *
 * @author Sistemas
 */
/*public class Hash {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
*/
import java.util.HashMap;

public class TokenHashTable {
    public static void main(String[] args) {
       String multilineText = "int suma = 0;\n" +
"             suma = 54 + 20;";
        HashMap<String, String> tokenTable = new HashMap<>();

        String[] lines = multilineText.split("\n");
        for (int row = 0; row < lines.length; row++) {
            String line = lines[row];
            String[] tokens = line.split("\\s+");
            for (int col = 0; col < tokens.length; col++) {
                String token = tokens[col];
                String hashKey = row + "," + col;
                tokenTable.put(hashKey, token);
            }
        }

        for (String hashKey : tokenTable.keySet()) {
            String token = tokenTable.get(hashKey);
            System.out.println("Clave Hash: " + hashKey + ", Token: " + token);
        }
    }
}
