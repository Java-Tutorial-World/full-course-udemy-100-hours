public class Wall {
    private double width;
    private double height;

    public Wall(){

    }

    public Wall(double width, double height){
        this.width = width;
        this.height = height;

        if( this.width < 0 ){
            this.width = 0;
        }else
            this.width = width;
        if ( this.height < 0){
            this.height = 0;
        }else
            this.height = height;
    }

    public double getWidth(){

        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){
        this.width = width;
        System.out.println((width < 0) ? this.width = 0 : width);
//        if ( width < 0){
//            this.width = 0;
//        }else
//            System.out.println(width);
    }

    public void setHeight(double height){
        this.height = height;
        System.out.println((height < 0) ? this.height = 0 : height);
//        if ( height < 0){
//            this.height = 0;
//        }else
//            System.out.println(height);

    }

    public double getArea (){

        if (this.height > 0 && this.width > 0){

            return ((this.width * this.height) );
        }
        return 0;
    }
}
