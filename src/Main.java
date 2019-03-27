import ONPExceptions.ONPException;
import Tools.Expression;
import Tools.miscs.Set;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.System.out;

/**
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner iScan = new Scanner(System.in);
        Set varSet = new Set();
        while(true)
        {
            String buff = iScan.nextLine();
            String[] tokens = buff.split(" ");
            switch(tokens[0])
            {
                case "calc":
                    try {
                        String[] onp = new String[tokens.length - 1];
                        IntStream.range(1, tokens.length).forEach(i -> onp[i - 1] = tokens[i]);
                        double value =
                                new Expression(
                                        onp,
                                        varSet).calculate();
                        out.println(value);
                    } catch (ONPException e) {
                        System.err.println(e.message());
                    }
                    break;
                case "clear":
                    varSet.clear();
                    break;
                case "exit":
                    return;
                default:
                    throw new AssertionError();
            }
        }
    }
}
