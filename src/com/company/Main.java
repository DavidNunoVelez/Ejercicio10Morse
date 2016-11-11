package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // se encarga de recibir el texto a traducir
    // y devolver el texto traducido

    public static String morse(String textoAtraducir){

        String traduccionCompleta="";
        char letraQueToca;
        String letraTraducida;
        int i;
        // IMPORTANTE Y NUEVO!!!!!!!!!!!

        for (i = 0; i < textoAtraducir.length() ; i++) {
            letraQueToca= textoAtraducir.charAt(i);
            letraTraducida=traducirLetra(letraQueToca);
            traduccionCompleta=traduccionCompleta + letraTraducida;
        }
        return traduccionCompleta;
    }
    //recibe un char y devuelve su traduccion morse en string
    private static String traducirLetra(char letra) {

      switch (letra){
          case 'a':
              return ".-";
          case 'b':
              return "-...";
          case 'c':
              return "-.-.";
          case 'd':
              return "-..";
          case 'e':
              return ".";
          case 'f':
              return "..-.";
          case 'g':
              return "--.";
          case 'h':
              return "....";
          case 'i':
              return "..";
          case 'j':
              return ".---";
          case 'k':
              return "-.-";
          case 'l':
              return ".-..";
          case 'm':
              return "--";
          case 'n':
              return "-.";
          case 'ñ':
              return "--.--";
          case 'o':
              return "---";
          case 'p':
              return ".--.";
          case 'q':
              return "--.-";
          case 'r':
              return ".-.";
          case 's':
              return "...";
          case 't':
              return "-";
          case 'u':
              return "..-";
          case 'v':
              return "...-";
          case 'w':
              return ".--";
          case 'x':
              return "-..-";
          case 'y':
              return "-.--";
          case 'z':
              return "--..";
          case '1':
              return ".----";
          case '2':
              return "..---";
          case '3':
              return "...--";
          case '4':
              return "....-";
          case '5':
              return ".....";
          case '6':
              return "-....";
          case '7':
              return "--...";
          case '8':
              return "---..";
          case '9':
              return "----.";
          case '0':
              return "-----";
          case '.':
              return ".-.-.-";
          case ',':
              return "--..--";
          case '?':
              return "..--..";
          case '!':
              return "-.-.--";
          case '"':
              return ".-..-.";
          case ' ':
              return "  ";
          default:
              return "Caracter erroneo";
      }
  }

    public static void main(String[] args) throws IOException {

        String textoUsuario;
        String textoUsuarioMinusculas;
        BufferedReader br;

        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe el texto que desees convertir en morse: ");

        textoUsuario = br.readLine();

        while (!textoUsuario.equalsIgnoreCase("stop")) {

            textoUsuarioMinusculas = textoUsuario.toLowerCase();

            System.out.print("La traducción a morse es la siguiente: " + morse(textoUsuarioMinusculas));

            br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Escribe el texto que desees convertir en morse: ");

            textoUsuario = br.readLine();
        }
        if(textoUsuario.equalsIgnoreCase("stop")){
            System.out.print("Has elegido salir!!!!!! Hasta luego");
        }
    }
}
