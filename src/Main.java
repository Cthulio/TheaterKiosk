import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //class TicketKiosk
        //  main()
        //      num yourAge
        //      Output “How old are you?”
        //      Input yourAge
        //      if yourAge >= 21 then
        //          Output “You get a wrist band!”
        //      end if
        //  return
        //end class
        Scanner in = new Scanner(System.in);
        int yourAge;//I could have done double here for someone who wanted to do the division, but for simplicity I did int.
        System.out.println("How old are you?");
        yourAge = in.nextInt();
        in.nextLine();
        if(yourAge >= 21 ) {
            System.out.println("You get a wrist band!");
        }
    }
}