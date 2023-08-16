import java.util.Optional;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


enum MyColor{
    TRANSPARENT(0, 0, 0, 0),
    ALICEBLUE(240, 248, 255, 255),
    ANTIQUEWHITE(250, 235, 215, 255),
    AQUA(0, 255, 255, 255),
    AQUAMARINE(127, 255, 212, 255),
    AZURE(240, 255, 255, 255),
    BEIGE(245, 245, 220, 255),
    BISQUE(255, 228, 196, 255),
    BLACK(0, 0, 0, 255),
    BLANCHEDALMOND(255, 235, 205, 255),
    BLUE(0, 0, 255, 255),
    BLUEVIOLET(138, 43, 226, 255),
    BROWN(165, 42, 42, 255),
    BURLYWOOD(222, 184, 135, 255),
    CADETBLUE(95, 158, 160, 255),
    CHARTREUSE(127, 255, 0, 255),
    CHOCOLATE(210, 105, 30, 255),
    CORAL(255, 127, 80, 255),
    CORNFLOWERBLUE(100, 149, 237, 255),
    CORNSILK(255, 248, 220, 255),
    CRIMSON(220, 20, 60, 255),
    CYAN(0, 255, 255, 255),
    DARKBLUE(0, 0, 139, 255),
    DARKCYAN(0, 139, 139, 255),
    DARKGOLDENROD(184, 134, 11, 255),
    DARKGRAY(169, 169, 169, 255),
    DARKGREEN(0, 100, 0, 255),
    DARKGREY(169, 169, 169, 255),
    DARKKHAKI(189, 183, 107, 255),
    DARKMAGENTA(139, 0, 139, 255),
    DARKOLIVEGREEN(85, 107, 47, 255),
    DARKORANGE(255, 140, 0, 255),
    DARKORCHID(153, 50, 204, 255),
    DARKRED(139, 0, 0, 255),
    DARKSALMON(233, 150, 122, 255),
    DARKSEAGREEN(143, 188, 143, 255),
    DARKSLATEBLUE(72, 61, 139, 255),
    DARKSLATEGRAY(47, 79, 79, 255),
    DARKSLATEGREY(47, 79, 79, 255),
    DARKTURQUOISE(0, 206, 209, 255),
    DARKVIOLET(148, 0, 211, 255),
    DEEPPINK(255, 20, 147, 255),
    DEEPSKYBLUE(0, 191, 255, 255),
    DIMGRAY(105, 105, 105, 255),
    DIMGREY(105, 105, 105, 255),
    DODGERBLUE(30, 144, 255, 255),
    FIREBRICK(178, 34, 34, 255),
    FLORALWHITE(255, 250, 240, 255),
    FORESTGREEN(34, 139, 34, 255),
    FUCHSIA(255, 0, 255, 255),
    GAINSBORO(220, 220, 220, 255),
    GHOSTWHITE(248, 248, 255, 255),
    GOLD(255, 215, 0, 255),
    GOLDENROD(218, 165, 32, 255),
    GRAY(128, 128, 128, 255),
    GREY(128, 128, 128, 255),
    GREEN(0, 128, 0, 255),
    GREENYELLOW(173, 255, 47, 255),
    HONEYDEW(240, 255, 240, 255),
    HOTPINK(255, 105, 180, 255),
    INDIANRED(205, 92, 92, 255),
    INDIGO(75, 0, 130, 255),
    IVORY(255, 255, 240, 255),
    KHAKI(240, 230, 140, 255),
    LAVENDER(230, 230, 250, 255),
    LAVENDERBLUSH(255, 240, 245, 255),
    LAWNGREEN(124, 252, 0, 255),
    LEMONCHIFFON(255, 250, 205, 255),
    LIGHTBLUE(173, 216, 230, 255),
    LIGHTCORAL(240, 128, 128, 255),
    LIGHTCYAN(224, 255, 255, 255),
    LIGHTGOLDENRODYELLOW(250, 250, 210, 255),
    LIGHTGRAY(211, 211, 211, 255),
    LIGHTGREEN(144, 238, 144, 255),
    LIGHTGREY(211, 211, 211, 255),
    LIGHTPINK(255, 182, 193, 255),
    LIGHTSALMON(255, 160, 122, 255),
    LIGHTSEAGREEN(32, 178, 170, 255),
    LIGHTSKYBLUE(135, 206, 250, 255),
    LIGHTSLATEGRAY(119, 136, 153, 255),
    LIGHTSLATEGREY(119, 136, 153, 255),
    LIGHTSTEELBLUE(176, 196, 222, 255),
    LIGHTYELLOW(255, 255, 224, 255),
    LIME(0, 255, 0, 255),
    LIMEGREEN(50, 205, 50, 255),
    LINEN(250, 240, 230, 255),
    MAGENTA(255, 0, 255, 255),
    MAROON(128, 0, 0, 255),
    MEDIUMAQUAMARINE(102, 205, 170, 255),
    MEDIUMBLUE(0, 0, 205, 255),
    MEDIUMORCHID(186, 85, 211, 255),
    MEDIUMPURPLE(147, 112, 219, 255),
    MEDIUMSEAGREEN(60, 179, 113, 255),
    MEDIUMSLATEBLUE(123, 104, 238, 255),
    MEDIUMSPRINGGREEN(0, 250, 154, 255),
    MEDIUMTURQUOISE(72, 209, 204, 255),
    MEDIUMVIOLETRED(199, 21, 133, 255),
    MIDNIGHTBLUE(25, 25, 112, 255),
    MINTCREAM(245, 255, 250, 255),
    MISTYROSE(255, 228, 225, 255),
    MOCCASIN(255, 228, 181, 255),
    NAVAJOWHITE(255, 222, 173, 255),
    NAVY(0, 0, 128, 255),
    OLDLACE(253, 245, 230, 255),
    OLIVE(128, 128, 0, 255),
    OLIVEDRAB(107, 142, 35, 255),
    ORANGE(255, 165, 0, 255),
    ORANGERED(255, 69, 0, 255),
    ORCHID(218, 112, 214, 255),
    PALEGOLDENROD(238, 232, 170, 255),
    PALEGREEN(152, 251, 152, 255),
    PALETURQUOISE(175, 238, 238, 255),
    PALEVIOLETRED(219, 112, 147, 255),
    PAPAYAWHIP(255, 239, 213, 255),
    PEACHPUFF(255, 218, 185, 255),
    PERU(205, 133, 63, 255),
    PINK(255, 192, 203, 255),
    PLUM(221, 160, 221, 255),
    POWDERBLUE(176, 224, 230, 255),
    PURPLE(128, 0, 128, 255),
    REBECCAPURPLE(102, 51, 153, 255),
    RED(255, 0, 0, 255),
    ROSYBROWN(188, 143, 143, 255),
    ROYALBLUE(65, 105, 225, 255),
    SADDLEBROWN(139, 69, 19, 255),
    SALMON(250, 128, 114, 255),
    SANDYBROWN(244, 164, 96, 255),
    SEAGREEN(46, 139, 87, 255),
    SEASHELL(255, 245, 238, 255),
    SIENNA(160, 82, 45, 255),
    SILVER(192, 192, 192, 255),
    SKYBLUE(135, 206, 235, 255),
    SLATEBLUE(106, 90, 205, 255),
    SLATEGRAY(112, 128, 144, 255),
    SLATEGREY(112, 128, 144, 255),
    SNOW(255, 250, 250, 255),
    SPRINGGREEN(0, 255, 127, 255),
    STEELBLUE(70, 130, 180, 255),
    TAN(210, 180, 140, 255),
    TEAL(0, 128, 128, 255),
    THISTLE(216, 191, 216, 255),
    TOMATO(255, 99, 71, 255),
    TURQUOISE(64, 224, 208, 255),
    VIOLET(238, 130, 238, 255),
    WHEAT(245, 222, 179, 255),
    WHITE(255, 255, 255, 255),
    WHITESMOKE(245, 245, 245, 255),
    YELLOW(255, 255, 0, 255),
    YELLOWGREEN(154, 205, 50, 255);

    private int r;
    private int g;
    private int b;
    private int a;
    private String rgba;


    MyColor(int red, int grn, int blu, int opa){
        setR(red);
        setG(grn);
        setB(blu);
        setA(opa);
        setRGBA();
    }

    public void setR(int red){
        if (red >= 0 && red <= 255){
            this.r = red;
        } else {
            this.r = 0;
        }
    }
    
    public void setG(int grn){
        if (grn >= 0 && grn <= 255){
            this.g = grn;
        } else {
            this.g = 0;
        }
    }

    public void setB(int blu){
        if (blu >= 0 && blu <= 255){
            this.b = blu;
        } else {
            this.b = 0;
        }
    }

    public void setA(int opa){
        if (opa >= 0 && opa <= 255){
            this.a = opa;
        } else {
            this.a = 0;
        }
    }

    public void setRGBA(){
        int o = GetA();
        int r = GetR();
        int g = GetG();
        int b = GetB();
        String ohex = String.format("%02X", (0xFF & o));
        String rhex = String.format("%02X", (0xFF & r));
        String ghex = String.format("%02X", (0xFF & g));
        String bhex = String.format("%02X", (0xFF & b));
        String rgbalower = rhex + ghex + bhex + ohex;
        String newrgba = "0x" + rgbalower.toUpperCase();
        this.rgba = newrgba;
    }

    public int GetR(){
        return r;
    }

    public int GetG(){
        return g;
    }

    public int GetB(){
        return b;
    }

    public int GetA(){
        return a;
    }

    public String GetRGBA(){ //returns STRING of the rgba hex
        return this.rgba;

    }
    public Color GetJavaFXColor() { 
        return Color.valueOf(this.GetRGBA());
    }
}

class MyPoint{
    private double x;
    private double y;
    private MyColor color;

    public MyPoint(){//default constructor
        Set_x(0); 
        Set_y(0);
        Set_MyColor(MyColor.BLACK);
    }
    public MyPoint(double x_input, double y_input, MyColor newcolor){//parametrized constructor
        Set_x(x_input);
        Set_y(y_input);
        Set_MyColor(Optional.ofNullable(newcolor).orElse(MyColor.BLACK));
    }
    public MyPoint(double x_input, double y_input){//parametrized constructor
        Set_x(x_input);
        Set_y(y_input);
        Set_MyColor(MyColor.BLACK);
    }
    public MyPoint(MyPoint tocopy){
        Set_x(tocopy.Get_x());
        Set_y(tocopy.Get_y());
        Set_MyColor(tocopy.Get_MyColor());
    }

    public double Get_x(){
        return this.x;
    }
    public double Get_y(){
        return this.y;
    }
    public MyColor Get_MyColor(){
        return this.color;
    }
    public void Set_x(double xnew){
        this.x = xnew;
    }
    public void Set_y(double ynew){
        this.y = ynew;
    }
    public void Set_MyColor(MyColor newcolor){
        this.color = newcolor;
    }
    public static MyPoint Add(MyPoint A, MyPoint B){ //adding: point A + point B
        MyPoint sum = new MyPoint(A.Get_x() + B.Get_x(), A.Get_y() + B.Get_y());
        return sum;
    }
    public static MyPoint Sub(MyPoint A, MyPoint B){ //subtracting: point A - point B
        MyPoint dif = new MyPoint(A.Get_x() - B.Get_x(), A.Get_y() - B.Get_y());
        return dif;
    }
    public static String StringPt(MyPoint print){
        return "(" + print.Get_x() + ", " + print.Get_y() + ")";
    }
    public void draw(GraphicsContext GC){
        GC.setFill(this.Get_MyColor().GetJavaFXColor()); 
        GC.fillRect(this.Get_x(), this.Get_y(), 1, 1);
    }
}

class MyShape extends Object{
    private MyPoint p;
    private MyColor color;

    //MyShape Constructors
    public MyShape(){
        Set_Point(new MyPoint());
        Set_MyColor(MyColor.BLACK); 
    }

    public MyShape(MyPoint t, MyColor newcolor){
        Set_Point(t);
        Set_MyColor(Optional.ofNullable(newcolor).orElse(MyColor.BLACK));
    }

    public MyShape(MyPoint t){
        Set_Point(t);
        Set_MyColor(MyColor.BLACK);
    }

    public MyShape(int x, int y, MyColor newcolor){
        this.p.Set_x(x);
        this.p.Set_y(y);
        Set_MyColor(Optional.ofNullable(newcolor).orElse(MyColor.BLACK));
    }

    public MyShape(int x, int y){
        Set_Point(new MyPoint());
        Get_Point().Set_x(x);
        Get_Point().Set_y(y);
        Set_MyColor(MyColor.BLACK);
    }

    public MyShape(MyShape tocopy){
        Set_Point(tocopy.Get_Point());
        Set_MyColor(tocopy.Get_MyColor());
    }

    public void Set_Point(MyPoint newp){
        this.p = newp;
    }
    public void Set_MyColor(MyColor newc){
        this.color = newc;
    }

    public MyPoint Get_Point() {
        return this.p;
    }

    public MyColor Get_MyColor(){
        return this.color;
    }

    public double perimeter(){
        return 0;
    }

    public double area(){
        return 0;
    }

    public void draw(GraphicsContext GC){ //this is why every other subclass of MyShape has a separate color, because color in MyShape defines canvas color
        GC.setFill(this.Get_MyColor().GetJavaFXColor()); 
        GC.fillRect(0, 0, GC.getCanvas().getWidth(), GC.getCanvas().getHeight()); //draws canvas a certain color
    }

    public String toString(){

        return "MyShape Object: Reference Point" + MyPoint.StringPt(Get_Point());
    }
}

class MyLine extends MyShape{
    private MyPoint p1;
    private MyPoint p2;
    private MyColor color;

    public MyLine(){
        super(new MyPoint(), null);
        Set_Point1(new MyPoint());
        Set_Point2(new MyPoint());
        Set_MyColor(MyColor.BLACK); 
    }

    public MyLine(MyPoint point1, MyPoint point2, MyColor newcolor){
        super(new MyPoint(), null);
        Set_Point1(point1);
        Set_Point2(point2);
        Set_MyColor(Optional.ofNullable(newcolor).orElse(MyColor.BLACK));
    }

    public MyLine(MyPoint point1, MyPoint point2){
        super(new MyPoint(), null);
        Set_Point1(point1);
        Set_Point2(point2);
        Set_MyColor(MyColor.BLACK);
    }

    public MyLine(MyLine tocopy) {
        super(new MyPoint(), null);
        Set_Point1(tocopy.Get_Point1());
        Set_Point2(tocopy.Get_Point2());
        Set_MyColor(tocopy.Get_MyColor());
    }

    public double xAngle(){
        double angle = Math.toDegrees(Math.atan2(this.Get_Point1().Get_y() - this.Get_Point2().Get_y(), this.Get_Point1().Get_x() - this.Get_Point2().Get_x())) - 180; //-180 because angle is measure from negative x axis to line in JavaFX canvas, which I dont want, I want from pos x axis
        if (angle < 0){
            return angle + 360.0;
        } else {
            return angle;
        }
    }
    
    @Override
    public MyColor Get_MyColor(){
        return this.color;
    }

    public MyLine Get_Line(){
        return this;
    }
    public MyPoint Get_Point1(){
        return this.p1;
    }
    public MyPoint Get_Point2(){
        return this.p2;
    }
    @Override
    public double perimeter(){
        return 0; //line doesn't have perimeter
    }

    @Override
    public double area(){
        return 0;
    }

    public double length(){
        return Math.sqrt(Math.pow(this.p2.Get_x() - this.p1.Get_x(), 2) + Math.pow(this.p2.Get_y() - this.p1.Get_y(), 2));
    }
    
    public void Set_Point1(MyPoint newp){
        this.p1 = newp;
    }
    public void Set_Point2(MyPoint newp){
        this.p2 = newp;
    }
    public void Set_MyColor(MyColor c){
        this.color = c;
    }
    @Override
    public String toString(){
        Double x1 = this.p1.Get_x();
        Double x2 = this.p2.Get_x();
        Double y1 = this.p1.Get_y();
        Double y2 = this.p2.Get_y();
        Double len = this.length();
        Double angl = this.xAngle(); 
        return "Line info: Endpoint 1: (" + x1.toString() + ", " + y1.toString() + ") Endpoint 2: (" + x2.toString() + ", " + y2.toString() + ")" + " Length: " + len.toString() + " Angle from line to x-axis: " + angl.toString() + ".";
    }

    @Override
    public void draw(GraphicsContext GC){
        GC.setStroke(this.Get_MyColor().GetJavaFXColor());
        GC.setLineWidth(1);
        GC.strokeLine(Get_Point1().Get_x(), Get_Point1().Get_y(), Get_Point2().Get_x(), Get_Point2().Get_y());
    }
}

class MyRectangle extends MyShape{
    private double h; 
    private double w;
    private MyPoint TLCP;
    private MyColor color;
    
    public MyRectangle(){
        super(new MyPoint(), null);
        Set_Height(0);
        Set_Width(0);
        Set_TLCP(new MyPoint());
        Set_MyColor(MyColor.BLACK);
    }
    public MyRectangle(double height, double width, MyPoint newTLCP, MyColor newcolor){
        super(new MyPoint(), null);
        Set_Height(height);
        Set_Width(width);
        Set_TLCP(newTLCP);
        Set_MyColor(Optional.ofNullable(newcolor).orElse(MyColor.BLACK));
    }

    public MyRectangle(double height, double width, MyPoint newTLCP){
        super(new MyPoint(), null);
        Set_Height(height);
        Set_Width(width);
        Set_TLCP(newTLCP);
        Set_MyColor(MyColor.BLACK);
    }

    public MyRectangle(MyRectangle tocopy){
        super(new MyPoint(), null);
        Set_Height(tocopy.Get_Height());
        Set_Width(tocopy.Get_Width());
        Set_TLCP(tocopy.Get_TLCP());
        Set_MyColor(MyColor.BLACK);
    }

    public double Get_Height(){
        return this.h;
    }
    public double Get_Width(){
        return this.w;
    }
    public MyPoint Get_TLCP(){
        return this.TLCP;
    }
    @Override
    public MyColor Get_MyColor(){
        return this.color;
    }
    public void Set_Height(double height){
        this.h = height;
    }
    public void Set_Width(double width){
        this.w = width;
    }
    public void Set_TLCP(MyPoint newTLCP){
        this.TLCP = newTLCP;
    }
    @Override
    public void Set_MyColor(MyColor newColor){
        this.color = newColor;
    }
    @Override
    public double perimeter(){
        return (2 * this.Get_Height()) + (2 * this.Get_Width());
    }
    @Override
    public double area(){
        return (this.Get_Height() * this.Get_Width());
    }

    @Override
    public String toString(){
        Double x1 = this.Get_TLCP().Get_x();
        Double y1 = this.Get_TLCP().Get_y();
        Double width = this.Get_Width();
        Double height = this.Get_Height();
        Double perim = this.perimeter();
        Double area = this.area();
        return "Rectangle info: TLCP: (" + x1.toString() + ", " + y1.toString() + ") Width: " + width.toString() + "Height: " + height.toString() + "Perimeter: " + perim.toString() + "Area: " + area.toString() + ".";
    }

    @Override
    public void draw(GraphicsContext GC){
        GC.setFill(this.Get_MyColor().GetJavaFXColor()); 
        GC.fillRect(Get_TLCP().Get_x(), Get_TLCP().Get_y(), Get_Width(), Get_Height());
    }
}

class MyOval extends MyShape{
    private double h; 
    private double w;
    private MyPoint cntr;
    private MyColor color;

    public MyOval(){
        super(new MyPoint(), null);
        Set_Height(0);
        Set_Width(0);
        Set_Cntr(new MyPoint());
        Set_MyColor(MyColor.BLACK);
    }
    public MyOval(double height, double width, MyPoint center, MyColor newcolor){
        super(new MyPoint(), null);
        Set_Height(height);
        Set_Width(width);
        Set_Cntr(center);
        Set_MyColor(Optional.ofNullable(newcolor).orElse(MyColor.BLACK));
    }
    public MyOval(double height, double width, MyPoint center){
        super(new MyPoint(), null);
        Set_Height(height);
        Set_Width(width);
        Set_Cntr(center);
        Set_MyColor(MyColor.BLACK);
    }
    public MyOval(MyOval tocopy){
        super(new MyPoint(), null);
        Set_Height(tocopy.Get_Height());
        Set_Width(tocopy.Get_Width());
        Set_Cntr(tocopy.Get_Center());
        Set_MyColor(tocopy.Get_MyColor());
    }
    public MyPoint Get_Center(){
        return this.cntr;
    }
    public double Get_Height(){
        return this.h;
    }
    public double Get_Width(){
        return this.w;
    }
    public double Get_SemiMinorAxis(){
        if (this.Get_Height() < this.Get_Width()){
            return this.Get_Height();
        } else {
            return this.Get_Width();
        }
    }
    public double Get_SemiMajorAxis(){
        if (this.Get_Height() > this.Get_Width()){
            return this.Get_Height();
        } else {
            return this.Get_Width();
        }
    }
    @Override
    public MyColor Get_MyColor(){
        return this.color;
    }

    public void Set_Height(double height){
        this.h = height;
    }
    public void Set_Width(double width){
        this.w = width;
    }
    @Override
    public void Set_MyColor(MyColor newcolor){
        this.color = newcolor;
    }
    public void Set_Cntr(MyPoint newcntr){
        this.cntr = newcntr;
    }

    @Override
    public double perimeter(){ //using approx formula for elipse perimeter 
        return Math.PI * (((3/2)*((this.Get_SemiMinorAxis()) + (this.Get_SemiMajorAxis()))) - Math.sqrt(((this.Get_SemiMinorAxis()) * (this.Get_SemiMajorAxis()))));
    }
    @Override
    public double area(){
        return Math.PI * (this.Get_SemiMinorAxis()) * (this.Get_SemiMajorAxis());
    }

    @Override
    public String toString(){
        Double semiminoraxis = this.Get_SemiMinorAxis();
        Double semimajoraxis = this.Get_SemiMajorAxis();
        Double minoraxis = this.Get_SemiMinorAxis() * 2;
        Double majoraxis = this.Get_SemiMajorAxis() * 2;
        Double perimeter = this.perimeter();
        Double area = this.area();
        Double x = this.Get_Center().Get_x();
        Double y = this.Get_Center().Get_y();
        return "Oval info: Semi Minor Axis Length: " + semiminoraxis.toString() + " Semi Major Axis Length: " + semimajoraxis.toString() + " Minor Axis Length: " + minoraxis.toString() + " Major Axis Length: " + majoraxis.toString() + " Perimeter: " + perimeter.toString() + " Area: " + area.toString() + " Center: (" + x.toString() + ", " + y.toString() + ").";
    }

    @Override
    public void draw(GraphicsContext GC){
        GC.setFill(this.Get_MyColor().GetJavaFXColor());
        GC.fillOval(this.Get_Center().Get_x() - (this.Get_Width()/2), this.Get_Center().Get_y() - (this.Get_Height()/2),this.Get_Width(), this.Get_Height());
    }
}

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.WHITE); 
        Stage stage = new Stage();
        Canvas canvas = new Canvas(600, 600);
        GraphicsContext GC = canvas.getGraphicsContext2D();
        MyPoint center = new MyPoint(GC.getCanvas().getWidth()/2, GC.getCanvas().getHeight()/2);
        MyPoint TLCPouter = new MyPoint(center.Get_x() - GC.getCanvas().getWidth()/3, center.Get_y() - GC.getCanvas().getHeight()/4);
        MyPoint BLCPouter = new MyPoint(center.Get_x() - GC.getCanvas().getWidth()/3, center.Get_y() + GC.getCanvas().getHeight()/4);
        MyPoint BRCPouter = new MyPoint(center.Get_x() + GC.getCanvas().getWidth()/3, center.Get_y() + GC.getCanvas().getHeight()/4);
        MyPoint TRCPouter = new MyPoint(center.Get_x() + GC.getCanvas().getWidth()/3, center.Get_y() - GC.getCanvas().getHeight()/4);
        MyPoint TLCPinner1 = new MyPoint(center.Get_x() - GC.getCanvas().getWidth()/4.5, center.Get_y() - GC.getCanvas().getHeight()/6); 
        MyLine outercrossline = new MyLine(TLCPouter, BRCPouter);
        MyLine outerrectl1 = new MyLine(TLCPouter, TRCPouter);
        MyLine outerrectl2 = new MyLine(TLCPouter, BLCPouter);
        MyLine outerrectl3 = new MyLine(BRCPouter, TRCPouter);
        MyLine outerrectl4 = new MyLine(BLCPouter, BRCPouter);
        MyRectangle inner1 = new MyRectangle(outerrectl2.length()/1.5, outerrectl4.length()/1.5, TLCPinner1, MyColor.BLANCHEDALMOND); //division of coordinates also is what you divide the length of inner rectangle by. if i divide coords from mid by 1.5 times the original rectangle, the new rectangle height and width will be divided by the same value of the coordinates used to divide
        MyOval inner1o = new MyOval(outerrectl2.length()/1.5, outerrectl4.length()/1.5, center, MyColor.LIME);
        MyPoint TLCPinner2 = new MyPoint(center.Get_x() - ((inner1o.Get_Width()/2 * Math.sqrt(2))/2), center.Get_y() - ((inner1o.Get_Height()/2 * Math.sqrt(2))/2)); //h/2 and w/2 bc i need half of them (A is the length from middle to the end of the ellipse on the xaxis, while B is len from middle to end of ellipse on the yaxis) and divide by 2 again because i need half the height and half the width of the rectangle to right the top left corner point of the rectangle
        MyRectangle inner2 = new MyRectangle(inner1o.Get_Height()/2 * Math.sqrt(2), inner1o.Get_Width()/2 * Math.sqrt(2), TLCPinner2, MyColor.DARKORCHID);
        MyOval inner2o = new MyOval(inner2.Get_Height(), inner2.Get_Width(), center, MyColor.YELLOW);
        MyPoint TLCPinner3 = new MyPoint(center.Get_x() - ((inner2o.Get_Width()/2 * Math.sqrt(2))/2), center.Get_y() - ((inner2o.Get_Height()/2 * Math.sqrt(2))/2));
        MyRectangle inner3 = new MyRectangle(inner2o.Get_Height()/2 * Math.sqrt(2), inner2o.Get_Width()/2 * Math.sqrt(2), TLCPinner3, MyColor.BURLYWOOD);
        MyOval inner3o = new MyOval(inner3.Get_Height(), inner3.Get_Width(), center, MyColor.GREY);
        
        inner1.draw(GC);
        inner1o.draw(GC);
        inner2.draw(GC);
        inner2o.draw(GC);
        inner3.draw(GC);
        inner3o.draw(GC);
        outerrectl1.draw(GC);
        outerrectl2.draw(GC);
        outerrectl3.draw(GC);
        outerrectl4.draw(GC);
        outercrossline.draw(GC);

        stage.setScene(scene);
        root.getChildren().add(canvas);
        stage.show();

        
    }
}
