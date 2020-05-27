package iLoops;

public class  CancionElefantes {

    public static void main(String[] args) {
        String plural = " Elefantes se columpiaban";

        for (int i=1;i<=100;i++){
            if (i == 1){
                System.out.println(i + " Elefante se columpiaba sobre la tela de una araña,\n" +
                        "como veia que resistia, fue a llamar a otro elefante");
            }
            else{
                System.out.println(i + plural + " sobre la tela de una araña,\n" +
                        "como veian que resistian, fueron a llamar a otro elefante");
            }

        }

    }

}
