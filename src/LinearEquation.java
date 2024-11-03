

public class LinearEquation {


    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private double slope;
    private double yIntercept;
    private int ySub;
    private int xSub;



    public LinearEquation(int x1 , int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }




    public double distance(){
        double x = Math.pow(x2-x1 , 2);
        double y = Math.pow(y2-y1 , 2);
        return roundedToHundredth(Math.sqrt(x + y));
    }




    public double yIntercept(){
        slope = slope();
        double yIntercept = y1 - (slope * x1);
        return roundedToHundredth(yIntercept);
    }




    public double slope(){
//        double fractionSlope = work at making this fraction
        slope = (double) (y2 - y1) / (x2 - x1);
         ySub = (y2 - y1);
         xSub = (x2- x1);

        return roundedToHundredth(slope); // return as fraction later
    }




    public String equation() {


        if (x1 == x2) {
            return "x = " + x1;
        }


        if (y1 == y2) {
            return "y = " + y1;
        }


        int ySub = y2 - y1;
        int xSub = x2 - x1;
        yIntercept = yIntercept();



        String slopeStr = "";
        double slope = (double) ySub / xSub;


        if (ySub % xSub == 0) {

            slopeStr = (int) slope + "";

            if (slope == 1) {
                slopeStr = "x";
                return "y= " + "x" + " + " + yIntercept;
            } else if (slope == -1) {
                slopeStr = "-x";
                return "y=" + " -x" + " + " +  yIntercept;

            }
        } else {

            if (ySub < 0 && xSub < 0) {
                slopeStr = (-ySub) + "/" + (-xSub);
            } else if (ySub < 0) {
                slopeStr = "-" + (-ySub) + "/" + xSub;
            } else if (xSub < 0) {
                slopeStr = "-" + ySub + "/" + (-xSub);
            } else {
                slopeStr = ySub + "/" + xSub;
            }
        }


        double yIntercept = yIntercept();


        String yInterceptStr = "";
        if (yIntercept == 0) {
            yInterceptStr = "";
        } else if (yIntercept < 0) {
            yInterceptStr = " - " + (-yIntercept);


        }
        else {
            yInterceptStr = " + " + yIntercept;
        }



        String equation = "y = " + slopeStr + "x" + yInterceptStr;


        if (slopeStr.equals("")) {
            return "y = " + yInterceptStr.substring(3);
        }

        if (yInterceptStr.equals("")) {
            return "y = " + slopeStr + "x";
        }


       return  equation;

    }


        public String coordinateForX (double x){
            double y = slope * x + yIntercept;
            return "(" + x + "," + y + ")";
        }


    public String lineInfo() {
        if (x1 == x2) {
            return "This leads to a vertical Line!";
        } else {
            System.out.println("The two points are (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")");
            System.out.println("The equation of the line is " + equation());
            System.out.println("The slope of the line is " + slope());
            System.out.println("The y-intercept of the line is " + yIntercept());
            return "The distance between these two points is " + distance();
        }
    }


        private double roundedToHundredth(double toRound){
            double roundedInt = Math.round(toRound * 100) / 100.0;
            return roundedInt;
        }




}






