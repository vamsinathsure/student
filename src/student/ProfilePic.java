package student;

import javafx.scene.chart.ScatterChart;

import java.io.*;
public class ProfilePic {
    public static boolean deleteFile(String path){
        boolean f=false;
        try {
            File file=new File(path);
            f=file.delete();
        }
        catch (Exception e){
            e.printStackTrace();
        }


        return f;
    }
    public static boolean saveFile(InputStream is,String path){
        boolean f=false;
        try {

                byte[]b=new byte[is.available()];
                is.read(b);
            FileOutputStream fod=new FileOutputStream(path);
            fod.write(b);
            fod.flush();
            fod.close();
            f=true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }




}
