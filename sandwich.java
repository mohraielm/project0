package sandwichapp;


public class sandwich {
    private int bread;
    private int vegetables;
    private int meat;
    private double price=0.0;
    private String breadN="";
    private String veggieN="";
    private String meatN="";
    
    
    public sandwich(){
        bread=0;
        vegetables=0;
        meat=0;
        price=0;
    }
    public sandwich(int b,int v, int m, double p){
        this.bread=b;
        this.vegetables=v;
        this.meat=m;
        this.price=p;
    }

    //to get meat
    public void addm(String meat){
        meatN += meat;
    }
    public String mList(){
        return meatN;
    }
    public void getMeat(int meatC){
        meat=meatC;
        if (meatC>5||meatC<1){
                   if (meatC>5){
                    System.out.println("Error! number must be less than 5");
                            }
                    else if( meatC<1){
                    System.out.println("Error! number must be greater than 0");}
            }
        switch(meatC){
            case 1:
                price+=1.0;
                meatN="Ham ";
                break;
            case 2:
                price+=1.1;
                meatN="Roasted Chicken Breast ";
                break;
            case 3:
                price+=1.2;
                meatN="Turkey Breast ";
            case 4:
                price+=1.5;
                meatN="Roast Beef ";
            case 5:
                break;
            default:
                meatN+="";
        }
    }
    String meatO(){
        return meatN;
    }
    
    
    //to get bread
    public void getBread(int breadC){
        bread=breadC;
        if (breadC>5||breadC<1){
                   if (breadC>=5){
                    System.out.println("Error! number must be less than 5");
                            }
                    else if( breadC<1){
                    System.out.println("Error! number must be greater than 0");}
            }
        if(breadC==1){
                    price+=1.5;
                    breadN="White Bread, ";
        }
        else if(breadC==2){
                    price+=1.6;
                    breadN="Wheat Bread, ";
        }
        else if (breadC==3){
                    price+=1.8;
                    breadN="French Bread, ";
        }
        else if (breadC==4){
                    price+=2.0;
                    breadN="Organic Bread, ";
        }
        else{
            breadN+="";
            }}
    
    String breadO(){
        return breadN;
    }
//to get veggies
    
    public void addveg(String veg){
        veggieN += veg;
    }
    public String veggieO(){
        return veggieN;
    }
    public void getVeg(int vegC){
        vegetables=vegC;
        String veggieN="";
        if (vegC>8||vegC<1){
                   if (vegC>8){
                    System.out.println("Error! number must be less than 8");
                            }
                    else if( vegC<1){
                    System.out.println("Error! number must be greater than 0");
                                    }
            }
      
        if(vegC==1){
                    price+=.05;
                    veggieN="red onions, ";
                    addveg(veggieN);
            }
          
        else if(vegC==2){
                    price+=.10;
                    veggieN="olives, ";
                    addveg(veggieN);
            }
        else if(vegC==3){
                    price+=.10;
                    veggieN="pickles, ";
                    addveg(veggieN);
        }
        else if (vegC==4){
                    price+=.20;
                    veggieN="lettuce, ";
                    addveg(veggieN);
            }
        else if(vegC==5) {
                    price+=.25;
                    veggieN="green peppers, ";
                    addveg(veggieN);
            }
        else if (vegC==6) {
                    price+=.30;
                    veggieN="tomatoes, ";
                    addveg(veggieN);
            }
        else if(vegC==7){
                    price+=.50;
                    veggieN="cheese, ";
                    addveg(veggieN);
            }
        else if(vegC==8){
            veggieN+="";
            }
            }
    
 double getprice(){
    return price;
}
   
}
