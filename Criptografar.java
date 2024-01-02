import java.util.Scanner;

public class Criptografar {

    static String criptografado;
    static String descriptografado;

    public static void criptografar(String valor) {
      
        descriptografado = valor;
        String criptografar = valor
          .replace("a", "1")
          .replace("b", "3")
          .replace("c", "5")
          .replace("d", "2")
          .replace("e", "%")
          .replace("f", "-")
          .replace("g", "()")
          .replace("h", "1")
          .replace("i", ",")
          .replace("j", "}")
          .replace("l", "+")
          .replace("m", "'")
          .replace("n", "*")
          .replace("o", "/")
          .replace("p", "&")
          .replace("r", "#")
          .replace("t", "@")
          .replace("u", "!")
          .replace("v", "|")
          .replace("w", "?")
          .replace("x", "º")
          .replace("y", "[")
          .replace("z", "_")
          .replace("1", "º")
          .replace("2", "[")
          .replace("3", "_")
          .replace("4", "º")
          .replace("5", "[")
          .replace("6", "_")
          .replace("7", "_")
          .replace("8", "º")
          .replace("9", "~")
          .replace("A", "1")
          .replace("B", "3")
          .replace("C", "5")
          .replace("D", "2")
          .replace("E", "%")
          .replace("F", "-")
          .replace("G", "()")
          .replace("H", "1")
          .replace("I", ",")
          .replace("J", "}")
          .replace("L", "+")
          .replace("M", "'")
          .replace("N", "*")
          .replace("O", "/")
          .replace("P", "&")
          .replace("R", "#")
          .replace("T", "@")
          .replace("U", "!")
          .replace("V", "|")
          .replace("W", "?")
          .replace("X", "º")
          .replace("Y", "[")
          .replace("Z", "_")
          .replace(" ", "");
          
          criptografado = criptografar;
          
    }
}
