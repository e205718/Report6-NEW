<<<<<<< HEAD
package jp.ac.uryukyu.ie.e205718;

=======
>>>>>>> origin/master
import java.util.Random;

public class ChanceZone extends Win {
    public void CZ(){

<<<<<<< HEAD
        Suika suika = new Suika();
        Slot slot =  new Slot();
=======
    Suika suika = new Suika();
    Slot slot =  new Slot();
>>>>>>> origin/master

        int count = 0;
        
        Random rand = new Random();
        int num = rand.nextInt(3);//3
<<<<<<< HEAD

=======
>>>>>>> origin/master
        if(num == 0){
            System.out.println("777" + "\n" +"大当たり。。。");
            coincal(315);
        }else{
            suika.czMode =false;
            System.out.println("残念！チャンスゾーン終了");
        }
<<<<<<< HEAD
    }
=======


}
>>>>>>> origin/master
}
