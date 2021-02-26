/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel02_2021;

/**
 *
 * @author xp
 */
public class EjerciciosNivel02_2021 {
    public boolean esEscaleraDePalabras( char [][] listaPalabras){
        int contador1 = 0;
        
        for (int i=0; i<listaPalabras.length-1; i++){ //el bucle que procesa todas las filas
            contador1 = 0; //inicializo el contador de diferencias antes de empezar el bucle interno
            for (int j=0; j<listaPalabras[0].length; j++){
                if(listaPalabras[i][j] == listaPalabras[i+1][j]){
                System.out.println("SON IGUALES");
                }
                else{
                    System.out.println("SON DISTINTOS");
                    contador1++; //las letras son diferent4es
                }
                
            }
            System.out.println("" + contador1); 
            if (contador1 != 1){
                return false; //si en algún momento las palabras se diferencian en más de una letra returne false
            }
        }
        
        return true;
    }
    
    public int costeErroresADN(String uno, String dos){
        //primera versión, usando los dos Strings que me pasan
        int coste = 0; //coste de los errores
        
        for (int i=0; i < uno.length(); i++){
            if(uno.charAt(i)== '-' || dos.charAt(i)== '-'){
                coste = coste + 2;
            } else {
                if(uno.charAt(i)== 'G' && dos.charAt(i) != 'C') {coste++;}
                if(uno.charAt(i)== 'C' && dos.charAt(i) != 'G') {coste++;}
                if(uno.charAt(i)== 'A' && dos.charAt(i) != 'T') {coste++;}
                if(uno.charAt(i)== 'T' && dos.charAt(i) != 'A') {coste++;}
            }
            
        }
        return coste;
    }
    /**
     * Encuentra el número qu está duplicado en una lista de ints
     * usando el algoritmo de Floyd
     * @param listaNumeros
     * @return 
     */
    // [1, 3, 2, 4, 4]
    public int findDuplicate(int [] listaNumeros){
        int tortuga = listaNumeros[0];
        int liebre = listaNumeros[0];
        boolean iguales = false;
        while (!iguales){
            tortuga = listaNumeros[tortuga];
            liebre = listaNumeros[listaNumeros[liebre]];
            if (tortuga == liebre){
                iguales = true;
            }
        }
        int aux1 = listaNumeros[0];
        int aux2 = tortuga;
        while (aux1 != aux2){
            aux1 = listaNumeros[aux1];
            aux2 = listaNumeros[aux2];
        }
        return aux1;
    }
    
     public String quitaAcentosV2(String cadena){
        String auxiliar = "";
        for (int i=0; i < cadena.length(); i++){
            if (cadena.charAt(i)== 'á'){auxiliar = auxiliar + 'a'; }
            else if (cadena.charAt(i)== 'é'){auxiliar = auxiliar + 'e'; }
            else if (cadena.charAt(i)== 'í'){auxiliar = auxiliar + 'i'; }
            else if (cadena.charAt(i)== 'ó'){auxiliar = auxiliar + 'o'; }
            else if (cadena.charAt(i)== 'ú'){auxiliar = auxiliar + 'u'; }
            else if (cadena.charAt(i)== 'ü'){auxiliar = auxiliar + 'u'; }
            
            else if (cadena.charAt(i)== 'Á'){auxiliar = auxiliar + 'A'; }
            else if (cadena.charAt(i)== 'É'){auxiliar = auxiliar + 'E'; }
            else if (cadena.charAt(i)== 'Í'){auxiliar = auxiliar + 'I'; }
            else if (cadena.charAt(i)== 'Ó'){auxiliar = auxiliar + 'O'; }
            else if (cadena.charAt(i)== 'Ú'){auxiliar = auxiliar + 'U'; }
            else if (cadena.charAt(i)== 'Ü'){auxiliar = auxiliar + 'U'; }
            else {
                auxiliar = auxiliar + cadena.charAt(i);
            }
        }
        return auxiliar;
    }
    
    public int strStr (String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        str1 = quitaAcentosV2(str1);
        str2 = quitaAcentosV2(str2);
        int posicion = -1;
        //supoinemos que no hay acentos y  que todo es minúscula
        for (int i = 0; i < str1.length(); i++){
            
            if(str1.charAt(i)==str2.charAt(0)){
                posicion = i;
                int j=0; //indice para buscar en el str2
                while ((j<str2.length() && i < str1.length()) && str1.charAt(i) == str2.charAt(j)){
                    j++;
                    i++;
                }
                //el while ha terminado y puede haber salido por varias razones
                //la primera, que alguno de los dos length se haya termminado
                //la segunda, que alguna letra sea distinta
                
                if (j >= str2.length()){
                    //Si ha salido porque ya no tenía más letras el str2, significa que el
                    //str2 está dentro del str1 y además, su posición está guardada en 
                    //posición
                    return posicion;
                }
                
                if (i >= str1.length()){
                    //Si ha salido porque ya no tenía más letras el str1, significa que el
                    //str2 de momento NO está dentro del str1
                    return -1;
                }
                
                if (str1.charAt(i) != str2.charAt(j)){
                    i = posicion;
                    posicion = -1;
                }
            }
        }
        
        return posicion;
    }
    
    public String calculadoraRPN (String[] entrada){
        String pila [] = new String [100];
        int posicionPila = 0; //indica el sitio de la pila en el que toca insertar o leer
        for (int i = 0; i < entrada.length; i++){
           
            if (entrada[i] != "+" && entrada[i] != "-"&& entrada[i] != "*" && entrada[i] != "/"){
                //System.out.print(entrada [i] + " ");
                //es un operando, tengo que meterlo en la pila
                pila [posicionPila] = entrada[i];
                posicionPila++;
            }
            else{//es una operación
                if (posicionPila-2 >= 0){
                    Double operando1 = Double.valueOf(pila[posicionPila - 1]);
                    Double operando2 = Double.valueOf(pila[posicionPila - 2]);
                    if (entrada[i] == "*"){
                        operando1 = operando1 * operando2;
                    }         
                    if (entrada[i] == "+"){
                        operando1 = operando1 + operando2;
                    } 
                    posicionPila = posicionPila - 2;
                    pila[posicionPila] = operando1 + ""; //guardo el resultado en la casilla corespondiente
                    posicionPila++;
                }
            }
        }
        return pila[0];
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main (String[] args){
        EjerciciosNivel02_2021 ejercicio = new EjerciciosNivel02_2021();
        char [][] listaPalabras = {
        {'P', 'A', 'T', 'A'},
        {'P', 'A', 'T', 'O'},
        {'R', 'A', 'T', 'O'},
        {'R', 'A', 'M', 'O'},
        {'G', 'A', 'M', 'O'},
        {'G', 'A', 'T', 'O'},
        {'M', 'A', 'T', 'O'},
    };
        
        System.out.println(ejercicio.esEscaleraDePalabras(listaPalabras));
        
        
        
        System.out.println(ejercicio.findDuplicate(new int[] {3,2,3,4,1}));
        System.out.println(ejercicio.findDuplicate(new int[] {4,2,3,4,1}));
        System.out.println(ejercicio.findDuplicate(new int[] {1,1,3,4,1}));
        
        System.out.println(ejercicio.strStr("hola Helios!", "el"));
        System.out.println(ejercicio.strStr("hola Mundo", "Mun"));
        System.out.println(ejercicio.strStr("hola MynMu", "Mun"));
        System.out.println(ejercicio.strStr("hola MMunn", "Mun"));
        System.out.println(ejercicio.strStr("hola MuMun", "Mun"));
        System.out.println(ejercicio.strStr("hola MuMu", "Mun"));
        System.out.println(ejercicio.strStr("hola MMunn", "mun"));
        System.out.println(ejercicio.strStr("Mumn", "Mun"));
        
        System.out.println(ejercicio.calculadoraRPN(new String[] {"3", "7", "*"}));
        System.out.println(ejercicio.calculadoraRPN(new String[] {"3", "2" ,"+", "7", "*"}));
        ejercicio.calculadoraRPN(new String[] {"3", "2" ,"+", "7", "*", "15", "21", "+", "-"});
        
    }
    
}
