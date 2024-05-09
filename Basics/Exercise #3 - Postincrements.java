
package postincrementos;

public class PostIncrementos {

    public static void main(String[] args) {
        int j = 10;
        int res = j++ + j;
            System.out.println("Resultado del postincremento con suma: " + res + " y j vale: " + j);
        
        j = 10;
        res = j + ++j;
            System.out.println("Resultado del postincremento con suma: " + res + " y j vale: " + j);
            
        j = 10;
        res = ++j +j;
        System.out.println("Resultado del preincremento con suma: " + res + " y j vale: " + j);
        
        j = 10;
        res = j+ ++j;
        System.out.println("Resultado del preincremento con sumas: " +  res + " y j vale: " + j);
        
        j = 10;
        res = j++ + ++j;
        System.out.println("Resultado del esperpento: " + res + " y j vale: " + j);
    }
    
}
