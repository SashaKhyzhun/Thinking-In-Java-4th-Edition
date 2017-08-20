package Problems.Chapter18_InputOutputSystem.c_FileUtilities;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author SashaKhyzhun on 8/20/17. Page 728.
 */
public class Directory {

    public static File[] local(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
    }

    public static File[] local(String path, final String regex) { // перегружен!
        return local(new File(path), regex);
    }


    // Кортеж для возвращения пары объектов:
    public static class TreeInfo implements Iterable<File> {
        public List<File> files = new ArrayList<>();
        public List<File> dirs = new ArrayList<>();
        // The default iterable element is the file list:
        @Override public Iterator<File> iterator() {
            return files.iterator();
        }

        void addAll(TreeInfo other) {
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }

        @Override public String toString() {
            return "dirs: " + dirs + "\n\nfiles: " + files;
        }
    }

    public static TreeInfo walk(String start, String regex) { // начало рекурсии
        return recurseDirs(new File(start), regex);
    }

    public static TreeInfo walk(File start, String regex) { // перегружен
        return recurseDirs(start, regex);
    }

    public static TreeInfo walk(String start) { // Все
        return recurseDirs(new File(start), ".*");
    }

    static TreeInfo recurseDirs(File startDir, String regex) {
        TreeInfo result = new TreeInfo();
        for (File item : startDir.listFiles()) {
            if (item.isDirectory()) {
                result.dirs.add(item);
                result.addAll(recurseDirs(item, regex));
            } else { // обычный файл
                if (item.getName().matches(regex))
                    result.files.add(item);
            }
        }
        return result;
    }

    // простая проверка:
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(walk("."));
        } else {
            for (String arg : args) {
                System.out.println(walk(arg));
            }
        }
    }


}
