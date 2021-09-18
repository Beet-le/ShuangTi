package Day916;

public class Demo03 {

    public static void main(String[] args) {
/*        String Phone="13008322962";
//        String Emil="3069147@qq.com";
        String Emil="xxxxxxxxx@xx.xx";


        char tel = Phone.charAt(0);
//        int length = paw.length();
     *//*   if(tel!=1&&Phone.length()==11){

        }*//*
        int i = Emil.indexOf("@");
        if (i>0){
            System.out.println("合法");
        }
        System.out.println(i);*/
        System.out.println("================================");

        System.out.println(System.currentTimeMillis());
        long startime=System.currentTimeMillis();
        StringBuffer stub=new StringBuffer();
        StringBuilder stubd=new StringBuilder();      /*Builde  >  Buffer*/
        String str=null;
        for (int i1 = 0; i1 < 10000000; i1++) {
            stub.append(i1);
//              stubd.append(i1);
//            str+=i1;
        }
        long endtime=System.currentTimeMillis();
        System.out.println(endtime-startime);

    }

}
