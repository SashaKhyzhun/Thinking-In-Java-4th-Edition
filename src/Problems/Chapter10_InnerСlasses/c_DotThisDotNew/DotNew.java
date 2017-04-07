package Problems.Chapter10_InnerСlasses.c_DotThisDotNew;

/**
 * Created by SashaKhyzhun on 1/16/17. Page 292
 * Прямое создание объекта внутреннего класса с синтаксисос .new
 */

public class DotNew {

    public class Inner {}

    public static void main(String[] args) {
        DotNew dotNew = new DotNew();
        DotNew.Inner dni = dotNew.new Inner(); // таких приколов я еще не видел ©
    }
}
