// Rectangle
//------------
//width: double
//height: double
//--------------
//Rectangle()
//Rectangle(width: double, height: double)
//getArea(): double
//getPerimeter(): double

package exercise09_01;

class Rectangle {
    
    double width = 1;
    double height = 1;
    
    public Rectangle(){
    }
    
    public Rectangle(double width, double height){
    this.width = width;
    this.height = height;
    }
    
    double getArea(){
        return width * height;
    }
    double getPerimeter(){
        return 2 * (width + height);
    }        
}