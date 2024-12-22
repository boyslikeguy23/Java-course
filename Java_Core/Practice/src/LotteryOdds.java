import javax.swing.*;

public class LotteryOdds {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("How many numbers do you need to draw?");
        int k = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("What is the highest number you can draw?");
        int n = Integer.parseInt(input);

        /*
            Compute binominal coefficient
         */
        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds * (n - i + 1)/i;
        }

        JOptionPane.showMessageDialog(null, "Your lottery odds are 1 in " + lotteryOdds);
        System.exit(0);
    }
}
