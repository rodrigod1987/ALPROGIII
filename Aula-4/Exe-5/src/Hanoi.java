public class Hanoi {

    public void executar(int numberOfDisks, String a, String b, String c){
        if (numberOfDisks > 0) {
            executar(numberOfDisks - 1, a, c, b);
            System.out.println("Mova o disco "+numberOfDisks+" da " + a + " para a " + c + "!");
            executar(numberOfDisks - 1, b, a, c);

        }
    }

}
