
import java.util.Scanner;


public class Main {
    public static void main(String [] args)
    {
        
        String sys_kullanici_adi="Busra Atalar";
        String sys_parola="5769";
        int giris_hakki=3;
        
        Scanner scanner = new Scanner(System.in);
        
        
        while(true)
        {
            System.out.println("Lütfen kullanıcı adınızı girin....");
            String kullanici_adi=scanner.nextLine();

            System.out.println("Lütfen parolanızı girin...");
            String parola=scanner.nextLine();

            
            
            if(sys_kullanici_adi.equals(kullanici_adi) && sys_parola.equals(parola))
            {
                System.out.println("Hoşgeldiniz......");
                break;
            }
            
            else if(sys_kullanici_adi.equals(kullanici_adi) && !sys_parola.equals(parola))
            {
                System.out.println("Parola yanlış....");
                giris_hakki--;
                System.out.println(giris_hakki +"girişiniz kaldı...");
            }
            
            
            else if(!sys_kullanici_adi.equals(kullanici_adi) && sys_parola.equals(parola))
            {
                System.out.println("Kullanıcı adı yanlış...");
                giris_hakki--;
                System.out.println(giris_hakki +"girişiniz kaldı...");
            }
            
            else
            {
                System.out.println("Kullanıcı adı ve parola yanlış...");
                giris_hakki--;
                System.out.println(giris_hakki +"girişiniz kaldı...");
                
            }
            
            if(giris_hakki==0)
            {
                System.out.println("Giriş hakkınız bitti...");
                break;
            }
            
            
            
            
            
            
        }
                
        
        
        
        
        
        
        
        
    }
}
