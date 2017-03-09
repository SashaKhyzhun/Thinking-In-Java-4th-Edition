package Problems.Chapter13_Strings.k_ScanningTheText;

import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/**
 * Created by SashaKhyzhun on 3/10/17.
 */
public class ThreatAnalyzer {

    static String threatData =
            "58.27.82.161@02/10/2005\n" +
            "204.45.234.40@02/11/2005\n" +
            "58.27.82.161@02/11/2005\n" +
            "58.27.82.161@02/12/2005\n" +
            "58.27.82.161@02/12/2005\n" +
            "[Next log selection with different data format]";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(threatData);
        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@" +
                         "(\\d{2}/\\d{2}/\\d{4})";

        while (scanner.hasNext(pattern)) {
            scanner.next(pattern);
            MatchResult match = scanner.match();
            String ip = match.group(1);
            String date = match.group(2);
            System.out.printf("Threat on %s from %s\n", date, ip);
        }
    }

}
