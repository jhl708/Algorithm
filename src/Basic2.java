public class Basic2 {

    //중앙값 구하기
    public int med3(int a, int b, int c){
        int med = 0;
        if(c>b){
            if(b>a){
                med = b;
            }else if(a>b){
                med = a;
            }
        }else if(b>c){
            if(c>a){
                med = c;
            }else if(a>c){
                med = a;
            }
        }else if(a>b){
            if(b>c){
                med = b;
            }else if(c>b){
                med = c;
            }
        }
        return med;
    }

    public static void main(String[] args) {

        Basic2 basic2 = new Basic2();
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.println("a의 값 : ");
        int a = scanner.nextInt();
        System.out.println("b의 값 : ");
        int b = scanner.nextInt();
        System.out.println("c의 값 : ");
        int c = scanner.nextInt();

        System.out.println("중앙값은 " + basic2.med3(a,b,c) + "입니다.");*/
        System.out.println(basic2.med3(1,2,3));
        System.out.println(basic2.med3(1,3,2));
        System.out.println(basic2.med3(2,1,3));
        System.out.println(basic2.med3(2,3,1));
        System.out.println(basic2.med3(3,2,1));
        System.out.println(basic2.med3(3,1,2));

    }
}
