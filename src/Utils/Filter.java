package Utils;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class Filter extends FileFilter{
    
    private String fileExt;
    private String fileDescript;
    
    public Filter(String fileExt, String fileDesc){
        this.fileExt = fileExt;
        fileDescript = fileDesc;
    }

    @Override
    public boolean accept(File f) { // Разрешить только папки, а также файлы с расширением mp3
        return f.isDirectory() || f.getAbsolutePath().endsWith(fileExt);
    }

    @Override
    public String getDescription() { // отображает формат mp3 при выборе в диалоговом окне
        return fileDescript + " (*."+fileExt+")";
    }
    
}
