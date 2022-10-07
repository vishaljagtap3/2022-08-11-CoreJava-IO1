import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String basePath = "/home/vishal/java/demo/";

        //5


        //4
        //File baseDir = new File("/home/vishal/java/");
        //String [] fileNames = baseDir.list(new MyFileNameFilter());
        /*String [] fileNames = baseDir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                System.out.println("Checking .. " + name);
                if(name.startsWith("p") || name.startsWith("P") || name.startsWith("a") ) {
                    return true;
                }
                return false;
            }
        });*/

        /*FilenameFilter filenameFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                System.out.println("Checking .. " + name);
                if(name.startsWith("p") || name.startsWith("P") || name.startsWith("a") ) {
                    return true;
                }
                return false;
            }
        };
        String [] fileNames = baseDir.list(filenameFilter);

        System.out.println();
        for(String fileName : fileNames) {
            System.out.println(fileName);
        }*/


        //3
        /*File baseDir = new File("/home/vishal/java/");
        String [] fileNames = baseDir.list();
        for(String fileName : fileNames) {
            File fileObj = new File(baseDir, fileName);
            System.out.println(fileName + " "
                    + (fileObj.isFile() ? "F" : "D")
                    + " " + fileObj.length()
            );
        }

        System.out.println();

        File [] files = baseDir.listFiles();
        for(File file : files) {
            System.out.println( file.getName() + " "
                    + (file.isFile() ? "F" : "D")
                    + " " + file.length()
            );
        }*/




        //2
        /*File baseDir = new File(basePath);
        if(!baseDir.exists()) {
            baseDir.mkdir();
        }
        //baseDir.mkdir();
        //baseDir.delete();

        File file1 = new File(basePath + "demo1.txt");
        if(!file1.exists()) {
            file1.createNewFile();
        }

        //File file2 = new File(basePath, "demo2.txt");
        File file2 = new File(baseDir, "demo2.txt");
        if(!file2.exists()) {
            file2.createNewFile();
        }*/

        //1
        /*File file1 = new File("/home/vishal/c/workspaces/2022-10-03/main5.c");
        printFileInfo(file1);

        File dir1 = new File("/home/vishal/java");
        printFileInfo(dir1);

        File file2 = new File("/home/vishal/java/demo/myfile.txt");
        printFileInfo(file2);*/
    }

    public static void printFileInfo(File file) {
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length());
        System.out.println("RWE: " + file.canRead() + " " + file.canWrite()  + " " +  file.canExecute());
        System.out.println("Last modified on: " + file.lastModified());
        System.out.println("Parent: " + file.getParent());
        System.out.println("is file: " + file.isFile() + " is dir: " + file.isDirectory());
        System.out.println("is hidden: " + file.isHidden());
        System.out.println("Exists: " + file.exists());
        System.out.println("---------------------------------------------------------------------");
    }

    public static class MyFileNameFilter implements FilenameFilter {

        @Override
        public boolean accept(File dir, String name) {
            System.out.println("Checking .. " + name);
            if(name.startsWith("p") || name.startsWith("P") || name.startsWith("a") ) {
                return true;
            }
            return false;
        }
    }
}
