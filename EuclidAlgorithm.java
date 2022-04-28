public class EuclidAlgorithm {
    public static void main(String[] args) {
//        int a=33;
//        int b=121;
//        int result=Euclid(a,b);
//        System.out.println(result);
        Integer cindy=360;
        System.out.println(System.identityHashCode(cindy));
    }
    public static int Euclid(int a,int b){//左大右小
        int mod=a%b;
        if(mod==0)
            return b;
        else
            return Euclid(b,mod);
    }
}
