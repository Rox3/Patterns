public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome! \n");

        int n = 12;

        for(int i = 0, j, a, flag; i <= n; i++){
            for(j = 0, a =0, flag=0; j <= (2*n); j++){
                if((i+j >= n) && (j <= i +n )){
                    //case
                    if(flag == 0){
                        System.out.print(fact (i)/(fact(i-a)*fact(a)));
                        //System.out.print("* ");
                        a++;
                        flag = 1;
                    }
                    else{
                        System.out.print("  ");
                        flag = 0;
                    }
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }

    }

    public static int fact (int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

}
