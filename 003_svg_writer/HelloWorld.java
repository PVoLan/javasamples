import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class HelloWorld {

    public static void main(String[] args) {

        //Note the imports above also
        Svg svg = createSvg("hello.svg", 200, 100);

        drawLine(svg, 0, 0, 100, 50, "#0000ff");
        drawPoint(svg, 0, 0, "#ff0000");
        drawPoint(svg, 100, 50, "#00ff00");
        drawPolygon(svg,
                new float[]{10, 70, 70},
                new float[]{10, 10, 30},
                "#ffff00");
        drawText(svg, 100, 50, "Hello!", 20, "#009900");

        closeSvg(svg);
    }


    public static Svg createSvg(String filename, int width, int height){
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            writer.write(String.format(Locale.ROOT, "<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"%d\" height=\"%d\" version=\"1.1\" viewBox=\"0 0 %d %d\">\n",
                    width, height, width, height));
            return new Svg(writer);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static void drawPoint(Svg svg, float x, float y, String color){
        if(svg == null) {
            System.out.println("No SVG presented");
            return;
        }

        try {
            svg.writer.write(String.format(Locale.ROOT, "<circle cx=\"%f\" cy=\"%f\" r=\"1\" fill=\"%s\"/>\n",
                    x, y, color));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void drawLine(Svg svg, float x1, float y1, float x2, float y2, String color){
        if(svg == null) {
            System.out.println("No SVG presented");
            return;
        }

        try {
            svg.writer.write(String.format(Locale.ROOT, "<path d=\"M%f %f L%f %f\" stroke=\"%s\" stroke-width=\"1\" fill=\"none\"/>\n",
                    x1, y1, x2, y2, color));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void drawPolygon(Svg svg, float[] x, float[] y, String color){
        if(svg == null) {
            System.out.println("No SVG presented");
            return;
        }

        if(x.length != y.length) {
            System.out.println("Coordinate arrays should be of equal length");
            return;
        }

        if(x.length < 2) {
            System.out.println("Coordinate arrays should be of length 2 as a minimum");
            return;
        }

        StringBuilder pathData = new StringBuilder();
        pathData.append("M").append(x[0]).append(" ").append(y[0]).append(" ");
        for (int i = 1; i < x.length; i++) {
            pathData.append("L").append(x[i]).append(" ").append(y[i]).append(" ");
        }
        pathData.append("z");

        try {
            svg.writer.write(String.format(Locale.ROOT, "<path d=\"%s\" fill=\"%s\"/>\n",
                    pathData.toString(), color));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void drawText(Svg svg, float x, float y, String text, float fontSize, String color){
        if(svg == null) {
            System.out.println("No SVG presented");
            return;
        }

        try {
            svg.writer.write(String.format(Locale.ROOT, "<text x=\"%f\" y=\"%f\" font-size=\"%f\" fill=\"%s\">%s</text>\n",
                    x, y, fontSize, color, text));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void closeSvg(Svg svg){
        if(svg == null) {
            System.out.println("No SVG presented");
            return;
        }

        try {
            svg.writer.write("</svg>\n");
            svg.writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class Svg {

    public Svg(FileWriter writer) {
        this.writer = writer;
    }

    FileWriter writer;
}



