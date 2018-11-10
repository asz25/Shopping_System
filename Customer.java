/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awdsa
 */
public class Customer {
    
    private String title = "Mr";
    private String firstN = "John";
    private String lastN = "Doe";
    private String addr1 = "123 Main Street";
    private String addr2 = "";
    private String city = "Carson";
    private String state = "California";
    private String postcode = "12345";
    private char[] visa = {'1'};
    private double total = 0;
    private int order = 0;
    
    public Customer(String title,String firstN, String lastN, String addr1, String addr2, String city, String state, String postcode, char[] visa,double total,int order)
    {
        this.title = title;
        this.firstN = firstN;
        this.lastN = lastN;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.visa = visa;
        this.total = total;
        this.order = order;
    }
    
    public void setTitle(String title)
    {
        this.title=title;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setFirstN(String fname)
    {
        firstN = fname;
    }
    
    public String getFirstN()
    {
        return firstN;
    }
    
    public void setLastN(String lname)
    {
        lastN = lname;
    }
    
    public String getLastN()
    {
        return lastN;
    }
    
    public void setAddr1(String addr1)
    {
        this.addr1 = addr1;
    }
    
    public String getAddr1()
    {
        return addr1;
    }
    
    public void setAddr2(String addr2)
    {
        this.addr2 = addr2;
    }
    
    public String getAddr2()
    {
        return addr2;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public void setState(String state)
    {
        this.state = state;
    }
    
    public String getState()
    {
        return state;
    }
    
    public void setPost(String postcode)
    {
        this.postcode = postcode;
    }
    
    public String getPost()
    {
        return postcode;
    }
    
    public void setVisa(String input)
    {
        visa = input.toCharArray();
            
    }
    
    public String getVisa()
    {
        String result = new String(visa);
        return result;
    }
            
    
    public void setTotal(double total)
    {
        this.total = total;
    }
    
    public double getTotal()
    {
        return total;
    }
    
    public void setOrder(int order)
    {
        this.order = order;
    }
    
    public int getOrder()
    {
        return order;
    }
    
    public String toString()
    {
        String visa_str = new String(visa);
        String result = title+"\n"+firstN+"\n"+lastN+"\n"+addr1+"\n"+addr2+"\n"+"\n"+city+"\n"+state+"\n"+postcode+"\n"+"\n"+visa_str+"\n"+total+"\n"+order ;
        return result;
    }
}
