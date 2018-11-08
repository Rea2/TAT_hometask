package lesson6.tree_directories;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Raik Yauheni on 08.11.2018.
 */
public class FileItem extends FileSystemItem {

    public FileItem(String title) {
        super(title);
    }

    public String toString() {
        return "<" + title + ">";
    }
}
