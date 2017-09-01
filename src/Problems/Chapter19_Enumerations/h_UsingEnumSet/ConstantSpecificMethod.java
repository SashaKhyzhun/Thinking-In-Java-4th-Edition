package Problems.Chapter19_Enumerations.h_UsingEnumSet;

import Problems.Chapter16_Arrays.f_CreatingTestData.RandomGenerator;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author SashaKhyzhun on 9/1/17.
 * Page 828.
 */

public enum ConstantSpecificMethod {
    DATE_TIME {
        String getInfo() {
            return DateFormat.getDateInstance().format(new Date());
        }
    },
    CLASSPATH {
        String getInfo() {
            return System.getenv("CLASSPATH");
        }
    },
    VERSION {
        String getInfo() {
            return System.getProperty("java.version");
        }
        //String getMock() {  return "Mock";  }
    };

    abstract String getInfo();

    //abstract String getMock();

    public static void main(String[] args) {
        for (ConstantSpecificMethod csm : values())
            System.out.println(csm.getInfo());
    }
}