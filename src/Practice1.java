public class Practice1 {

    //4개 정수의 최댓값
    public int max4(int a, int b, int c, int d){
        int max = a;
        if(b>max) max=b;
        if(c>max) max=c;
        if(d>max) max=d;
        return max;
    }

    //3개 정수의 최솟값
    public int min3(int a, int b, int c){
        int min = a;
        if(b<min) min=b;
        if(c<min) min=c;
        return min;
    }

    //4개 정수의 최솟값
    public int min4(int a, int b, int c, int d){
        int min = a;
        if(b<min) min=b;
        if(c<min) min=c;
        if(d<min) min=d;
        return min;
    }

    public static void main(String[] args) {
        Practice1 practice1 = new Practice1();
        int max4 = practice1.max4(15,12,13,14);
        System.out.println("max4 : "+ max4);
        int min3 = practice1.min3(10,8,7);
        System.out.println("min3 : "+ min3);
        int min4 = practice1.min4(20,19,18,17);
        System.out.println("min4 : "+min4);

    }
}
