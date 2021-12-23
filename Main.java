import javax.swing.*;
import java.io.*;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 *  This is a simple example program for STL files viewing with basic affine transforms
 *  @author Tomasz Tatarski 2021
 */
public class Main {


    // public static final String PATH="/private/var/root/Desktop/TPO/STLviewer/src/cube.stl";
    // public static final String PATH="/private/var/root/Desktop/TPO/STLviewer/src/filestl.stl";
   public static final String PATH="/private/var/root/Desktop/TPO/STLviewer/src/Patrix_Reinforced.stl";

    
    public static void main(String[] args) throws IOException {
        
        FileInputStream fis = new FileInputStream(PATH);
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(isr);

        StringBuilder dataContent = new StringBuilder();
        String line;
        String str="";
        List<Triangle> dataArray = new ArrayList<>();
        String name = reader.readLine();

        System.out.println("nazwa pliku  "+ name);
        while((line = reader.readLine()) != null){
            System.out.println(">"+line);
           if (line.contains("vertex")) dataContent.append(line);
        }
        // System.out.println(dataContent);
        str=dataContent.toString();
        System.out.println("=================================");
        //lepiej użyć String[]result ="the example text".split("\\s"); string tokenizer legacy class
        StringTokenizer st = new StringTokenizer(str,"\\s\t ");
        int count=0;
        while (st.hasMoreTokens()){
            count++;
            System.out.print("."+count);
            String[] arr= new String[12];
            arr[0]=st.nextToken();arr[1]=st.nextToken();arr[2]=st.nextToken();arr[3]=st.nextToken();
            arr[4]=st.nextToken();arr[5]=st.nextToken();arr[6]=st.nextToken();arr[7]=st.nextToken();
            arr[8]=st.nextToken();arr[9]=st.nextToken();arr[10]=st.nextToken();arr[11]=st.nextToken();
            dataArray.add(new Triangle
                    (Double.parseDouble(arr[1]),Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),
                            Double.parseDouble(arr[5]),Double.parseDouble(arr[6]),Double.parseDouble(arr[7]),
                            Double.parseDouble(arr[9]),Double.parseDouble(arr[10]),Double.parseDouble(arr[11])));
        }
        System.out.println("======= arraylist ========");
        for (Triangle tri: dataArray
             ) {
            System.out.println(tri.toString());

        }

        //("solid | facet normal | outer loop | vertex | endloop | endfacet")

        SwingUtilities.invokeLater(() -> new TesselationDraw(dataArray,name).setVisible(true));
    }
}
