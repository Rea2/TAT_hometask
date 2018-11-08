package lesson6.tree_directories;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Raik Yauheni on 08.11.2018.
 */
public class Directory extends FileSystemItem {

    private Set<FileSystemItem> setDir = new HashSet();

    public Directory(String title) {
        super(title);
    }

    public Set<FileSystemItem> getSetDir() {
        return setDir;
    }

    public void setSetDir(Set<FileSystemItem> setDir) {
        this.setDir = setDir;
    }

    @Override
    public String toString() {
        return "["+ title+"]";

    }
}

