import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class supermercado {


     public static void main(String[] args){

        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingresa el numero de productos");
        String numero_cadena = br.readLine();
        int numero = Integer.parseInt(numero_cadena);
        System.out.println("ingresaste : " + numero_cadena + " " + "productos");

        int precios[] = new int [numero];
        String productos[] = new String[numero];


        for( int i = 0; i<numero;i++){

            System.out.println("ingrese el nombre del producto");
            String producto = br.readLine();
            System.out.println("ingrese el precio del producto");
            String precio_cadena = br.readLine();
            int precio = Integer.parseInt(precio_cadena);
            productos[i] = producto; 
            precios[i] = precio;
            
            
            
        }



        }

        catch(IOException e){

        }

    }
    
}
