package app;

public class Facebook {
    public static String metodo1(int x){
        
        if (x%15==0) {
            return "Facebook" ;
        }else if(x%3==0){
            return "Face";
        }else if(x%5==0){
            return "Book";
        }else{
            String resul=""+x+"";
            return resul;
        }
        
    }
    public static String metodo2(int[] v){
        String mensa="";
        for (int i=0; i<v.length; i++){
            if (v[i]%15==0) {
                mensa+= "Facebook" ;
            }else if(v[i]%3==0){
                mensa+= "Face";
            }else if(v[i]%5==0){
                mensa+= "Book";
            }else{
                String none=""+v[i]+"";
                mensa+= none;
            }
            mensa+=" ";
        }
        
        return mensa;

    }

}
