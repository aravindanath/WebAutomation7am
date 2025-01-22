package day3;

public class ForEachLoop {


    public static void main(String[] args) {

        String  names [] = {"John", "Kevin", "Scottt", "Anna", "Sara"};

//        System.out.println(names[1]);

        for(int i=0;i< names.length;i++){
            System.out.println(names[i]);
        }


        System.out.println("********************************");

        for(String ref : names){
            if(ref.equals("Scott")){
                System.out.println("Scott is here");
            }else {
                System.out.println(ref);
            }

        }


    }
}
