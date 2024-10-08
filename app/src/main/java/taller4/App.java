/*
 * This source file was generated by the Gradle 'init' task
 */
package taller4;



public class App {
    

    public static void main(String[] args) {
        System.out.println(impares(122));
        System.out.println(fibo(5));
        System.out.println(raiz());
        System.out.println(aleatorios(232, 1500));
        System.out.println(suma_aleatorios(23));
        System.out.println(loteria());
        


    }

    /* TODAS LAS FUNCIONES DEBEN LLEVAR CONTROL DE ERRORES, SI EL ENUNCIADO NO LO ESPECIFICA, LO DEBES PONER
     * DE ACUERDO CON TU CRITERIO
     */

    /* 
     * 1.	Escriba una función que reciba un entero positivo entre 100 y 500 y retorne en un texto todos los números impares desde 1 
     * hasta ese número separados por comas en grupos de hasta 8 números.
     * 
     * 
    */
    /**
     * 
     * 
     */
    public static  String impares(int num){
        try {
            String mensaje = "";
            final int division = 2, salto_linea = 8, num_max =  500, num_min = 100;
            int contador  = 0;
            
            if(num >= num_min && num <= num_max){
                
                for(int inicio = 1; inicio <= num; inicio += division){
                    
                    
                    
                    
                    if(contador++ % salto_linea == 0){
                        mensaje += "\n";
                    }
                    mensaje += inicio + " . ";
                    
                
                }
            }
            else{
                return "numero incorrecto";
            }
            return mensaje;
            
        } catch (Exception e) {
            return "hay un error";
        }
        
        
    }

    /* 2. 	Escriba una función que reciba un entero N mayor de 2  y retorne un string cono esos N términos de la 
    serie de Fibonacci (La sucesión de Fibonacci se trata de una serie infinita de números naturales que empieza con un 0 y un 1 
    y continúa añadiendo números que son la suma de los dos anteriores: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 
    987, 1597…)
     * 
     * 
    */
    public static String fibo(int N){
        try {
            String mensaje = "";    
            final int  min = 2;
            int b = 1;
            int a = 0;
            if(N > min)

            for(int i=0; i < N; i++){
            int c = a+b;
            a = b;
            b = c;
            mensaje += c + " . "; 

            }

            return mensaje;
        } catch (Exception e) {
            return "error";
        }
        
    }
    
    
    /* 
     * 3.	Diseñar y desarrollar una función que NO reciba datos de entrada, genere aleatoriamente un número entre 2 y 355, 
       le calcule su raíz cuadrada y retorne este valor. Para calcular las raíces usar la función Sqrt de la biblioteca Math.

       En el main, antes de invocar la función, se debe calcular un aleatorio entre 20 y 30 el cual establecerá la cantidad 
       de veces que va a llamar a la función y en un ciclo, mostrar los resultados.

    */
    public static String raiz(){
        try {
            String mensaje = "";
            double resultado = 0;
            final short  limite_inf = 2, lim_sup = 355, ale_1 = 20, ale_2 = 30;
            int ciclo = (int)(Math.random() * (ale_2 - ale_1 + 1)) + ale_1;

            for(int a = 1; a <= ciclo; a++){
                int aleatorio = (int)(Math.random() * (lim_sup - limite_inf + 1)) + limite_inf;
                resultado = Math.sqrt(aleatorio);

                mensaje += "la raiz de "+ aleatorio +" es " +resultado + "\n";
            }
            return mensaje;
        } catch (Exception e) {
            return "error";
        }
        
        
        
    

    }


    /*4.	Diseñar y desarrollar una función que reciba un valor inicial y un valor final, para generar 900 números aleatorios 
        en este rango y retorne un texto que diga cuántos números pares fueron generados. Controle que el nro inicial sea menor que 
        nro final para establecer el rango.

        Llame la función desde el main e imprimir el resultado arrojado.

    */

    public static String aleatorios(int v_inicial, int v_final){
        try {
            int rango = 0, pares = 0;
            String mensaje = "";
            final short cantidad = 900, division = 2;
            int cant_pares = 0;
            
            for(int a = 1; a <= cantidad; a++){
                rango = (int)(Math.random()*(v_final-v_inicial)) + v_inicial;
                
                if(rango % division == 0)
                cant_pares++;
            }
            mensaje = "la cantidad de pares fue de: " + cant_pares;
            return mensaje;
        } catch (Exception e) {
            return "error";
        }

    }



    /* 5.	Diseñar y desarrollar una función que calcule una cantidad de números aleatorios que viene como parámetro de entrada 
        y los sume.  La función deberá retornar el total de la suma. Usted defina los rangos que va a usar en el cálculo.

        Llame la función desde el main e imprimir el resultado arrojado.
    */
    public static int suma_aleatorios(int numeros){
        try {
            final int lim_sup = 100, lim_inf = 0;
            int rango = 0, suma = 0;
            
            for (int i = 1; i <= numeros; i++){
                rango = (int)(Math.random()*(lim_sup-lim_inf))+ lim_inf;
                suma += rango;
            }
            return suma;
        } catch (Exception e) {
            return -1;
        }
    }


    /* 6.	Se requiere una función para simular el sorteo de una lotería, de acuerdo con las siguientes condiciones:

            La lotería tiene 20 premios. 

            Cada premio que calcula el programa debe tener el número de 4 cifras entre 0000 y 9999 acompañado de la serie 
            que es un número entre 100 y 150.

            Ejemplo: 5698-101

            Cada premio lo debe imprimir el programa de la siguiente forma (n representa un número cualquiera):

            Sorteo # nn - Número Premiado nnnn - Serie nnn

            Ejm: Sorteo # 19  - Número Premiado 5698 - Serie 101

            Para tener en cuenta la forma en la cual se informan los 20 resultados: 

            Del premio 20 al 6 el programa imprime: 

            ======PREMIOS MENORES=======
            y la lista de los 15 premios 

            Del premio 5 al 2 el programa imprime:
            ======PREMIOS SECOS=========
            y la lista de los 4 premios secos

            AL llegar al premio 1, el programa imprime:
            ======Premio mayor==========
            Y el premio mayor

            Nota: para sacar el premio mayor calcule el random por cada número, como lo hacen en la realidad los sorteos.

            La función no recibe parámetros y devuelve un string con toda la lista de premios. El main, invoca la función 
            e imprime el resultado que esta arroje. 


     * 
     * 
    */
    public static String loteria(){
        try {
            String mensaje = "";
            final int premios = 20,  lim_sup = 9999, lim_inf = 0000, sup_serie = 150, inf_serie = 100, a = 20, b = 5, c= 2, d = 1;
            int r1 = 0, r2 = 0;
            for(int i = 1; i <= premios; i++){

                    r1 = (int)(Math.random()*(lim_sup-lim_inf))+ lim_inf;
                    r2 = (int)(Math.random()*(sup_serie-inf_serie))+ inf_serie;

                

                if(i <= a && i > b ){
                    mensaje += "======PREMIOS MENORES======= \n  " + "Sorteo #"+  i + " - " + "Número Premiado " + r1 + " - Serie " + r2 +"\n\n" + //
                                                "";
                }
                else if(i <= b && i >= c ){
                    mensaje += "======PREMIOS SECOS========= \n  " + "Sorteo #"+  i + " - " + "Número Premiado " + r1 + " - Serie " + r2 +"\n\n" + //
                                                "";
                }
                else if(i == d ){
                    mensaje +="======Premio mayor========== \n  " + "Sorteo #"+  i + " - " + "Número Premiado " + r1 + " - Serie " + r2 +"\n\n";
                }
                
            }
            return mensaje;
        } catch (Exception e) {
            return "error";
        }
    }

}
