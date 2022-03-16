
package webdetailsfinder;

import java.util.Scanner;

public class WebDetailsFinder {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter URL: ");
        String web = sc.nextLine();
        
        String protocol = web.substring(0,web.indexOf(":"));
        String domain = web.substring(web.lastIndexOf(".")+1);
        if(protocol.equals("http"))
        {
            System.out.println("Hyper Text Transfer Protocol");
        }
        else if(protocol.equals("https"))
        {
            System.out.println("Hyper Text Transfer Protocol Secure");
        }
        else if(protocol.equals("ftp"))
        {
            System.out.println("File Transfer Protocol");
        }
        
        //==
        
        if(domain.equals("com"))
        {
            System.out.println("Domain is :"+domain);
        }
        else if(domain.equals("net"))
        {
            System.out.println("Domain is :"+domain);
        }
        else if(domain.equals("biz"))
        {
            System.out.println("Domain is :"+domain);
        }
        else if(domain.equals("org"))
        {
            System.out.println("Domain is :"+domain);
        }
        
    }
    
}
