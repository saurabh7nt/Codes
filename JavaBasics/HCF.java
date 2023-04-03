public class HCF {
    public static void main(String[]args){
        int x=24, y=28, hcf=0;
        
        for(int i=1; i<=x ; i++){
            if(x % i==0 && y % i==0) {
                hcf = i;
            }
        }
        int lcm = x * y / hcf;
        System.out.println(lcm);
        System.out.println(hcf);

    }
}
