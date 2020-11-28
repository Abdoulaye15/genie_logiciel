public class Calculator {

        public int sum(int a , int b){
            return a+b;
        }

        public int minus(int a ,int b){
            int c;
            if (a<b)
                return b-a;
            else  return a-b;
        }

        public int divide(int a,int b){

            if (a!=0)
                return b / a;
            else  return a /b;
        }

        public int multiply(int a ,int b){
            int c=a*b;
            return c;
        }

        public int Min(int a, int b){
            return Math.min(a,b);
        }

        public int Max(int a, int b){
            return Math.max(a,b);
        }



    }

