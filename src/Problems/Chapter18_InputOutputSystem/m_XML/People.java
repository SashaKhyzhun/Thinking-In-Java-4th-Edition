//package Problems.Chapter18_InputOutputSystem.m_XML;
//
//import Problems.Chapter14_InfoAboutTypes.j_NullObjects.Person;
//
//import java.util.ArrayList;
//
///**
// * @author SashaKhyzhun on 8/24/17.
// * Page 807
// */
//
//public class People extends ArrayList<Person> {
//    public People(String fileName) throws Exception  {
//        Document doc = new Builder().build(fileName);
//        Elements elements =
//                doc.getRootElement().getChildElements();
//        for(int i = 0; i < elements.size(); i++)
//            add(new Person(elements.get(i)));
//    }
//    public static void main(String[] args) throws Exception {
//        People p = new People("People.xml");
//        System.out.println(p);
//    }
//}