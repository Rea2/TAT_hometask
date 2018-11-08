package lesson6.tree_directories;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Raik Yauheni on 08.11.2018.
 */
public class Runner {
    public static final String TAB = "  ";
    public static final String BEGIN = "|--";
    private int counter = 0;



    public static void main(String[] args) {
        new Runner().perform(args[0]);
    }

    public void perform(String arg) {
        printTreeDirectories(getDirectoryTree(new File(arg)));
    }

    public Directory getDirectoryTree(File folder) {
        Directory dir = new Directory(folder.getName());
        Set<FileSystemItem> set = new HashSet<>();
        for (File file : folder.listFiles()) {
            if (file.isDirectory()) {
                set.add(getDirectoryTree(file));
            } else {
                set.add(new FileItem(file.getName()));
            }
        }
        dir.setSetDir(set);
        return dir;
    }

    public void printTreeDirectories(Directory dir) {
        System.out.println(getBeginString(counter) + dir);
        counter++;
        if (dir.getSetDir().size() == 0) return;
        for(FileSystemItem fileSystemItem : dir.getSetDir()){
            if(fileSystemItem instanceof Directory) {
                printTreeDirectories((Directory) fileSystemItem);
            } else System.out.println(getBeginString(counter)+fileSystemItem.toString());
        }
        counter--;
    }

    public String getBeginString (int counter){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= counter; i++){
            sb.append(Runner.TAB);
        }
        return sb.append(Runner.BEGIN).toString();
    }


}

